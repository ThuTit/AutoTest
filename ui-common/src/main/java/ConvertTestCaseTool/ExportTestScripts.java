/***
 * This clase is use to create JAVA file from XML and Excel files
 * 
 * Has following functions:
 * 
 * 1. Read data( test case's name, preconditions, ID Cases,..) from a existed XML file that is exported from TestLink
 * 2. Read scripts from Excel files
 * 3. Write data at step 1 and 2 to a new JAVA file under a new Package
 * 
 * Date create: 28/06/2017
 * Date update: 10/07/2017
 */

package ConvertTestCaseTool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.Assert;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ExportTestScripts {

	static Workbook workbook;
	private static Sheet scriptSheet;
	private static Sheet locatorSheet;
	private static File xmlFile;
	
	private static ArrayList<String> nameList;
	private static ArrayList<String> idCaseList;
	private static ArrayList<String> preconditionList;
	private static ArrayList<String> excutionTypeList;
	private static ArrayList<String> importanceList;
	private static ArrayList<String> actionsList;
	private static ArrayList<String> expectResultList;
	
	private static ArrayList<String> nameCaseList;
	private static ArrayList<String> testCommandList;
	private static ArrayList<String> objectList;
	private static ArrayList<String> parametersList;
	private static ArrayList<String> commandsList;
	private static ArrayList<String> optionParamList;
	private static ArrayList<String> valueList;
	private static ArrayList<Integer> numbStepsStart;
	private static ArrayList<Integer> numbStepsEnd;
	
	private static ArrayList<String> nameLocatorList;
	private static ArrayList<String> locatorList;
	
	// Sheet chứa test scripts trong file excel
    private static int ID_SCRIPT_SHEET = 0;
	// Row bắt đầu đọc trong file excel
	private static int START_ROW = 1;
	//Cột Name trong file Excel
	private static int COL_NAMECASE = 0;
	//Cột Test command trong file Excel
	private static int COL_TESTCOMMAND = 1;
	//Cột Object trong file Excel
	private static int COL_OBJECT = 2;
	//Cột Parameters trong file Excel
	private static int COL_PARAMTERS = 3;
	//Cột Commands trong file Excel
	private static int COL_COMMANDS = 4;
	//Cột Option parameters trong file Excel
	private static int COL_OPTIONPARAM = 5;
	//Cột Value trong file Excel
	private static int COL_VALUE = 6;
	
	private static String NAME_LOCATOR_SHEET ="Locator";
	private static int COL_NAME_LOCATOR = 0;
	private static int COL_LOCATOR = 1;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Test cases' folder
		String directoryInputFile = "F:/AutoWorks/TestCase/";
		// Test cases file
		String fileNameXML = "Warehouse_HomePage.xml"; // xml file
		
		// Test scripts file
		String fileNameExcel = "KeywordDriven_TestScripts.xlsx"; // can be .xls or .xlsx
		//Tên class của suite test		
		String className = "High_System_Test_Home_Page";
		
		String classLocatorName = "Page_Locator";
		
		// New package's name
		String packageName = "com.selenium.warehouse.system.testing.high";
		String packageLocatorName = "com.selenium.warehouse.locator";
		// The directory for saving the new class
		String directoryOfjavaFile = "F:/AutoWorks/auto-test/ui-warehouse/src/test/java";
		String directoryLocatorOfjavaFile = "F:/AutoWorks/auto-test/ui-warehouse/src/main/java";
        //Đọc test scripts từ Excel file
		addDataFromExcelToArrayList(directoryInputFile,fileNameExcel,ID_SCRIPT_SHEET);
		//Write test scripts thành JAVA file
		createLocatorClass(directoryInputFile,fileNameExcel,classLocatorName,packageLocatorName,directoryLocatorOfjavaFile);
		convertToJavaFile(directoryInputFile, fileNameXML, packageName, className,classLocatorName,
				directoryOfjavaFile,packageLocatorName);
	}
	
	/**
	 * Create a workbook
	 * 
	 * @param inputStream
	 * @param excelFilePath
	 * @return
	 * @throws IOException
	 */
	private static Workbook getWorkbook(FileInputStream inputStream,
			String excelFilePath) throws IOException {
		Workbook workbook = null;

		if (excelFilePath.endsWith("xlsx")) {
			workbook = new XSSFWorkbook(inputStream);
		} else if (excelFilePath.endsWith("xls")) {
			workbook = new HSSFWorkbook(inputStream);
		} else {
			throw new IllegalArgumentException(
					"The specified file is not Excel file");
		}

		return workbook;
	}

	/**
	 * Hàm lấy data của từng cột trong sheet Script từ file excel
	 * 
	 * @param col
	 * @return getData
	 */
	public static ArrayList<String> getDataByColumnRow(int col) {
		ArrayList<String> getData = new ArrayList<String>();
		for (int i = START_ROW; i <=scriptSheet.getLastRowNum(); i++) {
			Row row = scriptSheet.getRow(i);
			Cell cell=null;
			if(row!=null){
				  cell = row.getCell(col);
				  DataFormatter formatter = new DataFormatter();
					if(cell!=null) {
						if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
							String value = String.valueOf((int) Math.round(cell
									.getNumericCellValue()));
							if (value!=null)
								getData.add(value);
						} else {
							cell.setCellType(1);
							String value = formatter.formatCellValue(cell);
							if(value==null || value.isEmpty() || value.length()<=0){
								cell.setCellValue("null");
							}
							if (value!=null) {
								getData.add(value);
							}
						}
					}
			}
		}
		return getData;

	}
	
	/**
	 * Hàm lấy data của từng cột trong sheet Locator từ file excel
	 * 
	 * @param col
	 * @return getData
	 */
	public static ArrayList<String> getDataLocator(int col) {
		ArrayList<String> getData = new ArrayList<String>();
		for (int i = START_ROW; i <=locatorSheet.getLastRowNum(); i++) {
			Row row = locatorSheet.getRow(i);
			Cell cell=null;
			if(row!=null){
				cell = row.getCell(col);
				  DataFormatter formatter = new DataFormatter();
					if(cell!=null) {
						if (cell.getCellType() == org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) {
							String value = String.valueOf((int) Math.round(cell
									.getNumericCellValue()));
							if (value!=null)
								getData.add(value);
						} else {
							cell.setCellType(1);
							String value = formatter.formatCellValue(cell);
							if(value==null || value.isEmpty() || value.length()<=0){
								cell.setCellValue("null");
							}
							if (value!=null) {
								getData.add(value);
							}
						}
					}
			}
		}
		return getData;

	}

	/**
	 * Reading excel file
	 * 
	 * @param directoryInputFile
	 * @param fileName
	 * @param packageName
	 * @param directoryOfjavaFile
	 * @throws IOException
	 */
	public static void addDataFromExcelToArrayList(String directoryInputFile,
			String fileName,int sheetId) throws IOException {
		FileInputStream inputStream = new FileInputStream(new File(
				directoryInputFile + fileName));
		workbook = getWorkbook(inputStream, fileName);
		scriptSheet = workbook.getSheetAt(sheetId);
		int sheetLocatorIndex=workbook.getSheetIndex(NAME_LOCATOR_SHEET);
		locatorSheet =workbook.getSheetAt(sheetLocatorIndex);

		nameCaseList = new ArrayList<String>();
		testCommandList = new ArrayList<String>();
		objectList = new ArrayList<String>();
		valueList = new ArrayList<String>();
		numbStepsStart = new ArrayList<Integer>();
		numbStepsEnd = new ArrayList<Integer>();
		
		nameLocatorList = new ArrayList<String>();
		locatorList = new ArrayList<String>();
		
		ArrayList<String> list = new ArrayList<String>();
		// lấy dữ liệu cột Name
        list = getDataByColumnRow(COL_NAMECASE);
        for(int i=0;i<list.size();i++){
        	if(!list.get(i).isEmpty())
        		nameCaseList.add(list.get(i));
        }
        System.out.print("list:"+list);
		// lấy dữ liệu cột Test Command
		testCommandList = getDataByColumnRow(COL_TESTCOMMAND);
		for(int i=0;i<testCommandList.size();i++){
			if (testCommandList.get(i).startsWith("Start")) {
				numbStepsStart.add(i);
			}else if(testCommandList.get(i).startsWith("End")){
				numbStepsEnd.add(i);
			}
        }
		// lấy dữ liệu cột Object
		objectList = getDataByColumnRow(COL_OBJECT);
		// lấy dữ liệu cột Parameters
		parametersList = getDataByColumnRow(COL_PARAMTERS);
		// lấy dữ liệu cột Commands
		commandsList = getDataByColumnRow(COL_COMMANDS);
		// Lấy dữ liệu cột Option Paramters
		optionParamList = getDataByColumnRow(COL_OPTIONPARAM);
		// lấy dữ liệu cột Value
		valueList = getDataByColumnRow(COL_VALUE);

		//lấy dữ liệu cột tên Element trong sheet locator
		nameLocatorList = getDataLocator(COL_NAME_LOCATOR);
		//Lấy dữ liệu cột locator trong sheet locator
		locatorList = getDataLocator(COL_LOCATOR);
	}
	/**
	 * Read test case from XML file
	 * @param directoryInputFile
	 * @param fileName
	 */
	private static void readTestCaseFromXMLFile(String directoryInputFile,String fileName){
		System.out.println("Starting reading test case from XML file........");
		nameList = new ArrayList<String>();
		preconditionList = new ArrayList<String>();
		excutionTypeList = new ArrayList<String>();
		importanceList = new ArrayList<String>();
		actionsList = new ArrayList<String>();
		expectResultList = new ArrayList<String>();
		idCaseList = new ArrayList<String>();
		
		xmlFile = new File(directoryInputFile + fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		// Read data from XML file to ArrayLists
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("testcase");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					String name = eElement.getAttribute("name");
					String idCase = eElement
							.getElementsByTagName("fullexternalid").item(0)
							.getTextContent();
					String pre = eElement.getElementsByTagName("preconditions")
							.item(0).getTextContent();
					String type = eElement
							.getElementsByTagName("execution_type").item(0)
							.getTextContent();
					String impor = eElement.getElementsByTagName("importance")
							.item(0).getTextContent();

					if (impor.equals("1")) {
						impor = "Low";
					} else if (impor.equals("2")) {
						impor = "Medium";
					} else {
						impor = "High";
					}
					if (type.equals("2")) {
						type = "Automated";
					} else
						type = "Manual";

					nameList.add(name);
					idCaseList.add(idCase);
					preconditionList.add(pre);
					excutionTypeList.add(type);
					importanceList.add(impor);
				}
			}

			NodeList nListStep = doc.getElementsByTagName("step");
			for (int temp = 0; temp < nListStep.getLength(); temp++) {
				Node nNode = nListStep.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String actions = eElement.getElementsByTagName("actions")
							.item(0).getTextContent();
					String expectedresults = eElement
							.getElementsByTagName("expectedresults").item(0)
							.getTextContent();

					actionsList.add(actions);
					expectResultList.add(expectedresults);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Ending reading test case from XML file........");
	}
	/**
	 * Create locator class
	 * @param className
	 * @param packageName
	 * @param directoryOfjavaFile
	 */
	private static void createLocatorClass(String directoryInputFile,
			String fileName,String className,String packageName,String directoryOfjavaFile){
		// Write data to JAVA file
		File fileDir = new File(directoryInputFile + fileName);
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(
				new FileInputStream(fileDir), "UTF8"))) {

			String packagePath = packageName.replace(".", "/");
			String javaOutputDirPath = directoryOfjavaFile + "/" + packagePath
					+ "/";
			System.out.println("creating directory ->" + javaOutputDirPath);
			File f = new File(javaOutputDirPath);
			
			if (f.mkdirs()) {
				System.out.println("directory :" + javaOutputDirPath
						+ " created succesfully..");
			} else {
				System.out.println("directory :" + javaOutputDirPath
						+ " already exist..");
			}
			
			String javaOutputFilePath = directoryOfjavaFile + "/" + packagePath
					+ "/" + className + ".java";
			File javaOutPutFile = new File(javaOutputFilePath);
			javaOutPutFile.createNewFile();
			
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(javaOutPutFile), "UTF8"));
			
			
			System.out.println("generating class..");
			out.append("package " + packageName + ";\r\n");
			out.append("import org.selenium.common.UnitBase;\r\n");
			out.append("\t\t\r\n\r\n");
			out.append("public class " + className + " extends UnitBase {\r\n\r\n");
			
			for(int i=0;i<nameLocatorList.size();i++){
				out.append("\t\tpublic final String "+nameLocatorList.get(i)
						+"=\""+locatorList.get(i)+"\";\r\n");
			}
			out.append("\t\t\r\n\r\n");
			out.append("}");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reading excel file
	 * 
	 * @param directoryInputFile
	 * @param fileName
	 * @param packageName
	 * @param directoryOfjavaFile
	 * @throws IOException
	 */
	public static void convertToJavaFile(String directoryInputFile,
			String fileName, String packageName, String className,String classLocatorName,
			String directoryOfjavaFile,String packageLocatorName) throws IOException {
		
		System.out.println("Starting converting........");
		
		readTestCaseFromXMLFile(directoryInputFile, fileName);
		
		// Get number of test cases
		ArrayList<Integer> numbCases = new ArrayList<Integer>();
		for (int i = 0; i < actionsList.size(); i++) {
			if (actionsList.get(i).startsWith("1")) {
				numbCases.add(i);
			}
		}

		// Write data to JAVA file
		try (BufferedReader stream = new BufferedReader(new InputStreamReader(
				new FileInputStream(xmlFile), "UTF8"))) {

			String packagePath = packageName.replace(".", "/");
			String javaOutputDirPath = directoryOfjavaFile + "/" + packagePath
					+ "/";
			System.out.println("creating directory ->" + javaOutputDirPath);
			File f = new File(javaOutputDirPath);
			
			if (f.mkdirs()) {
				System.out.println("directory :" + javaOutputDirPath
						+ " created succesfully..");
			} else {
				System.out.println("directory :" + javaOutputDirPath
						+ " already exist..");
			}
			
			String javaOutputFilePath = directoryOfjavaFile + "/" + packagePath
					+ "/" + className + ".java";
			File javaOutPutFile = new File(javaOutputFilePath);
			javaOutPutFile.createNewFile();
			
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(javaOutPutFile), "UTF8"));
			
			
			System.out.println("generating class..");
			out.append("package " + packageName + ";\r\n");
			out.append("import org.testng.annotations.Test;\r\n");
			out.append("import com.selenium.warehouse.common.ManageLogInOut;\r\n");
			out.append("import com.selenium.warehouse.common.Configuration;\r\n");
			out.append("import "+packageLocatorName+"."+classLocatorName+";\r\n");
			out.append("import org.testng.annotations.BeforeMethod;\r\n");
			out.append("import org.testng.annotations.AfterMethod;\r\n");
			out.append("import static org.selenium.common.TestLogger.info;\r\n");
			out.append("\r");
			out.append("public class " + className + " extends "+classLocatorName+" {\r\n\r\n");
			out.append("\t\t\n");
			out.append("\t\t"+classLocatorName+" locator;\r\n");
			out.append("\t\tManageLogInOut mgLogInOut;\r\n");
			out.append("\t\tConfiguration config;\r\n");
			out.append("\t\t\n");
            out.append("\t\t@BeforeMethod\r\n");
            out.append("\t\tpublic void setUpBeforeMethod() throws Exception{\r\n");
            out.append("\t\t\t info(\"Start setUpBeforeMethod\");\r\n");
            out.append("\t\t\t initSeleniumTest();\r\n");
            out.append("\t\t\t mgLogInOut = new ManageLogInOut(driver);\r\n");
            out.append("\t\t\t locator = new "+classLocatorName+"();\r\n");
            out.append("\t\t\t config = new Configuration();\r\n");
            out.append("\t\t\t info(\"End setUpBeforeMethod\");\r\n");
            out.append("\t\t }\r\n\r\n");
            
            out.append("\t\t@AfterMethod\r\n");
            out.append("\t\tpublic void afterMethod(){\r\n");
            out.append("\t\t\t info(\"Start afterMethod\");\r\n");
            out.append("\t\t\t driver.manage().deleteAllCookies();\r\n");
            out.append("\t\t\t driver.quit();\r\n");
            out.append("\t\t\t info(\"End afterMethod\");\r\n");
            out.append("\t\t }\r\n\r\n");
            
            System.out.print("nameCaseList:"+nameCaseList+"\n");
            System.out.print("idCaseList:"+idCaseList+"\n");
            
            System.out.print("testCommand:"+testCommandList.size()+"\n");
            System.out.print("Object:"+objectList.size()+"\n");
            System.out.print("prammeter:"+parametersList.size()+"\n");
            System.out.print("commands:"+commandsList.size()+"\n");
            System.out.print("option:"+optionParamList.size()+"\n");
            System.out.print("value:"+valueList.size()+"\n");
            
            
            if(idCaseList.size()!=nameCaseList.size())
            	assert false:"Số lượng test case không giống nhau";
            
			for (int i = 0; i < numbCases.size(); i++) {
				int indx = numbCases.get(i);
				String name = nameList.get(i);
				String id = idCaseList.get(i);
				String precod = preconditionList.get(i);
				String importance = importanceList.get(i);
				String execution_type = excutionTypeList.get(i);
				String textTitle = upperCaseAllFirst(name);
				
				out.append("\t\t\n");
				out.append("\t\t/**" + "\n");
				out.append("\t\t* Test ID:" + id + "\r\n");
				out.append("\t\t* Test case name:" + textTitle + "\r\n");
				out.append("\t\t* Importance:" + importance + "\r\n");
				out.append("\t\t* Execution Type:" + execution_type + "\r\n");
				out.append("\t\t* Precondition:\r\n");
				out.append("\t\t* " + precod + "\r\n");
				out.append("\t\t* Test Steps:" + "\r\n");
				
				if (indx < numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < numbCases.get(i + 1); k++) {
						out.append("\t\t* " + actionsList.get(k) + "\r\n");
					}
				}
				if (indx == numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < actionsList.size(); k++) {
						out.append("\t\t* " + actionsList.get(k) + "\r\n");
					}
				}
				out.append("\t\t* Expected Result:" + "\r\n");
				if (indx < numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < numbCases.get(i + 1); k++) {
						out.append("\t\t* " + expectResultList.get(k) + "\r\n");
					}
				}
				if (indx == numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < actionsList.size(); k++) {
						out.append("\t\t* " + expectResultList.get(k) + "\r\n");
					}
				}
				
				out.append("\t\t*/\n");
				out.append("\t\t@Test\n");
				out.append(
						"\t\tpublic void "
								+ id.replace("-", "_")
								+ "_"
								+ textTitle.replace(" ", "").replace("\"", "")
										.replace("'", "").replace("/", "")
										.replace("-", "").replace("[", "")
										.replace("]", "") + "(){" + "\n")
						.append("\t\t\t info(\""+name+"\");\n")
						.append("\t\t\t testCaseID=\""+id+"\";\n");
				out.append("\t\t\t mgLogInOut.login(TESTER_01,USER_PASS);\n");
				
				if(objectList.size()==optionParamList.size() && testCommandList.size()==valueList.size()
						&& objectList.size()==testCommandList.size()){
					
					if(nameCaseList.get(i).equals(id)){
						
						int idxStart = numbStepsStart.get(i);
						System.out.print("idxStart:"+idxStart+"\n");
						
						int idxEnd = numbStepsEnd.get(i);
						System.out.print("idxEnd:"+idxEnd+"\n");
						
						for(int j=idxStart+1;j<=idxEnd;j++){
							
							String testCommand = testCommandList.get(j);
							String object = objectList.get(j);
							String parameters =parametersList.get(j);
							String commands = commandsList.get(j);
							String option = optionParamList.get(j);
							String value = valueList.get(j);
							
							if(testCommand.equals("End"))
								break;
							
							append(out,testCommand,object,parameters,commands,option,value);
						}
				     }else{
				    	 Assert.fail("Id Test Case trong file XML và EXCEL không giống nhau");
				     }
				}else {
					Assert.fail("Hãy kiểm tra lại file excel của bạn. Các mảng dữ liệu có kích thước không bằng nhau.");
				}
				
				
				out.append("\t\t}\n");
			}
			out.append("}");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("generating class is finished..");
	}

	/**
	 * Convert test case's name to UpperCase letter
	 * 
	 * @param value
	 * @return array
	 */
	private static String upperCaseAllFirst(String value) {
		char[] array = value.toCharArray();
		for (int i = 0; i < array.length; i++) {
			// Uppercase the first letter if it is not upperCase
			if (!(Character.isUpperCase(array[0])))
				array[0] = Character.toUpperCase(array[0]);
			// Uppercase all remain letters that follow a whitespace character
			if (i > 0 && Character.isWhitespace(array[i - 1])) {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		// Result.
		return new String(array);
	}
	
	/**
	 * Hàm in lệnh
	 * @param out
	 * @param testCommand
	 * @param object
	 * @param parameters
	 * @param commands
	 * @param option
	 * @param value
	 * @throws IOException
	 */
	private static void append(Writer out,String testCommand,String object,String parameters,
			String commands,String option,String value) throws IOException{
		if(testCommand!=""){
			if(!object.isEmpty()){
				 if(!option.isEmpty()){
					if(!value.isEmpty()){
						out.append("\t\t\t "+testCommand+"(locator."+object+","+value.trim()+","+option+");\n");
					}else{
						out.append("\t\t\t "+testCommand+"(locator."+object+","+option+");\n");
					}	
				}else{
					if(!value.isEmpty()){
						out.append("\t\t\t "+testCommand+"(locator."+object+","+value.trim()+");\n");
					}else{
						out.append("\t\t\t "+testCommand+"(locator."+object+");\n");
					}
				}
			}else{
				if(!parameters.isEmpty()){
					if(!commands.isEmpty()){
						out.append("\t\t\t "+testCommand+" "+parameters+"="+commands+";\n");
					}
					if(!value.isEmpty()){
						out.append("\t\t\t "+testCommand+" "+parameters+"=\""+value.trim()+"\";\n");
					}
				}else{
					if(!value.isEmpty()){
						out.append("\t\t\t "+testCommand+"(\""+value.trim()+"\");\n");
					}else{
						if(option.isEmpty()&& commands.isEmpty())
							out.append("\t\t\t "+testCommand+"();\n");
					}
				}
			}
		}else{
			assert false:"Bạn phải chọn lệnh test.";
		}
		
	}
}

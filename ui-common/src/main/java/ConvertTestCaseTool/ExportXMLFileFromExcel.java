/***
 * This clase is use to create XML file from EXCEL file
 * 
 * that is based on Test Case Template of QC team
 * 
 * Has following functions:
 * 
 * 1. Read data( test case's name, preconditions, ID Cases,..) 
 * 
 * from a existed EXCEL file
 * 
 * 2. Write data at step 1 to a new XML file by XML template of TestLink tool
 * 
 * Date create: 22/06/2017
 * Date update: 23/06/2017
 */

package ConvertTestCaseTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportXMLFileFromExcel {
	static Workbook workbook;
	private static Sheet firstSheet;
	private static ArrayList<String> nameList;
	private static ArrayList<String> preconditionList;
	private static ArrayList<String> excutionTypeList;
	private static ArrayList<String> importanceList;
	private static ArrayList<String> actionsList;
	private static ArrayList<String> expectResultList;

	//Chọn sheet
	private static int SHEET_INDEX = 1;
	// Row bắt đầu đọc
	private static int START_ROW =9;
	// Row cuối cùng để đọc
	private static int END_ROW =71;
	// Index của cột Title trong Test case template
	private static int COL_NAME = 1;
	// index của cột Precondition trong TC template
	private static int COL_PRECONDITION = 2;
	// index của cột Execution Type trong TC template
	private static int COL_EXECUTION_TYPE = 7;
	// index của cột Priority trong TC template
	private static int COL_IMPORTANCE = 6;
	// index của cột Action trong TC template
	private static int COL_ACTION = 3;
	// index của cột Expected Result trong TC template
	private static int COL_EXPECTED_RESULT = 4;

	public static void main(String[] args) throws IOException {
		System.out.print("Start converting.....\n");
		// Test cases' folder
		String directoryInputFile = "F:/AutoWorks/TestCase/";
		// Test cases file
		// tên file excel có thể là .xls or .xlsx chứa test case để convert
		String fileName = "SM_SystemTestCase_P1.xlsx";
		// tên file xml được tạo thành để import vào TestLink
		String xmlFile = "SM_SystemTestCase_P1.xml";
		// hàm dùng để convert từ excel sang xml file
		convertToXmlFile(directoryInputFile, fileName, xmlFile,SHEET_INDEX);
		System.out.print("Finished converting.....\n");
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
	 * Hàm lấy data của từng cột trong file excel
	 * 
	 * @param col
	 * @return getData
	 */
	public static ArrayList<String> getDataByColumnRow(int col) {
		ArrayList<String> getData = new ArrayList<String>();
		for (int i = START_ROW; i <= END_ROW; i++) {
			Row row = firstSheet.getRow(i);
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
	 * Hàm convert từ file excel sang xml file
	 * 
	 * @param directoryInputFile
	 * @param fileName
	 * @param xmlFile
	 * @param sheetId
	 * @throws IOException
	 */
	public static void convertToXmlFile(String directoryInputFile,
			String fileName, String xmlFile, int sheetId) throws IOException {
		File fileDir = new File(directoryInputFile + xmlFile);
		FileInputStream inputStream = new FileInputStream(new File(
				directoryInputFile + fileName));
		workbook = getWorkbook(inputStream, fileName);
		firstSheet = workbook.getSheetAt(sheetId);

		nameList = new ArrayList<String>();
		preconditionList = new ArrayList<String>();
		excutionTypeList = new ArrayList<String>();
		importanceList = new ArrayList<String>();
		actionsList = new ArrayList<String>();
		expectResultList = new ArrayList<String>();

		// lấy dữ liệu cột Title
		nameList = getDataByColumnRow(COL_NAME);
		// lấy dữ liệu cột Precondition
		preconditionList = getDataByColumnRow(COL_PRECONDITION);
		// lấy dữ liệu cột Execution Type
		excutionTypeList = getDataByColumnRow(COL_EXECUTION_TYPE);
		// lấy dữ liệu cột Priority
		importanceList = getDataByColumnRow(COL_IMPORTANCE);
		// Lấy dữ liệu cột Actions
		actionsList = getDataByColumnRow(COL_ACTION);
		// Lấy dữ liệu cột Expected Result
		expectResultList = getDataByColumnRow(COL_EXPECTED_RESULT);

		// lấy số lượng test cases
		ArrayList<Integer> numbCases = new ArrayList<Integer>();
		for (int i = 0; i < actionsList.size(); i++) {
			if (actionsList.get(i).startsWith("1")) {
				numbCases.add(i);
			}
		}
		System.out.print("numbCases:"+numbCases.size()+"\n");
		System.out.print("nameList:"+nameList.size()+"\n");
		System.out.print("actionsList:"+actionsList.size()+"\n");
		System.out.print("expectResultList:"+expectResultList.size()+"\n");
		System.out.print("numbCases:"+numbCases+"\n");
		System.out.print("nameList:"+nameList+"\n");
		System.out.print("actionsList:"+actionsList+"\n");
		System.out.print("expectResultList:"+expectResultList+"\n");
		System.out.print("preconditionList:"+preconditionList+"\n");
		try {
			TestCasesList listOfTestcases = new TestCasesList();
			String name = "";
			String preconditions = "";
			String execution_type = "";
			String importance = "";
			String action = "";
			String stepNumber = "";
			String expecResult = "";
			for (int i = 0; i < numbCases.size(); i++) {
				System.out.print("i:"+i+"\n");
				int indx = numbCases.get(i);
				System.out.print("indx:"+indx+"\n");
				name = nameList.get(indx);
				String node_order = "";
				String externalid = "";
				String version = "";
				String summary = "";
				if(preconditionList.size()>0)
				   preconditions = preconditionList.get(indx);
				if(excutionTypeList.size()>0)
				execution_type = excutionTypeList.get(indx);
				if(importanceList.size()>0)
				importance = importanceList.get(indx);

				// Create a test case
				TestCaseFormat cdata = new TestCaseFormat();
				cdata.setAttributeInter("");
				cdata.setAttributeName(name);
				cdata.setNodeOrder(node_order);
				cdata.setExternalid(externalid);
				cdata.setVersion(version);
				cdata.setSummary(summary);
				cdata.setPreconditions(preconditions);
				cdata.setExecutionType(execution_type);
				cdata.setImportance(importance);
				StepsList listOfSteps = new StepsList();

				if (indx < numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < numbCases.get(i + 1); k++) {
						// Create steps
						action = actionsList.get(k);
						if(!action.trim().equals("")){
							stepNumber = String.valueOf(action.substring(0).charAt(
									0));
							expecResult = expectResultList.get(k);
							StepFormat cstep = new StepFormat();
							cstep.setStepNumber(stepNumber);
							cstep.setActions(action);
							cstep.setExpectedResults(expecResult);
							cstep.setExecution_type(execution_type);
							// Add steps to Steps list
							listOfSteps.add(cstep);
						}
					}
				}
				if (indx == numbCases.get(numbCases.size() - 1)) {
					for (int k = indx; k < actionsList.size(); k++) {
						// Create steps
						action = actionsList.get(k);
						if(!action.trim().equals("")){
							stepNumber = String.valueOf(action.substring(0).charAt(
									0));
							expecResult = expectResultList.get(k);
							StepFormat cstep = new StepFormat();
							cstep.setStepNumber(stepNumber);
							cstep.setActions(action);
							cstep.setExpectedResults(expecResult);
							cstep.setExecution_type(execution_type);
							// Add steps to Steps list
							listOfSteps.add(cstep);
						}
					}
				}

				// Add steps list to a test case
				cdata.add(listOfSteps);
				listOfTestcases.add(cdata);
			}
			

			// Create xml file and print on the screen
			JAXBContext jaxbContext = JAXBContext
					.newInstance(TestCasesList.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING,
					"UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			StringWriter stringWritter = new StringWriter();
			marshaller.marshal(listOfTestcases, stringWritter);
			
			stringWritter.toString().replaceAll("&lt;", "<").replaceAll("&gt;", ">");
			System.out.println(stringWritter.toString().replaceAll("&lt;", "<").replaceAll("&gt;", ">"));
		
			FileWriter fw = new FileWriter(fileDir);
			fw.write(stringWritter.toString().replaceAll("&lt;", "<").replaceAll("&gt;", ">"));
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.print("numbCases:"+numbCases.size()+"\n");
	}

}

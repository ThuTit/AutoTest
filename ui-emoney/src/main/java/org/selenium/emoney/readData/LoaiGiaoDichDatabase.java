package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;
import static org.selenium.common.TestLogger.info;
import org.selenium.readData.DatabaseResource;
public class LoaiGiaoDichDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> type;

	/**
	 * Define list
	 * @param index
	 * @param type
	 */
	public LoaiGiaoDichDatabase(ArrayList<Integer> index,ArrayList<String> type){
		this.index = index;
		this.type= type;
	}

	/**
	 * Define list by array
	 */
	public LoaiGiaoDichDatabase(){
		index = new ArrayList<Integer>();
		type  = new ArrayList<String>();
	}

	/**
	 * Read list from file or DB
	 * @param userDataFile
	 * @param userSheet
	 * @param opParams
	 * @throws Exception
	 */
	public void setData(String userDataFile, String userSheet, Object... opParams) throws Exception{
		String[][] testData = DatabaseResource.getDataFromSource(userDataFile,userSheet,opParams);
		for(int i = 0; i<testData.length; i++)
		{	
			index.add(Integer.valueOf(testData[i][0]));
			type.add(testData[i][1]);
		}
	}

	/**
	 * Get name with random array type
	 * @param type
	 * @return namePermission
	 */
	public String getMessageByArrayTypeRandom(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.type.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String name = arrayName.get(index);
		info("Name is: "+name);
		return name;
	}
	
}

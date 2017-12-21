package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

import static org.selenium.common.TestLogger.info;
public class TrangThaiGiaoDichDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> status;

	/**
	 * Define list
	 * @param index
	 * @param status
	 */
	public TrangThaiGiaoDichDatabase(ArrayList<Integer> index,ArrayList<String>status){
		this.index = index;
		this.status= status;
	}

	/**
	 * Define list by array
	 */
	public TrangThaiGiaoDichDatabase(){
		index = new ArrayList<Integer>();
		status  = new ArrayList<String>();
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
			status.add(testData[i][1]);
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
					arrayName.add(this.status.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String name = arrayName.get(index);
		info("Name is: "+name);
		return name;
	}
	
}

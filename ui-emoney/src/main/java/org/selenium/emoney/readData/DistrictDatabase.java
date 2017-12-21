package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

import static org.selenium.common.TestLogger.info;
public class DistrictDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> name;
	public ArrayList<String> code;
	

	/**
	 * Define list
	 * @param index
	 * @param code
	 * @param name
	 */
	public DistrictDatabase(ArrayList<Integer> index,ArrayList<String> code,ArrayList<String> name){
		
		this.index=index;
		this.code=code;
		this.name=name;
	}

	/**
	 * Define list by array
	 */
	public DistrictDatabase(){
		this.index=new ArrayList<Integer>();
		this.code=new ArrayList<String>();
		this.name=new ArrayList<String>();
	}
	

	/**
	 * Read list from file or DB
	 * @param userDataFile
	 * @param userSheet
	 * @param opParams
	 * @throws Exception
	 */
	public void setData(String userDataFile, String userSheet, Object... opParams) throws Exception{
		info("setData1");
		String[][] testData = DatabaseResource.getDataFromSource(userDataFile,userSheet,opParams);
		info("setData2:"+testData.length);
		for(int i = 0; i<testData.length; i++)
		{	
			index.add(Integer.valueOf(testData[i][0]));
			code.add(testData[i][1]);
			name.add(testData[i][2]);
			info("name:"+testData[i][2]);
		}
	}

	/**
	 * Get index by random
	 * @param indx
	 * @return index1
	 */
	public int getIndexRandom(int indx){
		Random randomGenerator = new Random();
		int index1 =indx;
		while(indx==index1){
			index1 = randomGenerator.nextInt(this.index.size());
			info("index1:"+index1);
		}
		info("indx:"+indx);
		return index1;
	}

	/**
	 * Get name by random
	 * @param currentName
	 * @return newName
	 */
	public String getNameRandom(String currentName){
		Random randomGenerator = new Random();
		String searchName=currentName;
		int indexSearch=0;
		while(currentName.equals(searchName)){
			indexSearch = randomGenerator.nextInt(this.name.size());
			searchName = this.name.get(indexSearch);
			if(!currentName.equals(searchName)){
				info("searchName:"+searchName);
				break;
			}
		}
		
		return searchName;
	}
	
	/**
	 * Get name random
	 * @return nameRandom
	 */
	public String getNameRandom(){
		Random randomGenerator = new Random();
		info("this.name.size:"+this.name.size());
		int index = randomGenerator.nextInt(this.name.size());
		String nameRandom = this.name.get(index);
		return nameRandom;
	}
}

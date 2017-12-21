package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

import static org.selenium.common.TestLogger.info;
public class PermissionDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> name;
	public ArrayList<Integer> indexDelete;

	/**
	 * Define permission list
	 * @param index
	 * @param name
	 * @param indexDelete
	 */
	public PermissionDatabase(ArrayList<Integer> index, ArrayList<String> name,ArrayList<Integer> indexDelete){
		this.name = name;
		this.index = index;
		this.indexDelete = indexDelete;
	}

	/**
	 * Define permission list by array
	 */
	public PermissionDatabase(){
		index  = new ArrayList<Integer>();
		indexDelete  = new ArrayList<Integer>();
		name  = new ArrayList<String>();
	}

	/**
	 * Read permission list from file or DB
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
			name.add(testData[i][1]);
			indexDelete.add(Integer.valueOf(testData[i][2]));
		}
	}

	/**
	 * Get name permission group by index
	 * @param index
	 * @return name
	 */
	public String getNameByIndex(int index){
		return name.get(index);
	}
	
	/**
	 * Get name permission group by random index
	 * @return namePer
	 */
	public String getNameRandom(){
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(this.name.size());
		String namePer = this.name.get(index);
		return namePer;
	}

	/**
	 * get name's array by type
	 * @param type
	 * @return arrayName
	 */
	public ArrayList<String> getArrayNameByType(int type){
		ArrayList<String> arrayName = new ArrayList<String>();
		for(int i = 0; i<this.index.size(); i++)
		{	
			if(this.index.get(i) == type) {
				arrayName.add(this.name.get(i));
			}
		}
		return arrayName;
	}
	/**
	 * Get name's arry by type to delete
	 * @param type
	 * @return arrayName
	 */
	public ArrayList<String> getArrayNameDeleteByType(int type){
		ArrayList<String> arrayName = new ArrayList<String>();
		for(int i = 0; i<this.indexDelete.size(); i++)
		{	
			if(this.indexDelete.get(i) == type) {
				arrayName.add(this.name.get(i));
			}
		}
		return arrayName;
	}

	/**
	 * Get name by array type
	 * @param type
	 * @return arrayName
	 */
	public ArrayList<String> getArrayNameByArrayType(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.name.get(i));
				}
			}
		}
		return arrayName;
	}

	/**
	 * Get name with random array type
	 * @param type
	 * @return namePermission
	 */
	public String getNameByArrayTypeRandom(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.name.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String namePermission = arrayName.get(index);
		info("Name is: "+namePermission);
		return namePermission;
	}
}

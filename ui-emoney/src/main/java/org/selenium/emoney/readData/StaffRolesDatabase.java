package org.selenium.emoney.readData;
import java.util.ArrayList;

import org.selenium.readData.DatabaseResource;
public class StaffRolesDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> roles;
	

	/**
	 * Define list
	 * @param index
	 * @param roles
	 */
	public StaffRolesDatabase(ArrayList<Integer> index,ArrayList<String> roles){
		this.index=index;
		this.roles=roles;
	}

	/**
	 * Define list by array
	 */
	public StaffRolesDatabase(){
		this.index=new ArrayList<Integer>();
		this.roles=new ArrayList<String>();
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
			roles.add(testData[i][1]);
		}
	}

	
	/**
	 * Get array list name with random array type
	 * @param col
	 * @param type
	 * @return arrayName
	 */
	public ArrayList<String> getByArrayTypeRandom(int... type){
		ArrayList<String> arrayName = new ArrayList<String>();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j])
						arrayName.add(this.roles.get(i));
			}
		}
		return arrayName;
	}
	
}

package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

import static org.selenium.common.TestLogger.info;
public class AuthorizedPersonDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> name;
	public ArrayList<String> identification;
	public ArrayList<String> identification_date;
	public ArrayList<String> identification_issue_address;
	public ArrayList<String> phone_number;
	

	/**
	 * Define list
	 * @param index
	 * @param identification
	 * @param name
	 * @param identification_date
	 * @param identification_issue_address
	 * @param phone_number
	 */
	public AuthorizedPersonDatabase(ArrayList<Integer> index,ArrayList<String> identification,ArrayList<String> name,
			ArrayList<String> identification_date,ArrayList<String> identification_issue_address,ArrayList<String> phone_number){
		
		this.index=index;
		this.name=name;
		this.identification=identification;
		this.identification_date=identification_date;
		this.identification_issue_address=identification_issue_address;
		this.phone_number=phone_number;
	}

	/**
	 * Define list by array
	 */
	public AuthorizedPersonDatabase(){
		this.index=new ArrayList<Integer>();
		this.identification=new ArrayList<String>();
		this.name=new ArrayList<String>();
		this.identification_date=new ArrayList<String>();
		this.identification_issue_address=new ArrayList<String>();
		this.phone_number=new ArrayList<String>();
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
			name.add(testData[i][1]);
			identification.add(testData[i][2]);
			identification_date.add(testData[i][3]);
			identification_issue_address.add(testData[i][4]);
			phone_number.add(testData[i][5]);
		}
	}
	
	public enum fieldsAuthor{
		index,
		name,
		identification,
		identification_date,
		identification_issue_address,
		phone_number;
	}

	
	/**
	 * Get name with random array type
	 * @param col
	 * @param type
	 * @return name
	 */
	public String getByArrayTypeRandom(fieldsAuthor col,int... type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					switch(col){
					case name:
						arrayName.add(this.name.get(i));
						break;
					case identification:
						arrayName.add(this.identification.get(i));
						break;
					case identification_date:
						arrayName.add(this.identification_date.get(i));
						break;
					case identification_issue_address:
						arrayName.add(this.identification_issue_address.get(i));
						break;
					case phone_number:
						arrayName.add(this.phone_number.get(i));
						break;
					default:
						break;
					}
					
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String name = arrayName.get(index);
		return name;
	}

	/**
	 * Get name by random
	 * @param currentID
	 * @return searchID
	 */
	public String getIdentificationRandom(String currentID){
		Random randomGenerator = new Random();
		String searchID=currentID;
		int indexSearch=0;
		if(searchID!=null){
			while(currentID.equals(searchID)){
				indexSearch = randomGenerator.nextInt(this.identification.size());
				searchID = this.identification.get(indexSearch);
				if(!currentID.equals(searchID)){
					info("searchID:"+searchID);
					break;
				}
			}
		}else {
			indexSearch = randomGenerator.nextInt(this.identification.size());
			searchID = this.identification.get(indexSearch);
		}
		
		return searchID;
	}
}

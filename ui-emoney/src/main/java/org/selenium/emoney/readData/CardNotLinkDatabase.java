package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

public class CardNotLinkDatabase {
	public ArrayList<String> card_no;
	public ArrayList<String> card_status;
	public ArrayList<String> issue_date;

	/**
	 * Define list
	 * @param card_no
	 * @param card_status
	 * @param issue_date
	 */
	public CardNotLinkDatabase(ArrayList<String> card_no,ArrayList<String> card_status,ArrayList<String> issue_date){
		this.card_no=card_no;
		this.card_status=card_status;
		this.issue_date=issue_date;
		
	}

	/**
	 * Define list by array
	 */
	public CardNotLinkDatabase(){
		this.card_no=new ArrayList<String>();
		this.card_status=new ArrayList<String>();
		this.issue_date=new ArrayList<String>();
	}
	
	public enum fieldsCardNotLink{
		card_no,card_status,issue_date;
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
			card_no.add(testData[i][0]);
			card_status.add(testData[i][1]);
			issue_date.add(testData[i][2]);
		}
	}

	/**
	 * Get file name random
	 * @return attachFile
	 */
	public String getDataRandom(){
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(this.card_no.size());
		String data = this.card_no.get(index);
		return data;
	}
	
	/**
	 * Get name with random array type
	 * @param col
	 * @return name
	 */
	public String getByArrayTypeRandom(fieldsCardNotLink col){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
			for(int i = 0; i<this.card_no.size(); i++)
			{	
				switch(col){
				case card_no:
					arrayName.add(this.card_no.get(i));
					break;
				case card_status:
					arrayName.add(this.card_status.get(i));
					break;
				case issue_date:
					arrayName.add(this.issue_date.get(i));
				default:
					break;
		        }
		    }  
		int index = randomGenerator.nextInt(arrayName.size());
		String name = arrayName.get(index);
		return name;
	}
}

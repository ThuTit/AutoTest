package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;
import static org.selenium.common.TestLogger.info;
import org.selenium.readData.DatabaseResource;
public class BuuCucDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> bc2;
	public ArrayList<String> bc3;
	public ArrayList<String> bc4;
	

	/**
	 * Define list
	 * @param index
	 * @param code
	 * @param name
	 */
	public BuuCucDatabase(ArrayList<Integer> index,ArrayList<String> bc2,ArrayList<String> bc3,ArrayList<String> bc4){
		
		this.index=index;
		this.bc2=bc2;
		this.bc3=bc3;
		this.bc4=bc4;
	}

	/**
	 * Define list by array
	 */
	public BuuCucDatabase(){
		this.index=new ArrayList<Integer>();
		this.bc2=new ArrayList<String>();
		this.bc3=new ArrayList<String>();
		this.bc4=new ArrayList<String>();
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
			bc4.add(testData[i][1]);
			bc3.add(testData[i][2]);
			bc2.add(testData[i][3]);
		}
	}
	
	public int getIDRandom(){
		Random randomGenerator = new Random();
		int indexSize = randomGenerator.nextInt(this.index.size());
		int indexRandom = this.index.get(indexSize);
		return indexRandom;
	}
	/**
	 * Get name with random array type
	 * @param type
	 * @return nameByID
	 */
	public String getBC2ByID(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.bc2.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String nameByID = arrayName.get(index);
		info("arrayName is: "+arrayName);
		return nameByID;
	}
	
	/**
	 * Get name with random array type
	 * @param type
	 * @return nameByID
	 */
	public String getBC3ByID(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.bc3.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String nameByID = arrayName.get(index);
		info("arrayName is: "+arrayName);
		return nameByID;
	}
	
	/**
	 * Get name with random array type
	 * @param type
	 * @return nameByID
	 */
	public String getBC4ByID(int...type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					arrayName.add(this.bc4.get(i));
				}
			}
		}
		int index = randomGenerator.nextInt(arrayName.size());
		String nameByID = arrayName.get(index);
		info("arrayName is: "+arrayName);
		return nameByID;
	}
}

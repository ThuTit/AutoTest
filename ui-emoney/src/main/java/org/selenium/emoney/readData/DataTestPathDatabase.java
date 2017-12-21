package org.selenium.emoney.readData;

import java.util.ArrayList;
import java.util.Random;

import static org.selenium.common.TestLogger.info;

import org.selenium.readData.DatabaseResource;

public class DataTestPathDatabase {
	public ArrayList<String> dataTest;

	public DataTestPathDatabase(ArrayList<String> spaceReg){
		this.dataTest = spaceReg;
	}

	public DataTestPathDatabase() {
		dataTest  = new ArrayList<String>();
	}

	public void setDataTestPathData(String userDataFile, String userSheet, Object... opParams) throws Exception{
		String[][] testData = DatabaseResource.getDataFromSource(userDataFile,userSheet,opParams);
		for(int i = 0; i<testData.length; i++)
		{	
			dataTest.add(testData[i][0]);
		}
	}
	
	public String getDataTestPathByIndex(int index){
		info("path of site explorer is: "+dataTest.get(index));
		return dataTest.get(index);
	}

	public String getDataTestPathRandom(){
		Random randomGenerator = new Random();
		int index = randomGenerator.nextInt(this.dataTest.size());
		info("path of site explorer is: "+dataTest.get(index));
		return this.dataTest.get(index);
	}
}

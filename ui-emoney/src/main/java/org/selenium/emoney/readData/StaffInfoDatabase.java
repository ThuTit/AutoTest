package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

public class StaffInfoDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> username;
	public ArrayList<String> first_name;
	public ArrayList<String> last_name;
	public ArrayList<String> birthday;
	public ArrayList<String> identification;
	public ArrayList<String> email;
	public ArrayList<String> phone_number;
	public ArrayList<String> post_code;
	public ArrayList<String> pincode;
	public ArrayList<String> province_name;
	public ArrayList<String> district_name;
	public ArrayList<String> level_1;
	public ArrayList<String> level_2;
	public ArrayList<String> level_3;
	public ArrayList<String> level_4;
	

	/**
	 * Define list
	 * @param index
	 * @param username
	 * @param first_name
	 * @param last_name
	 * @param birthday
	 * @param identification
	 * @param email
	 * @param phone_number
	 * @param post_code
	 * @param pincode
	 * @param province_name
	 * @param district_name
	 * @param level_1
	 * @param level_2
	 * @param level_3
	 * @param level_4
	 */
	public StaffInfoDatabase(
			ArrayList<Integer> index,
			ArrayList<String> username,
			ArrayList<String> first_name,
			ArrayList<String> last_name,
			ArrayList<String> birthday,
			ArrayList<String> identification,
			ArrayList<String> email,
			ArrayList<String> phone_number,
			ArrayList<String> post_code,
			ArrayList<String> pincode,
			ArrayList<String> province_name,
			ArrayList<String> district_name,
			ArrayList<String> level_1,
			ArrayList<String> level_2,
			ArrayList<String> level_3,
			ArrayList<String> level_4){
		this.index=index;
		this.username=username;
		this.first_name=first_name;
		this.last_name=last_name;
		this.birthday=birthday;
		this.identification=identification;
		this.email=email;
		this.phone_number=phone_number;
		this.post_code=post_code;
		this.pincode=pincode;
		this.province_name=province_name;
		this.district_name=district_name;
		this.level_1=level_1;
		this.level_2=level_2;
		this.level_3=level_3;
		this.level_4=level_4;
		
	}

	/**
	 * Define list by array
	 */
	public StaffInfoDatabase(){
		this.index=new ArrayList<Integer>();
		this.username=new ArrayList<String>();
		this.first_name=new ArrayList<String>();
		this.last_name=new ArrayList<String>();
		this.birthday=new ArrayList<String>();
		this.identification=new ArrayList<String>();
		this.email=new ArrayList<String>();
		this.phone_number=new ArrayList<String>();
		this.post_code=new ArrayList<String>();
		this.pincode=new ArrayList<String>();
		this.province_name=new ArrayList<String>();
		this.district_name=new ArrayList<String>();
		this.level_1=new ArrayList<String>();
		this.level_2=new ArrayList<String>();
		this.level_3=new ArrayList<String>();
		this.level_4=new ArrayList<String>();
	}
	
	public enum fieldStaff{
		index,
		username,
		first_name,
		last_name,
		birthday,
		identification,
		email,
		phone_number,
		post_code,
		pincode,
		province_name,
		district_name,
		level_1,
		level_2,
		level_3,
		level_4;
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
			username.add(testData[i][1]);
			first_name.add(testData[i][2]);
			last_name.add(testData[i][3]);
			birthday.add(testData[i][4]);
			identification.add(testData[i][5]);
			email.add(testData[i][6]);
			phone_number.add(testData[i][7]);
			post_code.add(testData[i][8]);
			pincode.add(testData[i][9]);
			province_name.add(testData[i][10]);
			district_name.add(testData[i][11]);
			level_1.add(testData[i][12]);
			level_2.add(testData[i][13]);
			level_3.add(testData[i][14]);
			level_4.add(testData[i][15]);
		}
	}

	
	/**
	 * Get name with random array type
	 * @param col
	 * @param type
	 * @return name
	 */
	public String getByArrayTypeRandom(fieldStaff col,int... type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					switch(col){
					case index:
						arrayName.add(String.valueOf(this.index.get(0)));
						break;
					case username:
						arrayName.add(this.username.get(i));
						break;
					case first_name:
						arrayName.add(this.first_name.get(i));
						break;
					case last_name:
						arrayName.add(this.last_name.get(i));
						break;
					case birthday:
						arrayName.add(this.birthday.get(i));
						break;
					case identification:
						arrayName.add(this.identification.get(i));
						break;
					case email:
						arrayName.add(this.email.get(i));
						break;
					case phone_number:
						arrayName.add(this.phone_number.get(i));
						break;
					case post_code:
						arrayName.add(this.post_code.get(i));
						break;
					case pincode:
						arrayName.add(this.pincode.get(i));
						break;
					case province_name:
						arrayName.add(this.province_name.get(i));
						break;
					case district_name:
						arrayName.add(this.district_name.get(i));
						break;
					case level_1:
						arrayName.add(this.level_1.get(i));
						break;
					case level_2:
						arrayName.add(this.level_2.get(i));
						break;
					case level_3:
						arrayName.add(this.level_3.get(i));
						break;
					case level_4:
						arrayName.add(this.level_4.get(i));
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
	
}

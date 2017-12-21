package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

public class AccountWidthdrawDetailDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> name;
	public ArrayList<String> identification;
	public ArrayList<String> emoney_id;
	public ArrayList<String> emoney_balance;
	public ArrayList<String> member_status;
	public ArrayList<String> card_no;
	public ArrayList<String> card_expiration_date;
	public ArrayList<String> card_issue_date;
	public ArrayList<String> address;
	public ArrayList<String> authorized_name;
	public ArrayList<String> authorized_identification;
	public ArrayList<String> authorized_phone_number;
	public ArrayList<String> authorized_identification_date;
	public ArrayList<String> authorized_identification_issue_address;
	public ArrayList<String> id_type;

    /**
     * Define list
     * @param index
     * @param name
     * @param identification
     * @param emoney_id
     * @param emoney_balance
     * @param member_status
     * @param card_no
     * @param card_expiration_date
     * @param card_issue_date
     * @param address
     * @param authorized_name
     * @param authorized_identification
     * @param authorized_phone_number
     * @param authorized_identification_date
     * @param authorized_identification_issue_address
     * @param id_type
     */
	public AccountWidthdrawDetailDatabase(
			ArrayList<Integer> index,
			ArrayList<String> name,
			ArrayList<String> identification,
			ArrayList<String> emoney_id,
			ArrayList<String> emoney_balance,
			ArrayList<String> member_status,
			ArrayList<String> card_no,
			ArrayList<String> card_expiration_date,
			ArrayList<String> card_issue_date,
			ArrayList<String> address,
			ArrayList<String> authorized_name,
			ArrayList<String> authorized_identification,
			ArrayList<String> authorized_phone_number,
			ArrayList<String> authorized_identification_date,
			ArrayList<String> authorized_identification_issue_address,
			ArrayList<String> id_type){
		
		this.index=index;
		this.name=name;
		this.identification=identification;
		this.emoney_id=emoney_id;
		this.emoney_balance=emoney_balance;
		this.member_status=member_status;
		this.card_no=card_no;
		this.card_expiration_date=card_expiration_date;
		this.card_issue_date=card_issue_date;
		this.address=address;
		this.authorized_name=authorized_name;
		this.authorized_identification=authorized_identification;
		this.authorized_phone_number=authorized_phone_number;
		this.authorized_identification_date=authorized_identification_date;
		this.authorized_identification_issue_address=authorized_identification_issue_address;
		this.id_type=id_type;
		
	}

	/**
	 * Define list by array
	 */
	public AccountWidthdrawDetailDatabase(){
		this.index=new ArrayList<Integer>();
		this.name=new ArrayList<String>();
		this.identification=new ArrayList<String>();
		this.emoney_id=new ArrayList<String>();
		this.emoney_balance=new ArrayList<String>();
		this.member_status=new ArrayList<String>();
		this.card_no=new ArrayList<String>();
		this.card_expiration_date=new ArrayList<String>();
		this.card_issue_date=new ArrayList<String>();
		this.address=new ArrayList<String>();
		this.authorized_name=new ArrayList<String>();
		this.authorized_identification=new ArrayList<String>();
		this.authorized_phone_number=new ArrayList<String>();
		this.authorized_identification_date=new ArrayList<String>();
		this.authorized_identification_issue_address=new ArrayList<String>();
		this.id_type=new ArrayList<String>();
	}
	
	public enum fieldWidthdraw{
		index,
		name,
		identification,
		emoney_id,
		emoney_balance,
		card_no,
		card_expiration_date,
		card_issue_date,
		address,
		authorized_name,
		authorized_identification,
		authorized_phone_number,
		authorized_identification_date,
		authorized_identification_issue_address,
		id_type
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
			emoney_id.add(testData[i][3]);
			emoney_balance.add(testData[i][4]);
			card_no.add(testData[i][5]);
			card_issue_date.add(testData[i][6]);
			card_expiration_date.add(testData[i][7]);
			address.add(testData[i][8]);
			authorized_name.add(testData[i][9]);
			authorized_identification.add(testData[i][10]);
			authorized_identification_date.add(testData[i][11]);
			authorized_identification_issue_address.add(testData[i][12]);
			authorized_phone_number.add(testData[i][13]);
			id_type.add(testData[i][14]);
		}
	}

	/**
	 * Get name with random array type
	 * @param col
	 * @param type
	 * @return name
	 */
	public String getByArrayTypeRandom(fieldWidthdraw col,int... type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					switch(col){
					case address:
						arrayName.add(this.address.get(i));
						break;
					case authorized_identification_date:
						arrayName.add(this.authorized_identification_date.get(i));
						break;
					case authorized_identification_issue_address:
						arrayName.add(this.authorized_identification_issue_address.get(i));
						break;
					case authorized_name:
						arrayName.add(this.authorized_name.get(i));
						break;
					case authorized_identification:
						arrayName.add(this.authorized_identification.get(i));
						break;
					case authorized_phone_number:
						arrayName.add(this.authorized_phone_number.get(i));
						break;
					case card_expiration_date:
						arrayName.add(this.card_expiration_date.get(i));
						break;
					case card_issue_date:
						arrayName.add(this.card_issue_date.get(i));
						break;
					case card_no:
						arrayName.add(this.card_no.get(i));
						break;
					case emoney_balance:
						arrayName.add(this.emoney_balance.get(i));
						break;
					case emoney_id:
						arrayName.add(this.emoney_id.get(i));
						break;
					case identification:
						arrayName.add(this.identification.get(i));
						break;
					case name:
						arrayName.add(this.name.get(i));
						break;
					case id_type:
						arrayName.add(this.id_type.get(i));
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

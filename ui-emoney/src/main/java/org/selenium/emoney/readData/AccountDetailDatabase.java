package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

public class AccountDetailDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> name;
	public ArrayList<String> gender;
	public ArrayList<String> identification;
	public ArrayList<String> identification_date;
	public ArrayList<String> identification_issue_address;
	public ArrayList<String> birthday;
	public ArrayList<String> birth_address;
	public ArrayList<String> emoney_id;
	public ArrayList<String> emoney_balance;
	public ArrayList<String> member_status;
	public ArrayList<String> card_no;
	public ArrayList<String> card_expiration_date;
	public ArrayList<String> card_issue_date;
	public ArrayList<String> social_insurance_number;
	public ArrayList<String> social_insurance_info;
	public ArrayList<String> phone_number;
	public ArrayList<String> cell_phone_number;
	public ArrayList<String> email;
	public ArrayList<String> address;
	public ArrayList<String> address_province;
	public ArrayList<String> address_district;
	public ArrayList<String> address_commune;
	public ArrayList<String> address_temp;
	public ArrayList<String> address_temp_province;
	public ArrayList<String> address_temp_district;
	public ArrayList<String> address_temp_commune;
	public ArrayList<String> authorized_name;
	public ArrayList<String> authorized_identification;
	public ArrayList<String> authorized_phone_number;
	public ArrayList<String> authorized_relation;
	public ArrayList<String> authorized_office;
	public ArrayList<String> authorized_identification_date;
	public ArrayList<String> authorized_identification_issue_address;
	public ArrayList<String> authorized_date_from;
	public ArrayList<String> authorized_date_to;
	public ArrayList<String> id_type;

	/**
	 * Define list
	 * @param index
	 * @param name
	 * @param gender
	 * @param identification
	 * @param identification_date
	 * @param identification_issue_address
	 * @param birthday
	 * @param birth_address
	 * @param emoney_id
	 * @param emoney_balance
	 * @param member_status
	 * @param card_no
	 * @param card_expiration_date
	 * @param card_issue_date
	 * @param social_insurance_number
	 * @param social_insurance_info
	 * @param phone_number
	 * @param cell_phone_number
	 * @param email
	 * @param address
	 * @param address_province
	 * @param address_district
	 * @param address_commune
	 * @param address_temp
	 * @param address_temp_province
	 * @param address_temp_district
	 * @param address_temp_commune
	 * @param authorized_name
	 * @param authorized_identification
	 * @param authorized_phone_number
	 * @param authorized_relation
	 * @param authorized_office
	 * @param authorized_identification_date
	 * @param authorized_identification_issue_address
	 * @param authorized_date_from
	 * @param authorized_date_to
	 * @param id_type
	 */
	public AccountDetailDatabase(
			ArrayList<Integer> index,
			ArrayList<String> name,
			ArrayList<String> gender,
			ArrayList<String> identification,
			ArrayList<String> identification_date,
			ArrayList<String> identification_issue_address,
			ArrayList<String> birthday,
			ArrayList<String> birth_address,
			ArrayList<String> emoney_id,
			ArrayList<String> emoney_balance,
			ArrayList<String> member_status,
			ArrayList<String> card_no,
			ArrayList<String> card_expiration_date,
			ArrayList<String> card_issue_date,
			ArrayList<String> social_insurance_number,
			ArrayList<String> social_insurance_info,
			ArrayList<String> phone_number,
			ArrayList<String> cell_phone_number,
			ArrayList<String> email,
			ArrayList<String> address,
			ArrayList<String> address_province,
			ArrayList<String> address_district,
			ArrayList<String> address_commune,
			ArrayList<String> address_temp,
			ArrayList<String> address_temp_province,
			ArrayList<String> address_temp_district,
			ArrayList<String> address_temp_commune,
			ArrayList<String> authorized_name,
			ArrayList<String> authorized_identification,
			ArrayList<String> authorized_phone_number,
			ArrayList<String> authorized_relation,
			ArrayList<String> authorized_office,
			ArrayList<String> authorized_identification_date,
			ArrayList<String> authorized_identification_issue_address,
			ArrayList<String> authorized_date_from,
			ArrayList<String> authorized_date_to,
			ArrayList<String> id_type){
		
		this.index=index;
		this.name=name;
		this.gender=gender;
		this.identification=identification;
		this.identification_date=identification_date;
		this.identification_issue_address=identification_issue_address;
		this.birthday=birthday;
		this.birth_address=birth_address;
		this.emoney_id=emoney_id;
		this.emoney_balance=emoney_balance;
		this.member_status=member_status;
		this.card_no=card_no;
		this.card_expiration_date=card_expiration_date;
		this.card_issue_date=card_issue_date;
		this.social_insurance_number=social_insurance_number;
		this.social_insurance_info=social_insurance_info;
		this.phone_number=phone_number;
		this.cell_phone_number=cell_phone_number;
		this.email=email;
		this.address=address;
		this.address_province=address_province;
		this.address_district=address_district;
		this.address_commune=address_commune;
		this.address_temp=address_temp;
		this.address_temp_province=address_temp_province;
		this.address_temp_district=address_temp_district;
		this.address_temp_commune=address_temp_commune;
		this.authorized_name=authorized_name;
		this.authorized_identification=authorized_identification;
		this.authorized_phone_number=authorized_phone_number;
		this.authorized_relation=authorized_relation;
		this.authorized_office=authorized_office;
		this.authorized_identification_date=authorized_identification_date;
		this.authorized_identification_issue_address=authorized_identification_issue_address;
		this.authorized_date_from=authorized_date_from;
		this.authorized_date_to=authorized_date_to;
		this.id_type = id_type;
		
		
	}

	/**
	 * Define list by array
	 */
	public AccountDetailDatabase(){
		this.index=new ArrayList<Integer>();
		this.name=new ArrayList<String>();
		this.gender=new ArrayList<String>();
		this.identification=new ArrayList<String>();
		this.identification_date=new ArrayList<String>();
		this.identification_issue_address=new ArrayList<String>();
		this.birthday=new ArrayList<String>();
		this.birth_address=new ArrayList<String>();
		this.emoney_id=new ArrayList<String>();
		this.emoney_balance=new ArrayList<String>();
		this.member_status=new ArrayList<String>();
		this.card_no=new ArrayList<String>();
		this.card_expiration_date=new ArrayList<String>();
		this.card_issue_date=new ArrayList<String>();
		this.social_insurance_number=new ArrayList<String>();
		this.social_insurance_info=new ArrayList<String>();
		this.phone_number=new ArrayList<String>();
		this.cell_phone_number=new ArrayList<String>();
		this.email=new ArrayList<String>();
		this.address=new ArrayList<String>();
		this.address_province=new ArrayList<String>();
		this.address_district=new ArrayList<String>();
		this.address_commune=new ArrayList<String>();
		this.address_temp=new ArrayList<String>();
		this.address_temp_province=new ArrayList<String>();
		this.address_temp_district=new ArrayList<String>();
		this.address_temp_commune=new ArrayList<String>();
		this.authorized_name=new ArrayList<String>();
		this.authorized_identification=new ArrayList<String>();
		this.authorized_phone_number=new ArrayList<String>();
		this.authorized_relation=new ArrayList<String>();
		this.authorized_office=new ArrayList<String>();
		this.authorized_identification_date=new ArrayList<String>();
		this.authorized_identification_issue_address=new ArrayList<String>();
		this.authorized_date_from=new ArrayList<String>();
		this.authorized_date_to=new ArrayList<String>();
		this.id_type=new ArrayList<String>();
	}
	
	public enum fields{
		index,
		name,
		gender,
		identification,
		identification_date,
		identification_issue_address,
		birthday,
		birth_address,
		emoney_id,
		emoney_balance,
		member_status,
		card_no,
		card_expiration_date,
		card_issue_date,
		social_insurance_number,
		social_insurance_info,
		phone_number,
		cell_phone_number,
		email,
		address,
		address_province,
		address_district,
		address_commune,
		address_temp,
		address_temp_province,
		address_temp_district,
		address_temp_commune,
		authorized_name,
		authorized_identification,
		authorized_phone_number,
		authorized_relation,
		authorized_office,
		authorized_identification_date,
		authorized_identification_issue_address,
		authorized_date_from,
		authorized_date_to,
		id_type;
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
			gender.add(testData[i][2]);
			identification.add(testData[i][3]);
			identification_date.add(testData[i][4]);
			identification_issue_address.add(testData[i][5]);
			birthday.add(testData[i][6]);
			birth_address.add(testData[i][7]);
			emoney_id.add(testData[i][8]);
			emoney_balance.add(testData[i][9]);
			member_status.add(testData[i][10]);
			card_no.add(testData[i][11]);
			card_expiration_date.add(testData[i][12]);
			card_issue_date.add(testData[i][13]);
			social_insurance_number.add(testData[i][14]);
			social_insurance_info.add(testData[i][15]);
			phone_number.add(testData[i][16]);
			cell_phone_number.add(testData[i][17]);
			email.add(testData[i][18]);
			address.add(testData[i][19]);
			address_province.add(testData[i][20]);
			address_district.add(testData[i][21]);
			address_commune.add(testData[i][22]);
			address_temp.add(testData[i][23]);
			address_temp_province.add(testData[i][24]);
			address_temp_district.add(testData[i][25]);
			address_temp_commune.add(testData[i][26]);
			authorized_name.add(testData[i][27]);
			authorized_identification.add(testData[i][28]);
			authorized_phone_number.add(testData[i][29]);
			authorized_relation.add(testData[i][30]);
			authorized_office.add(testData[i][31]);
			authorized_identification_date.add(testData[i][32]);
			authorized_identification_issue_address.add(testData[i][33]);
			authorized_date_from.add(testData[i][34]);
			authorized_date_to.add(testData[i][35]);
			id_type.add(testData[i][36]);
		}
	}

	/**
	 * Get name with random array type
	 * @param col
	 * @param type
	 * @return name
	 */
	public String getByArrayTypeRandom(fields col,int... type){
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
					case address_commune:
						arrayName.add(this.address_commune.get(i));
						break;
					case address_district:
						arrayName.add(this.address_district.get(i));
						break;
					case address_province:
						arrayName.add(this.address_province.get(i));
						break;
					case address_temp:
						arrayName.add(this.address_temp.get(i));
						break;
					case address_temp_commune:
						arrayName.add(this.address_temp_commune.get(i));
						break;
					case address_temp_district:
						arrayName.add(this.address_temp_district.get(i));
						break;
					case address_temp_province:
						arrayName.add(this.address_temp_province.get(i));
						break;
					case authorized_date_from:
						arrayName.add(this.authorized_date_from.get(i));
						break;
					case authorized_date_to:
						arrayName.add(this.authorized_date_to.get(i));
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
					case authorized_office:
						arrayName.add(this.authorized_office.get(i));
						break;
					case authorized_relation:
						arrayName.add(this.authorized_relation.get(i));
						break;
					case birth_address:
						arrayName.add(this.birth_address.get(i));
						break;
					case birthday:
						arrayName.add(this.birthday.get(i));
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
					case cell_phone_number:
						arrayName.add(this.cell_phone_number.get(i));
						break;
					case email:
						arrayName.add(this.email.get(i));
						break;
					case emoney_balance:
						arrayName.add(this.emoney_balance.get(i));
						break;
					case emoney_id:
						arrayName.add(this.emoney_id.get(i));
						break;
					case gender:
						arrayName.add(this.gender.get(i));
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
					case member_status:
						arrayName.add(this.member_status.get(i));
						break;
					case name:
						arrayName.add(this.name.get(i));
						break;
					case phone_number:
						arrayName.add(this.phone_number.get(i));
						break;
					case social_insurance_info:
						arrayName.add(this.social_insurance_info.get(i));
						break;
					case social_insurance_number:
						arrayName.add(this.social_insurance_number.get(i));
						break;
					case id_type:
						arrayName.add(this.id_type.get(i));
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
					arrayName.add(this.identification.get(i));
					arrayName.add(this.identification_date.get(i));
					arrayName.add(this.identification_issue_address.get(i));
					arrayName.add(this.birthday.get(i));
					arrayName.add(this.birth_address.get(i));
					arrayName.add(this.emoney_id.get(i));
					arrayName.add(this.emoney_balance.get(i));
					arrayName.add(this.member_status.get(i));
					arrayName.add(this.card_no.get(i));
					arrayName.add(this.card_expiration_date.get(i));
					arrayName.add(this.card_expiration_date.get(i));
					arrayName.add(this.social_insurance_number.get(i));
					arrayName.add(this.phone_number.get(i));
					arrayName.add(this.cell_phone_number.get(i));
				    arrayName.add(this.email.get(i));
				    arrayName.add(this.address.get(i));
					arrayName.add(this.address_province.get(i));
					arrayName.add(this.address_district.get(i));
					arrayName.add(this.address_commune.get(i));		
				    arrayName.add(this.address_temp.get(i));
					arrayName.add(this.address_temp_province.get(i));
					arrayName.add(this.address_temp_district.get(i));
					arrayName.add(this.address_temp_commune.get(i));
				    arrayName.add(this.authorized_identification.get(i));
					arrayName.add(this.authorized_name.get(i));
					arrayName.add(this.authorized_identification_date.get(i));
					arrayName.add(this.authorized_identification_issue_address.get(i));
					arrayName.add(this.authorized_phone_number.get(i));
					arrayName.add(this.authorized_relation.get(i));
					arrayName.add(this.authorized_office.get(i));
					arrayName.add(this.authorized_date_from.get(i));
					arrayName.add(this.authorized_date_to.get(i));
					arrayName.add(this.gender.get(i));
				}
			}
		}
		return arrayName;
	}
}

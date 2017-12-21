package org.selenium.emoney.readData;
import java.util.ArrayList;
import java.util.Random;

import org.selenium.readData.DatabaseResource;

public class TransactionInfoDatabase {
	public ArrayList<Integer> index;
	public ArrayList<String> account_name;
	public ArrayList<String> account_identification;
	public ArrayList<String> account_address;
	public ArrayList<String> account_phone_number;
	public ArrayList<String> account_cell_phone_number;
	public ArrayList<String> id_withdrawal;
	public ArrayList<String> emoney_id;
	public ArrayList<String> emoney_amount;
	public ArrayList<String> emoney_balance;
	public ArrayList<String> card_no;
	public ArrayList<String> sale_no;
	public ArrayList<String> transaction_number;
	public ArrayList<String> transaction_date;
	public ArrayList<String> reason_code;
	public ArrayList<String> detail_reason_code;
	public ArrayList<String> reason_description;
	public ArrayList<String> transaction_status;
	public ArrayList<String> member_store_3g_name;
	public ArrayList<String> member_store_2g_name;
	public ArrayList<String> member_store_g_name;
	public ArrayList<String> member_store_name;
	public ArrayList<String> operator_user_first_name;
	public ArrayList<String> operator_user_last_name;
	public ArrayList<String> approver_first_name;
	public ArrayList<String> approver_last_name;
	public ArrayList<String> executed_date;
	

    /**
     * Define list
     * @param index
     * @param account_name
     * @param account_identification
     * @param account_address
     * @param account_phone_number
     * @param account_cell_phone_number
     * @param id_withdrawal
     * @param emoney_id
     * @param emoney_amount
     * @param emoney_balance
     * @param card_no
     * @param sale_no
     * @param transaction_number
     * @param transaction_date
     * @param reason_code
     * @param detail_reason_code
     * @param reason_description
     * @param transaction_status
     * @param member_store_3g_name
     * @param member_store_2g_name
     * @param member_store_g_name
     * @param member_store_name
     * @param operator_user_first_name
     * @param operator_user_last_name
     * @param approver_first_name
     * @param approver_last_name
     * @param executed_date
     */
	public TransactionInfoDatabase(
			ArrayList<Integer> index,
			ArrayList<String> account_name,
			ArrayList<String> account_identification,
			ArrayList<String> account_address,
			ArrayList<String> account_phone_number,
			ArrayList<String> account_cell_phone_number,
			ArrayList<String> id_withdrawal,
			ArrayList<String> emoney_id,
			ArrayList<String> emoney_amount,
			ArrayList<String> emoney_balance,
			ArrayList<String> card_no,
			ArrayList<String> sale_no,
			ArrayList<String> transaction_number,
			ArrayList<String> transaction_date,
			ArrayList<String> reason_code,
			ArrayList<String> detail_reason_code,
			ArrayList<String> reason_description,
			ArrayList<String> transaction_status,
			ArrayList<String> member_store_3g_name,
			ArrayList<String> member_store_2g_name,
			ArrayList<String> member_store_g_name,
			ArrayList<String> member_store_name,
			ArrayList<String> operator_user_first_name,
			ArrayList<String> operator_user_last_name,
			ArrayList<String> approver_first_name,
			ArrayList<String> approver_last_name,
			ArrayList<String> executed_date){
		
		this.index=index;
		this.account_name=account_name;
		this.account_identification=account_identification;
		this.account_address=account_address;
		this.account_phone_number=account_phone_number;
		this.account_cell_phone_number=account_cell_phone_number;
		this.id_withdrawal=id_withdrawal;
		this.emoney_id=emoney_id;
		this.emoney_amount=emoney_amount;
		this.emoney_balance=emoney_balance;
		this.card_no=card_no;
		this.sale_no=sale_no;
		this.transaction_number=transaction_number;
		this.transaction_date=transaction_date;
		this.reason_code=reason_code;
		this.detail_reason_code=detail_reason_code;
		this.reason_description=reason_description;
		this.transaction_status=transaction_status;
		this.member_store_3g_name=member_store_3g_name;
		this.member_store_2g_name=member_store_2g_name;
		this.member_store_g_name=member_store_g_name;
		this.member_store_name=member_store_name;
		this.operator_user_first_name=operator_user_first_name;
		this.operator_user_last_name=operator_user_last_name;
		this.approver_first_name=approver_first_name;
		this.approver_last_name=approver_last_name;
		this.executed_date=executed_date;
		
	}

	/**
	 * Define list by array
	 */
	public TransactionInfoDatabase(){
		this.index=new ArrayList<Integer>();
		this.account_name=new ArrayList<String>();
		this.account_identification=new ArrayList<String>();
		this.account_address=new ArrayList<String>();
		this.account_phone_number=new ArrayList<String>();
		this.account_cell_phone_number=new ArrayList<String>();
		this.id_withdrawal=new ArrayList<String>();
		this.emoney_id=new ArrayList<String>();
		this.emoney_amount=new ArrayList<String>();
		this.emoney_balance=new ArrayList<String>();
		this.card_no=new ArrayList<String>();
		this.sale_no=new ArrayList<String>();
		this.transaction_number=new ArrayList<String>();
		this.transaction_date=new ArrayList<String>();
		this.reason_code=new ArrayList<String>();
		this.detail_reason_code=new ArrayList<String>();
		this.reason_description=new ArrayList<String>();
		this.transaction_status=new ArrayList<String>();
		this.member_store_3g_name=new ArrayList<String>();
		this.member_store_2g_name=new ArrayList<String>();
		this.member_store_g_name=new ArrayList<String>();
		this.member_store_name=new ArrayList<String>();
		this.operator_user_first_name=new ArrayList<String>();
		this.operator_user_last_name=new ArrayList<String>();
		this.approver_first_name=new ArrayList<String>();
		this.approver_last_name=new ArrayList<String>();
		this.executed_date=new ArrayList<String>();
	}
	
	public enum fieldTransaction{
		index,
		account_name,
		account_identification,
		account_address,
		account_phone_number,
		account_cell_phone_number,
		id_withdrawal,
		emoney_id,
		emoney_amount,
		emoney_balance,
		card_no,
		sale_no,
		transaction_number,
		transaction_date,
		reason_code,
		detail_reason_code,
		reason_description,
		transaction_status,
		member_store_3g_name,
		member_store_2g_name,
		member_store_g_name,
		member_store_name,
		operator_user_first_name,
		operator_user_last_name,
		approver_first_name,
		approver_last_name,
		executed_date;
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
			account_name.add(testData[i][1]);
			account_identification.add(testData[i][2]);
			account_address.add(testData[i][3]);
			account_phone_number.add(testData[i][4]);
			account_cell_phone_number.add(testData[i][5]);
			id_withdrawal.add(testData[i][6]);
			emoney_id.add(testData[i][7]);
			emoney_amount.add(testData[i][8]);
			emoney_balance.add(testData[i][9]);
			card_no.add(testData[i][10]);
			sale_no.add(testData[i][11]);
			transaction_number.add(testData[i][12]);
			transaction_date.add(testData[i][13]);
			reason_code.add(testData[i][14]);
			detail_reason_code.add(testData[i][15]);
			reason_description.add(testData[i][16]);
			transaction_status.add(testData[i][17]);
			member_store_3g_name.add(testData[i][18]);
			member_store_2g_name.add(testData[i][19]);
			member_store_g_name.add(testData[i][20]);
			member_store_name.add(testData[i][21]);
			operator_user_first_name.add(testData[i][22]);
			operator_user_last_name.add(testData[i][23]);
			approver_first_name.add(testData[i][24]);
			approver_last_name.add(testData[i][25]);
			executed_date.add(testData[i][26]);
		}
	}

	/**
	 * Get name with random array type
	 * @param col
	 * @param type
	 * @return name
	 */
	public String getByArrayTypeRandom(fieldTransaction col,int... type){
		ArrayList<String> arrayName = new ArrayList<String>();
		Random randomGenerator = new Random();
		for (int j = 0; j<type.length; j++){
			for(int i = 0; i<this.index.size(); i++)
			{	
				if(this.index.get(i) == type[j]) {
					switch(col){
					case account_name:
						arrayName.add(this.account_name.get(i));
						break;
					case account_identification:
						arrayName.add(this.account_identification.get(i));
						break;
					case account_address:
						arrayName.add(this.account_address.get(i));
						break;
					case account_phone_number:
						arrayName.add(this.account_phone_number.get(i));
						break;
					case account_cell_phone_number:
						arrayName.add(this.account_cell_phone_number.get(i));
						break;
					case approver_first_name:
						arrayName.add(this.approver_first_name.get(i));
						break;
					case approver_last_name:
						arrayName.add(this.approver_last_name.get(i));
						break;
					case operator_user_first_name:
						arrayName.add(this.operator_user_first_name.get(i));
						break;
					case operator_user_last_name:
						arrayName.add(this.operator_user_last_name.get(i));
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
					case detail_reason_code:
						arrayName.add(this.detail_reason_code.get(i));
						break;
					case emoney_amount:
						arrayName.add(this.emoney_amount.get(i));
						break;
					case executed_date:
						arrayName.add(this.executed_date.get(i));
						break;
					case id_withdrawal:
						arrayName.add(this.id_withdrawal.get(i));
						break;
					case member_store_2g_name:
						arrayName.add(this.member_store_2g_name.get(i));
						break;
					case member_store_3g_name:
						arrayName.add(this.member_store_3g_name.get(i));
						break;
					case member_store_g_name:
						arrayName.add(this.member_store_g_name.get(i));
						break;
					case member_store_name:
						arrayName.add(this.member_store_name.get(i));
						break;
					case reason_code:
						arrayName.add(this.reason_code.get(i));
						break;
					case reason_description:
						arrayName.add(this.reason_description.get(i));
						break;
					case sale_no:
						arrayName.add(this.sale_no.get(i));
						break;
					case transaction_date:
						arrayName.add(this.transaction_date.get(i));
						break;
					case transaction_number:
						arrayName.add(this.transaction_number.get(i));
						break;
					case transaction_status:
						arrayName.add(this.transaction_status.get(i));
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

package com.selenium.emoney.smoke.frontend;
public class Smoke_FrontEnd_ThongTinTaiKhoan extends TestConfig {

	/*@Test
	public void Test_Emoney_info_section()  throws IOException{
		driver.get("http://test-counter-em.teko.vn/account/search/");
		tttk.inputTypeInfo("Thẻ chi trả");
		tttk.inputCode("0011142000000060");
		tttk.search();
		tttk.verifyDisabledEmoneyId();
		tttk.verifyDisabledEmoneyBalance() ;
		tttk.verifyDisabledAccountStatus();
		tttk.verifyDisabledIdCard();
		tttk.verifyDisabledIdCardExpDate() ;
	}
	
	@Test
	public void Test_Social_info_section()  throws IOException{
		driver.get("http://test-counter-em.teko.vn/account/search/");
		tttk.inputTypeInfo("Thẻ chi trả");
		tttk.inputCode("0011142000000060");
		tttk.search();
		tttk.verifySocialInsuranceNumber("979598");
		tttk.verifySocialType("Lương hưu") ;
		tttk.verifyReceiveType("12");
		tttk.verifyDisabledSocialInsuranceNumber();
		tttk.verifyDisabledSocialInsuranceType() ;
		tttk.inputReceiveType("2");
	}
	
	
	@Test
	public void Test_Contact_info_section()  throws IOException{
		driver.get("http://test-counter-em.teko.vn/account/search/");
		tttk.inputTypeInfo("Thẻ chi trả");
		tttk.inputCode("0011142000000060");
		tttk.search();
		tttk.verifyPhoneInfo("");
		tttk.verifyCellPhoneInfo("");
		tttk.verifyEmailInfo("");
	}
	
	@Test
	public void Test_Auth_info_section()  throws IOException{
		driver.get("http://test-counter-em.teko.vn/account/search/");
		tttk.inputTypeInfo("Thẻ chi trả");
		tttk.inputCode("0011142000000060");
		tttk.search();
		
		tttk.verifyIDCardAuthInfo("236598741");
		tttk.verifyNameAuthInfo("Nguyễn Van A");
		tttk.verifyIdentificationDateAuthInfo("02/03/2017");
		tttk.verifyIssueAddressAuthInfo("CA");
		tttk.verifyPhoneAuthInfo("000000000");
		tttk.verifyRelationAuthInfo("anh em");
		
		tttk.verifyAuthoOfficeInfo("UBND");
		tttk.verifyAuthDateFromInfo("02/02/2011");
		tttk.verifyAuthoDateToInfo("02/02/2018");
		
		tttk.verifyDisabledNameAuth();
		tttk.verifyDisabledIdentificaitonDateAuth();
		tttk.verifyDisabledIssueAddressAuth();
		tttk.verifyDisabledPhoneAuth();
		
		tttk.clearAuthInfo();
		
	}
	
	
	@Test
	public void Test_Transaction_tab()  throws IOException{
		driver.get("http://test-counter-em.teko.vn/account/search/");
		tttk.inputTypeInfo("Thẻ chi trả");
		tttk.inputCode("0011142000000060");
		tttk.search();
		
		tttk.goToTransactionTab();
		tttk.inputTransactionList("25");
		tttk.nextTransactionPage();
		tttk.previousTransactionPage();
	}
		
	*//**
	* Test ID:TTTK_001
	* Test case name:Tìm Kiếm Theo CMND Tồn Tại Trong Hệ Thống
	* Precondition:
	* Account có CMND tồn tại trong hệ thống của VNPOST và EMoney
	* Test Steps:
	*1. Vào trang WEB
	*2. Nhập CMND
	*3. Ấn Enter hoặc click icon Search
	* Expected Result:
	* Hiển thị trang thông tin của khách hàng
	 * @throws IOException 
	 * @throws TestLinkAPIException 
	*//*
<<<<<<< HEAD
	@Test
	public void TTTK_001_TimKiemTheoCMNDTonTai() throws IOException, TestLinkAPIException{
=======
//	@Test
	public void TTTK_001_TimKiemTheoCMNDTonTai() throws IOException{
>>>>>>> QC-22, QC-23, QC-24
		info("Tìm Kiếm Theo CMND Tồn Tại Trong Hệ Thống");
		String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
		int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
		
		info("Step1: Vào trang thông tin");
		hp.goToThongTinTaiKhoan();
		
		info("Step2-3: Nhập CMND và Ấn Enter");
		thongtin.search(idType,keyWord);
	}
	
	*//**
	* Test ID:TTTK_002
	* Test case name:Kiểm Tra Thông Tin Trên Form Với DB VNPOst
	* Precondition:
	*Account có CMND tồn tại trong hệ thống của VNPOST và EMoney
	* Test Steps:
	*1. Vào trang WEB
	*2. Search một account
	*3. Quan sát màn hình thông tin chung được hiển thị
	* Expected Result:
	* Các thông tin trên màn hình thông tin chung được hiển thị đúng như trong DB của VNPost
	 * @throws IOException 
	 * @throws TestLinkAPIException 
	*//*
<<<<<<< HEAD
	@Test
	public void TTTK_002_KiểmTraThôngTinTrênFormVớiDBVNPOst() throws IOException, TestLinkAPIException{
=======
//	@Test
	public void TTTK_002_KiểmTraThôngTinTrênFormVớiDBVNPOst() throws IOException{
>>>>>>> QC-22, QC-23, QC-24
		info("Kiểm Tra Thông Tin Trên Form Với DB VNPOst");
		String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
		int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
		
		info("Step1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		
		info("Các thông tin trên màn hình thông tin chung được hiển thị đúng như trong DB của VNPost");
		ArrayList<String> listDataFromDB= new ArrayList<String>();
		ArrayList<String> listDataFromWEB= new ArrayList<String>();
		listDataFromDB = accDetail.getArrayNameByArrayType(accDetail.index.get(0));
		
		
		info("Lấy họ tên");
		String actual01=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_HOTEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual01);
		
		info("Lấy số hộ chiếu");
		String actual1=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_SOHOCHIEU_FIELD).getAttribute("value");
		listDataFromWEB.add(actual1);
		
		info("Lấy số ngày cấp hộ chiếu");
		String actual2=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_NGAYCAP_FIELD).getAttribute("value");
		listDataFromWEB.add(actual2);
		
		info("Lấy số nơi cấp hộ chiếu");
		String actual3=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_NOICAP_FILED).getAttribute("value");
		listDataFromWEB.add(actual3);
		
		info("Lấy số ngày sinh");
		String actual4=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_NGAYSINH_FILED).getAttribute("value");
		listDataFromWEB.add(actual4);
		
		info("Lấy nơi sinh");
		String actual5=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_NOISINH_FILED).getAttribute("value");
		listDataFromWEB.add(actual5);
		
		info("Lấy mã thành viên");
		String actual6=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_MATHANHVIEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual6);
		
		info("Lấy số dư tài khoản");
		String actual7=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_SODUTAIKHOAN_FILED).getAttribute("value");
		listDataFromWEB.add(actual7);
		
		info("Lấy trạng thái tài khoản");
		String actual8=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_TRANGTHAITAIKHOAN_FILED).getAttribute("value");
		listDataFromWEB.add(actual8);
		
		info("Lấy mã thẻ");
		String actual9=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_MATHE_FILED).getAttribute("value");
		listDataFromWEB.add(actual9);
		
		info("Lấy ngày hết hạn thẻ");
		String actual10=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_NGAYHETHANTHE_FILED).getAttribute("value");
		listDataFromWEB.add(actual10);
		
		info("Lấy ngày phát thành thẻ");
		String actual11=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_NGAYPHATHANHTHE_FILED).getAttribute("value");
		listDataFromWEB.add(actual11);
		
		info("Lấy số bảo hiểm xã hội");
		String actual12=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_BHXH_SOBHXH_FILED).getAttribute("value");
		listDataFromWEB.add(actual12);
		
		info("Lấy số điện thoại cố định");
		String actual13=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINLIENLAC_CODINH_FILED).getAttribute("value");
		listDataFromWEB.add(actual13);
		
		info("Lấy số di động");
		String actual14=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINLIENLAC_DIDONG_FILED).getAttribute("value");
		listDataFromWEB.add(actual14);
		
		info("Lấy địa chỉ email");
	    String actual15=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINLIENLAC_EMAIL_FILED).getAttribute("value");
	    listDataFromWEB.add(actual15);
	    
	    info("Lấy địa chỉ thường trú chi tiết");
	    String actual16=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_DIACHICHITIET_FILED).getAttribute("value");
	    listDataFromWEB.add(actual16);
	   
	    info("Lấy tỉnh thành địa chỉ thường trú");
		String actual17=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_TINHTHANH_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual17);
		
		info("Lấy quận huyện địa chỉ thường trú");
		String actual18=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_QUANHUYEN_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual18);
		
		info("Lấy phường xã địa chỉ thường trú");
		String actual19=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_PHUONGXA_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual19);		
	    
		info("Lấy địa chỉ chi tiết tạm trú");
	    String actual20=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_DIACHICHITIET_FILED).getAttribute("value");
	    listDataFromWEB.add(actual20);
	    
	    info("Lấy tỉnh thàng tạm chú");
		String actual21=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_TINHTHANH_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual21);
		
		info("Lấy quận huyện tạm trú");
		String actual22=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_QUANHUYEN_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual22);
		
		info("Lấy phường xã tạm trú");
		String actual23=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_PHUONGXA_SELECTBOX).getAttribute("value");
		listDataFromWEB.add(actual23);
	    
		info("Lấy chứng minh thư người được ủy quyền");
	    String actual24=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_CMND_FILED).getAttribute("value");
	    listDataFromWEB.add(actual24);
	   
	    info("Lấy họ tên người được ủy quyền");
		String actual25=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_HOTEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual25);
		
		info("Lấy ngày cấp chứng minh thư người được ủy quyền");
		String actual26=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NGAYCAP_FILED).getAttribute("value");
		listDataFromWEB.add(actual26);
		
		info("Lấy nơi cấp chứng minh thư người được ủy quyền");
		String actual27=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NOICAP_FILED).getAttribute("value");
		listDataFromWEB.add(actual27);
		
		info("Lấy số điện thoại người được ủy quyền");
		String actual28=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_SODIENTHOAI_FILED).getAttribute("value");
		listDataFromWEB.add(actual28);
		
		info("Lấy quan hệ với chủ tài khoản của người được ủy quyền");
		String actual29=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_QUANHEVOICHUTAIKHOAN_FILED).getAttribute("value");
		listDataFromWEB.add(actual29);
		
		info("Lấy nơi xác nhận ủy quyền của người được ủy quyền");
		String actual30=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_NOIXACNHANUYQUYEN_FILED).getAttribute("value");
		listDataFromWEB.add(actual30);
		
		info("Lấy ngày cấp ủy quyền của người được ủy quyền");
		String actual31=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_THOIHANUYQUYEN_FROMDATE_FILED).getAttribute("value");
		listDataFromWEB.add(actual31);
		
		info("Lấy ngày hết hạn ủy quyền của người được ủy quyền");
		String actual32=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_THOIHANUYQUYEN_TODATE_FILED).getAttribute("value");
		listDataFromWEB.add(actual32);
		
		info("Lấy thông tin giới tính của chủ tài khoản");
		String actual33=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_GENDER).getAttribute("value");
		listDataFromWEB.add(actual33);
		
		for(int i=0;i<listDataFromWEB.size();i++){
			info("So sánh các thông tin trên web và Database của:"+listDataFromWEB.get(i));
			if(!listDataFromWEB.get(i).equals(listDataFromDB.get(i)))
				assert false: "Giá trị trên WEB là:"+listDataFromWEB.get(i)+" với giá trị trong DB là:"+listDataFromDB.get(i)+"";
		}
		
	}

	
	*//**
	* Test ID:TTTK_004
	* Test case name:Kiểm Tra Việc Thay Đổi Theo Số CMND Ủy Quyền Tồn Tại Trong Hệ Thống Khi Điền Đầy Đủ Thông Tin
	* Precondition:
	*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
	* Test Steps:
	*1. Vào trang WEB
	*2. Nhập số thẻ hoặc CMND
	*3. Ấn Enter hoặc click icon Search
	*4. Tìm đến phần Thông tin ủy quyền và nhập số CMND
	*5. Ấn nút Tìm 
	*6. Nhập các thông tin cần thiết khác
	*7. Ấn nút Cập nhật
	* Expected Result:
	*Thông tin ủy quyền được cập nhập như đã thay đổi vào DB của VNPost
	 * @throws IOException 
	 * @throws TestLinkAPIException 
	*//*
<<<<<<< HEAD
	@Test
	public void TTTK_003_KiểmTraViệcThayĐổiTheoSốCMNDỦyQuyềnTồnTạiTrongHệThốngKhiĐiềnĐầyĐủThôngTin() throws IOException, TestLinkAPIException{
=======
//	@Test
	public void TTTK_003_KiểmTraViệcThayĐổiTheoSốCMNDỦyQuyềnTồnTạiTrongHệThốngKhiĐiềnĐầyĐủThôngTin() throws IOException{
>>>>>>> QC-22, QC-23, QC-24
		info("Tìm Kiếm Số CMND Ủy Quyền Tồn Tại Trong Hệ Thống");
		String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(4));
		int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(4)));
		String currentID =accDetail.getByArrayTypeRandom(fields.authorized_identification,accDetail.index.get(4));
		String input=authoList.getIdentificationRandom(currentID);
		
		String text = "";
		String fromDate = getCurrentDate("dd/MM/YYYY");
		String toDate = getDayOfNextYear("dd/MM/YYYY",1);
		
		info("Step1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		
		info("Step3: Thay đổi thông tin khách hàng");
		thongtin.authorized(input, text, fromDate, toDate);
		thongtin.saveUpdate();
		
		info("Step4:Kiểm tra việc update không thành công");
		String message = mesg.getMessageByArrayTypeRandom(3);
		waitForAndGetElement(thongtin.ELEMENT_WARNINGERROR_MESSAGE.replace("$mess",message),3000,1);
	}
	
	*//**
	* Test ID:TTTK_005
	* Test case name:Kiểm tra các trường thông tin không thể edit
	* Precondition:
	* Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
	* Test Steps:
	*1. Vào trang WEB
	*2. Nhập số thẻ hoặc CMND
	*3. Ấn Enter hoặc click icon Search
	*4. Tìm đến phần Thông tin ủy quyền và nhập số CMND
	*5. Ấn nút Tìm 
	*6. Quan sát các trường bị disabled
	*7. Ấn nút Cập nhật
	* Expected Result:
	* Không thể edit được các trường bị disabled
	 * @throws IOException 
	 * @throws TestLinkAPIException 
	*//*
<<<<<<< HEAD
	@Test
	public void TTTK_004_KiểmtraCácTrườngThôngTinKhôngThểEdit() throws IOException, TestLinkAPIException{
=======
//	@Test
	public void TTTK_004_KiểmtraCácTrườngThôngTinKhôngThểEdit() throws IOException{
>>>>>>> QC-22, QC-23, QC-24
		info("Kiểm tra các trường thông tin không thể edit");
		String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(1));
		int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(1)));
		String currentID =accDetail.getByArrayTypeRandom(fields.authorized_identification,accDetail.index.get(1));
		String input=authoList.getIdentificationRandom(currentID);
		
		String text = getRandomString();
		String fromDate = getCurrentDate("dd/MM/YYYY");
		String toDate = getDayOfNextYear("dd/MM/YYYY",1);
		
		info("Step1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		
		info("Step3: Thay đổi thông tin khách hàng");
		thongtin.authorized(input, text, fromDate, toDate);
		
		info("Step4:Kiểm tra các trường thông tin bị disabled");
		scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_HOTEN), driver);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_HOTEN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_CMND,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_NGAYCAP,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_NOICAP,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_NGAYSINH,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINHCHUNG_READONLY_NOISINH,3000,1);
		
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_MATHANHVIEN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_MATHE,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_NGAYHETHANTHE,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_NGAYPHATHANHTHE,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_SODUTAIKHOAN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_TRANGTHAITAIKHOAN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_EMONEY_READONLY_TRANGTHAITHE,3000,1);
		
		scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_READONLY_DIACHICHITIET), driver);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_READONLY_DIACHICHITIET,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_READONLY_TINHTHANH,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_READONLY_QUANHUYEN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THUONGTRU_READONLY_PHUONGXA,3000,1);
		
		scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINBHXH_READONLY_SOBHXH), driver);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINBHXH_READONLY_SOBHXH,3000,1);
		scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINUYQUYEN_READONLY_HOTEN), driver);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINUYQUYEN_READONLY_HOTEN,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINUYQUYEN_READONLY_NGAYCAP,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINUYQUYEN_READONLY_NOICAP,3000,1);
		waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINUYQUYEN_READONLY_SODIENTHOAI,3000,1);
	}
	*/
	
	/**
	* Test ID:TTTK_008
	* Test case name:Kiểm tra việc rút tiền theo chủ tài khoản không cần điền mã thẻ
	* Precondition:
	* Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
	* Test Steps:
	*1. Vào trang WEB
	*2. Nhập số thẻ hoặc CMND
	*3. Ấn Enter hoặc click icon Search
	*4. Tìm đến phần Thông tin ủy quyền và nhập số CMND
	*5. Ấn nút Tìm 
	*6. Click vào link Rút tiền
	*7. Input số thẻ, số tiền và mã pin
	*8. Ấn nút đồng ý
	* Expected Result:
	* Xác định thông tin chủ tải khoản được hiển thị đúng bên cạnh trong phần thông tin chủ thẻ
	* Xác định số tiền rút bị trừ đúng và được ghi lại trong DB
	 * @throws Exception 
	*/
	/*@Test
	public void TTTK_005_KiểmtraViệcRútTiềnTheoChủTàiKhoảnKhôngCầnĐiềnMãThẻ() throws Exception{
		info("Kiểm tra việc rút tiền theo chủ tài khoản không cần điền mã thẻ");
		info("Khởi tạo các tham số");
		String mota=getRandomString();
		String message = mesg.getMessageByArrayTypeRandom(9);
		int idType=5;
		
		info("Lấy mã thẻ từ Database");
		String keyWord = accWidthdraw.getByArrayTypeRandom(fieldWidthdraw.card_no,accWidthdraw.index.get(0));
		
		info("Lấy mã pin của staff từ Database");
		staffInfo.setData("","",false, jdbcDriver,dbUrl,user,pass,thongtin.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		String maPin = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,staffInfo.index.get(0));
		
		info("Step1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		
		info("Step3: Mở trang rút tiền");
		thongtin.goToRutTien();
		waitForAndGetElement(thongtin.ELEMENT_TTTK_RUTTIEN_SOTIEN_FIELD,3000,1);
		
		info("Step 4: Thực hiện rút tiền");
		thongtin.rutTien(false,"", "",mota, maPin);
		thongtin.rutTien_save();
		thongtin.acceptConfirmPopup();
		
		info("Step5:Kiểm tra việc rút tiền thành công");
		waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
		String newSotien=waitForAndGetElement(thongtin.ELEMENT_TTTK_RUTTIEN_SODU_FIELD).getText();
		if(Integer.parseInt(newSotien)!=0)
			assert false:"Số tiền còn lại sau khi rút không đúng";
		info("Step6:Kiểm tra việc thẻ link với account và được lưu trong DB");
		info("Step6-1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step6-2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		info("Step6-3: Thẻ được link với account và đã được lưu trong DB");
		if(Integer.parseInt(newSotien)!=0)
			assert false:"Số tiền còn lại sau khi rút không đúng";
		
	}*/

	/**
	* Test ID:TTTK_008
	* Test case name:Kiểm tra việc rút tiền theo chủ tài khoản không cần điền mã thẻ
	* Precondition:
	* Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
	* Test Steps:
	*1. Vào trang WEB
	*2. Nhập số thẻ hoặc CMND
	*3. Ấn Enter hoặc click icon Search
	*4. Tìm đến phần Thông tin ủy quyền và nhập số CMND
	*5. Ấn nút Tìm 
	*6. Click vào link Rút tiền
	*7. Input số thẻ, số tiền và mã pin
	*8. Ấn nút đồng ý
	* Expected Result:
	* Xác định thông tin chủ tải khoản được hiển thị đúng bên cạnh trong phần thông tin chủ thẻ
	* Xác định số tiền rút bị trừ đúng và được ghi lại trong DB
	 * @throws Exception 
	*/
	/*@Test
	public void TTTK_006_KiểmtraViệcRútTiềnTheoChủTàiKhoảnKhôngCầnĐiềnMãThẻ() throws Exception{
		info("Kiểm tra việc rút tiền theo chủ tài khoản không cần điền mã thẻ");
		info("Khởi tạo các tham số");
		String mota=getRandomString();
		String message = mesg.getMessageByArrayTypeRandom(9);
		int idType=5;
		
		info("Lấy mã thẻ từ Database");
		String keyWord = accWidthdraw.getByArrayTypeRandom(fieldWidthdraw.card_no,accWidthdraw.index.get(0));
		
		info("Lấy mã pin của staff từ Database");
		staffInfo.setData("","",false, jdbcDriver,dbUrl,user,pass,thongtin.sqlQueryStaffInfo.replace("$username",USER_ROOT));
		String maPin = staffInfo.getByArrayTypeRandom(fieldStaff.pincode,staffInfo.index.get(0));
		
		info("Step1: Mở trang rút tiền");
		hp.goToRutTien();
		
		info("Step2:Nhập mã thẻ vào trường search");
		rutTien.search(keyWord);
		
		info("Step 4: Thực hiện rút tiền");
		
		thongtin.rutTien(false,"", "",mota, maPin);
		thongtin.rutTien_save();
		thongtin.acceptConfirmPopup();
		
		info("Step5:Kiểm tra việc rút tiền thành công");
		waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
		String newSotien=waitForAndGetElement(thongtin.ELEMENT_TTTK_RUTTIEN_SODU_FIELD).getText();
		if(Integer.parseInt(newSotien)!=0)
			assert false:"Số tiền còn lại sau khi rút không đúng";
		info("Step6:Kiểm tra việc thẻ link với account và được lưu trong DB");
		info("Step6-1: Mở trang thông tin tài khoản");
		hp.goToThongTinTaiKhoan();
		
		info("Step6-2: Nhập CMND/Card vào trường search");
		thongtin.search(idType,keyWord);
		info("Step6-3: Thẻ được link với account và đã được lưu trong DB");
		if(Integer.parseInt(newSotien)!=0)
			assert false:"Số tiền còn lại sau khi rút không đúng";
		
	}*/
	
	
}

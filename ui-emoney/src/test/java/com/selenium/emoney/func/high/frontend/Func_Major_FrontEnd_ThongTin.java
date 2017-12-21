package com.selenium.emoney.func.high.frontend;
public class Func_Major_FrontEnd_ThongTin extends TestConfigThongTin{		
	/*	*//**
		* Test ID:TT_1
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
		@Test
		public void TT_01_TimKiemTheoCMNDTonTai() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Theo CMND Tồn Tại Trong Hệ Thống");
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Vào trang thông tin");
			hp.goToThongTinTaiKhoan();
			
			info("Step2-3: Nhập CMND và Ấn Enter");
			thongtin.search(idType,keyWord);
		}
		
		*//**
		* Test ID:TT_2
		* Test case name:Tìm Kiếm Theo Số Thẻ Tồn Tại Trong Hệ Thống Đã Được Link Account
		* Precondition:
		*Account đã link với số thẻ tồn tại trong hệ thống của VNPOST và EMoney
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ
		*3. Ấn Enter hoặc click icon Search
		* Expected Result:
		*Hiển thị trang thông tin của khách hàng
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_02_TìmKiếmTheoSốThẻTồnTạiTrongHệThốngĐãĐượcLinkAccount() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Theo Số Thẻ Tồn Tại Trong Hệ Thống Đã Được Link Account");
			String keyWord = accDetail.getByArrayTypeRandom(fields.card_no,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Vào trang thông tin");
			hp.goToThongTinTaiKhoan();
			
			info("Step2-3: Nhập Card và Ấn Enter");
			thongtin.search(idType,keyWord);
		}
		
		*//**
		* Test ID:TT_3
		* Test case name:Tìm Kiếm Theo Số Thẻ Tồn Tại Trong Hệ Thống Chưa Được Link Account
		* Precondition:
		*Thẻ tồn tại trong hệ thống nhưng chưa link với account nào
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ
		*3. Ấn Enter hoặc click icon Search
		* Expected Result:
		*Hiển thị thông báo lỗi không tìm thấy tài khoản khách hàng
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_03_TìmKiếmTheoSốThẻTồnTạiTrongHệThốngChưaĐượcLinkAccount() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Theo Số Thẻ Tồn Tại Trong Hệ Thống Chưa Được Link Account");
			String keyWord = accDetail.getByArrayTypeRandom(fields.card_no,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			String message =mesg.getMessageByArrayTypeRandom(1);
			
			info("Step1: Vào trang thông tin");
			hp.goToThongTinTaiKhoan();
			
			info("Step2-3: Nhập Card và Ấn Enter");
			thongtin.search(idType,keyWord);
			
			info("Step4:Kiểm tra error message hiển thị");
			thongtin.message(message);
		}
		
		*//**
		* Test ID:TT_4
		* Test case name:Tìm Kiếm Tài Khoản Bằng Link Khi Chưa Từng Tìm Kiếm Tài Khoản Nào Trước Đó
		* Precondition:
		*Account có CMND tồn tại trong hệ thống của VNPOST và EMoney
		* Test Steps:
		*1. Vào trang WEB 
		*2. Paste link sau lên trình duyệt: http://[Link_Test]/account/[ID_Account_Trong_DB]/
		* Expected Result:
		*Vẫn hiển thị trang thông tin tìm kiếm và không hiển thị thông tin chi tiết về tài khoản có id đó
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_04_TìmKiếmTàiKhoảnBằngLinkKhiChưaTừngTìmKiếmTàiKhoảnNàoTrướcĐó() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Tài Khoản Bằng Link Khi Chưa Từng Tìm Kiếm Tài Khoản Nào Trước Đó");
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			thongtin.search(idType,keyWord);
			String currentUrl =driver.getCurrentUrl();
			String url= currentUrl.replaceAll("\\d+","2");
			
			info("Paste link sau lên trình duyệt: http://[Link_Test]/account/[ID_Account_Trong_DB]/");
			driver.get(url);
			Utils.pause(3000); 
			waitForAndGetElement(thongtin.ELEMENT_TTTK_SEARCH_FIELD,3000,1);
		}
		
		*//**
		* Test ID:TT_5
		* Test case name:Tìm Kiếm Tài Khoản Bằng Link Khi Đã Từng Tìm Kiếm Một Tài Khoản Trước Đó
		* Precondition:
		*Account có CMND tồn tại trong hệ thống của VNPOST và EMoney
		* Test Steps:
		*1. Vào trang WEB 
		*2. Nhập số CMND hoặc thẻ
		*3. Ấn Enter hoặc click vào nút Tìm kiếm
		*4. Chắc chắn rằng thông tin chi tiết về account đó được hiển thị
		*5. Paste link sau lên trình duyệt: http://[Link_Test]/account/[ID_Account_Khác_Trong_DB]/
		* Expected Result:
		*Hiển thị trang thông tin tìm kiếm và không hiển thị thông tin chi tiết về tài khoản có id đó
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_05_TìmKiếmTàiKhoảnBằngLinkKhiĐãTừngTìmKiếmMộtTàiKhoảnTrướcĐó() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Tài Khoản Bằng Link Khi Đã Từng Tìm Kiếm Một Tài Khoản Trước Đó");
			String keyWord1 = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			String keyWord2 = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(1));
			int idType1=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			int idType2=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(1)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND hoặc thẻ");
			thongtin.search(idType1,keyWord1);
			String currentUrl =driver.getCurrentUrl();
			
			info("Step3: Mở trang tài khoản lần nữa");
			hp.goToThongTinTaiKhoan();
			
			info("Step4: Nhập CMND hoặc Card của tài khoản khác");
			thongtin.search(idType2,keyWord2);
			
			info("Step5: Pass url ở step 2");
			driver.get(currentUrl);
			Utils.pause(3000); 
			
			info("Step6: Kiểm tra trang thông tin tìm kiếm được hiển thị");
			waitForAndGetElement(thongtin.ELEMENT_TTTK_SEARCH_FIELD,3000,1);
		}
		
		*//**
		* Test ID:TT_9
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
		@Test
		public void TT_06_KiểmTraThôngTinTrênFormVớiDBVNPOst() throws IOException, TestLinkAPIException{
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
					assert false:"Các giá trị từ WEB:"+listDataFromWEB.get(i)+" với giá trị từ DB "+listDataFromDB.get(i)+"";
			}
			
		}
		
		*//**
		* Test ID:TT_12
		* Test case name:Kiểm Tra Việc Thay Đổi Theo Giới Tính
		* Precondition:
		*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Thay đổi Giới Tính của khách hàng 
		*5. Ấn nút Cập nhật
		* Expected Result:
		*+Thông tin khách hàng được cập nhật mới và được lưu lại trong DB của VNPOST
		*+ Hiên thị thông báo thông tin khách hàng đã được lưu thành công
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_07_KiểmTraViệcThayĐổiTheoGiớiTính() throws IOException, TestLinkAPIException{
			info("Kiểm Tra Việc Thay Đổi Theo Tên");
			String input="";
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			int genderId= Integer.parseInt(accDetail.getByArrayTypeRandom(fields.gender,accDetail.index.get(0)));
			if(genderId==0)input="1";
			else input="0";
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			
			info("Step3: Thay đổi thông tin khách hàng");
			thongtin.update(input, fieldsUpdate.GENDER);
			thongtin.saveUpdate();
			
			info("Step4:Kiểm tra việc update thành công");
			String message = mesg.getMessageByArrayTypeRandom(2);
			waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
			
			info("Step5:Kiểm tra việc lưu thông tin thành công");
			hp.goToThongTinTaiKhoan();
			
			info("Step5-1: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			String inputAfterSave=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_THONGTINCHUNG_GENDER).getAttribute("value");
			if(input.equals(inputAfterSave))
	 		    assert false: "Dữ liệu không được save";
		}
		
		
		
		*//**
		* Test ID:TT_16
		* Test case name:Kiểm Tra Việc In Số Dư Tài Khoản Thành Công
		* Precondition:
		*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Click vào nút In số dư tài khoản
		*5. Thực hiện việc in
		* Expected Result:
		*Có thể in bình thường ra máy in thực hoặc file theo đúng mẫu in hiển thị trên form
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_08_KiểmTraViệcInSốDưTàiKhoảnThànhCông() throws IOException, TestLinkAPIException{
			info("Kiểm Tra Việc Thay Đổi Theo Tên");
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			
			info("Step3: In số dư tài khoản");
			thongtin.printSoduTK(true,accDetail.index.get(0).toString());
		}
		
		*//**
		* Test ID:TT_17
		* Test case name:Kiểm Tra Việc Hủy In Số Dư Tài Khoản
		* Precondition:
		*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Click vào nút In số dư tài khoản
		*5. Hủy việc in
		* Expected Result:
		*Việc in bị hủy và không thể in thông tin
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_09_KiểmTraViệcHủyInSốDưTàiKhoản() throws IOException, TestLinkAPIException{
			info("Kiểm Tra Việc Thay Đổi Theo Tên");
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			
			info("Step3: In số dư tài khoản");
			thongtin.printSoduTK(false,"");
		}
		
		
		*//**
		* Test ID:TT_28
		* Test case name:Kiểm Tra Việc Thay Đổi Địa Chỉ Chi Tiết
		* Precondition:
		*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Thay đổi Địa chỉ chi tiết
		*5. Ấn nút Cập nhật
		* Expected Result:
		*+Thông tin khách hàng được cập nhật mới và được lưu lại trong DB của VNPOST
		*+ Hiên thị thông báo thông tin khách hàng đã được lưu thành công
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_10_KiểmTraViệcThayĐổiĐịaChỉChiTiếtTạmTrú() throws IOException, TestLinkAPIException{
			info("Kiểm Tra Việc Thay Đổi Địa Chỉ Chi Tiết Tạm Trú");
			String input=getRandomString();
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			
			info("Step3: Thay đổi thông tin khách hàng");
			thongtin.update(input, fieldsUpdate.TAMTRU_DIACHICHITIET);
			thongtin.saveUpdate();
			
			info("Step4:Kiểm tra việc update thành công");
			String message = mesg.getMessageByArrayTypeRandom(2);
			waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
			
			info("Step5:Kiểm tra việc lưu thông tin thành công");
			hp.goToThongTinTaiKhoan();
			
			info("Step5-1: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			String inputAfterSave=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_DIACHICHITIET_FILED).getAttribute("value");
			scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_DIACHICHITIET_FILED), driver);
			if(input.equals(inputAfterSave))
	 		    assert false: "Dữ liệu không được save";
		}
		
		*//**
		* Test ID:TT_29
		* Test case name:Kiểm Tra Việc Thay Đổi Tỉnh/Thành
		* Precondition:
		*Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Thay đổi Tỉn/Thành
		*5. Ấn nút Cập nhật
		* Expected Result:
		*+Thông tin khách hàng được cập nhật mới và được lưu lại trong DB của VNPOST
		*+ Hiên thị thông báo thông tin khách hàng đã được lưu thành công
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_11_KiểmTraViệcThayĐổiTỉnhThànhTạmTrú() throws IOException, TestLinkAPIException{
			info("Kiểm Tra Việc Thay Đổi Tỉnh/Thành Tạm Trú");
			String currentName=accDetail.getByArrayTypeRandom(fields.address_province,accDetail.index.get(0));
			String input= provinceList.getNameRandom(currentName);
			info("input1:"+input);
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(0));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(0)));
			
			info("Step1: Mở trang thông tin tài khoản");
			hp.goToThongTinTaiKhoan();
			
			info("Step2: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			
			info("Step3: Thay đổi thông tin khách hàng");
			thongtin.update(input, fieldsUpdate.TAMTRU_TINHTHANH);
			thongtin.saveUpdate();
			
			info("Step4:Kiểm tra việc update thành công");
			String message = mesg.getMessageByArrayTypeRandom(2);
			waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
			
			info("Step5:Kiểm tra việc lưu thông tin thành công");
			hp.goToThongTinTaiKhoan();
			
			info("Step5-1: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			String inputAfterSave=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_TINHTHANH_SELECTBOX).getText();
			
			info("inputAfterSave:"+inputAfterSave);
			scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_TAMTRU_TINHTHANH_FILED), driver);
			if(input.equals(inputAfterSave))
	 		    assert false: "Dữ liệu không được save";
		}
		
		*//**
		* Test ID:TT_47
		* Test case name:Tìm Kiếm Số CMND Ủy Quyền Tồn Tại Trong Hệ Thống
		* Precondition:
		* Số thẻ và CMND tồn tại trong hệ thống. Thẻ được link đến 1 account trong hệ thống
		* Test Steps:
		*1. Vào trang WEB
		*2. Nhập số thẻ hoặc CMND
		*3. Ấn Enter hoặc click icon Search
		*4. Tìm đến phần Thông tin ủy quyền và nhập số CMND
		*5. Ấn nút Tìm 
		* Expected Result:
		*Các thông tin về người ủy quyền như: Họ Tên, Ngày cấp, Nơi cấp, Số điện thoại sẽ được tự động fill  dữ liệu
		 * @throws IOException 
		 * @throws TestLinkAPIException 
		*//*
		@Test
		public void TT_12_TìmKiếmSốCMNDỦyQuyềnTồnTạiTrongHệThống() throws IOException, TestLinkAPIException{
			info("Tìm Kiếm Số CMND Ủy Quyền Tồn Tại Trong Hệ Thống");
			String keyWord = accDetail.getByArrayTypeRandom(fields.identification,accDetail.index.get(2));
			int idType=Integer.valueOf(accDetail.getByArrayTypeRandom(fields.id_type,accDetail.index.get(2)));
			
			String currentID =accDetail.getByArrayTypeRandom(fields.authorized_identification,accDetail.index.get(2));
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
			thongtin.saveUpdate();
			
			info("Step4:Kiểm tra việc update thành công");
			String message = mesg.getMessageByArrayTypeRandom(2);
			waitForAndGetElement(thongtin.ELEMENT_MESSAGE.replace("$mess",message),3000,1);
			
			info("Step5:Kiểm tra việc lưu thông tin thành công");
			hp.goToThongTinTaiKhoan();
			
			info("Step5-1: Nhập CMND/Card vào trường search");
			thongtin.search(idType,keyWord);
			String inputAfterSave=waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_CMND_FILED).getAttribute("value");
			
			info("inputAfterSave:"+inputAfterSave);
			scrollToElement(waitForAndGetElement(thongtin.ELEMENT_TTTK_THONGTIN_UYQUYEN_CMND_FILED), driver);
			if(input.equals(inputAfterSave))
	 		    assert false: "Dữ liệu không được save";
		}
		
		*//**
		* Test ID:TT_49
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
		@Test
		public void TT_13_KiểmTraViệcThayĐổiTheoSốCMNDỦyQuyềnTồnTạiTrongHệThốngKhiĐiềnĐầyĐủThôngTin() throws IOException, TestLinkAPIException{
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
		}*/
}
package com.selenium.emoney.func.high.frontend;
import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.info;
public class Func_High_FrontEnd_QuanLyGiaoDich extends TestConfig3{		
		/**
		* Test ID:EM-294
		* Test case name:Kiểm Tra Giá Trị Search Default
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Quan sát các giá trị default trong phần tìm kiếm
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* +Từ Ngày và Đến Ngày Hiển thị Ngày hiện tại
		* + Trạng Thái không có giá trị
		* +Loại giao dịch không có giá trị
		* + Hệ thống tự động load các giao dịch phát sinh trong Ngày khi mở trang Quản lý giao dịch
		 * @throws TestLinkAPIException 
		*/
		@Test
		public void EM_294_KiểmTraGiáTrịSearchDefault() throws TestLinkAPIException{
			 info("Kiểm tra giá trị search default");
			 testCaseID="EM-294";
			 
			 mgLogInOut.login(config.USER_STAFF_01,config.USER_PASS, true);
		}
		
		/**
		* Test ID:EM-295
		* Test case name:Kiểm Tra Tìm Kiếm Với Từ Ngày Nhỏ Hơn Đến Ngày
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập Từ ngày nhỏ hơn Đến ngày
		* 4. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Hiển thị tất cả các giao dịch theo đúng điều kiện tìm kiếm theo đúng dữ liệu của cấp bưu cục đó
		*/
		@Test
		public void EM_295_KiểmTraTìmKiếmVớiTừNgàyNhỏHơnĐếnNgày(){
			 info("Kiểm tra tìm kiếm với Từ ngày nhỏ hơn Đến ngày");
			 testCaseID="EM-295";
		}
		
		
		/**
		* Test ID:EM-297
		* Test case name:Kiểm Tra Tìm Kiếm Theo Các Trạng Thái
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập đúng các điều kiện về ngày
		* 4. Chọn các trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được chọn
		* Hiển thị tất cả các giao dịch theo đúng điều kiện tìm kiếm theo đúng dữ liệu của cấp bưu cục đó
		*/
		@Test
		public void EM_297_KiểmTraTìmKiếmTheoCácTrạngThái(){
			 info("Kiểm tra tìm kiếm theo các trạng thái");
			 testCaseID="EM-297";
		}
		
		/**
		* Test ID:EM-298
		* Test case name:Kiểm Tra Tìm Kiếm Theo Các Loại Giao Dịch
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Giữ nguyên ngày
		* 4. Chọn các loại giao dịch
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được giữ nguyên
		* Thông tin được chọn
		* Hiển thị tất cả các giao dịch theo đúng điều kiện tìm kiếm theo đúng dữ liệu của cấp bưu cục đó
		*/
		@Test
		public void EM_298_KiểmTraTìmKiếmTheoCácLoạiGiaoDịch(){
			 info("Kiểm tra tìm kiếm theo các loại giao dịch");
			 testCaseID="EM-298";
		}
		
		/**
		* Test ID:EM-299
		* Test case name:Kiểm Tra Tìm Kiếm Theo Loại Giao Dịch Và Trạng Thái
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Giữ nguyên ngày 
		* 4. Chọn các loại giao dịch và trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được giữ nguyên
		* Thông tin được chọn
		* Hiển thị tất cả các giao dịch theo đúng điều kiện tìm kiếm theo đúng dữ liệu của cấp bưu cục đó
		*/
		@Test
		public void EM_299_KiểmTraTìmKiếmTheoLoạiGiaoDịchVàTrạngThái(){
			 info("Kiểm tra tìm kiếm theo loại giao dịch và trạng thái");
			 testCaseID="EM-299";
		}
		
		/**
		* Test ID:EM-300
		* Test case name:Kiểm Tra Tìm Kiếm Theo Ngày, Loại Giao Dịch Và Trạng Thái Kết Hợp
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập đúng các điều kiện về ngày
		* 4. Chọn các loại giao dịch và trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được chọn
		* Hiển thị tất cả các giao dịch theo đúng điều kiện tìm kiếm theo đúng dữ liệu của cấp bưu cục đó
		*/
		@Test
		public void EM_300_KiểmTraTìmKiếmTheoNgàyLoạiGiaoDịchVàTrạngTháiKếtHợp(){
			 info("Kiểm tra tìm kiếm theo ngày, loại giao dịch và trạng thái kết hợp");
			 testCaseID="EM-300";
		}
		
		
		
		/**
		* Test ID:EM-302
		* Test case name:Kiểm Tra Việc Hủy Giao Dịch Từ Quản Lý Giao Dịch
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập đúng các điều kiện về ngày
		* 4. Chọn các loại giao dịch và trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* 6. Chọn 1 giao dịch và click nút Hủy
		* 7. Thực hiện hủy giao dịch
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được chọn
		* Thông tin tìm kiếm được hiển thị
		* Nút Hủy được click
		* Giao dịch được hủy thành công và chuyển sang chờ duyệt
		*/
		@Test
		public void EM_302_KiểmTraViệcHủyGiaoDịchTừQuảnLýGiaoDịch(){
			 info("Kiểm tra việc hủy giao dịch từ quản lý giao dịch");
			 testCaseID="EM-302";
		}
		
		/**
		* Test ID:EM-303
		* Test case name:Kiểm Tra Việc In Sao Kê Của Giao Dịch Hủy
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập đúng các điều kiện về ngày
		* 4. Chọn các loại giao dịch và trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* 6. Chọn 1 giao dịch và click nút Hủy
		* 7. Thực hiện hủy giao dịch
		* 8. Click vào nút in
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được chọn
		* Thông tin tìm kiếm được hiển thị
		* Nút Hủy được click
		* Giao dịch được hủy thành công và chuyển sang chờ duyệt
		* Các thông tin trên sao kê in đúng như trên dữ liệu thông tin của Giao dịch Hủy
		*/
		@Test
		public void EM_303_KiểmTraViệcInSaoKêCủaGiaoDịchHủy(){
			 info("Kiểm tra việc in sao kê của giao dịch hủy");
			 testCaseID="EM-303";
		}
		
		/**
		* Test ID:EM-304
		* Test case name:Kiểm Tra Việc Xem Chi Tiết Giao Dịch VNP
		* Importance:High
		* Execution Type:Automated
		* Precondition:
		* User được phân quyền truy cập phần này
		* Test Steps:
		* 1. Mở trang
		* 2. Click vào Quản lý Giao dịch
		* 3. Nhập đúng các điều kiện về ngày
		* 4. Chọn các loại giao dịch và trạng thái
		* 5. CLick vào nút Tìm kiếm hoặc ấn nút Enter
		* 6. Click vào 1 link của một giao dịch trong cột Số hiệu giao dịch VNP
		* Expected Result:
		* Trang được hiển thị
		* Trang được hiển thị
		* Thông tin được nhập
		* Thông tin được chọn
		* Thông tin tìm kiếm được hiển thị
		* Hiển thị đúng thông tin chi tiết của giao dịch giống như trong DB
		*/
		@Test
		public void EM_304_KiểmTraViệcXemChiTiếtGiaoDịchVNP(){
			 info("Kiểm tra việc xem chi tiết giao dịch VNP");
			 testCaseID="EM-304";
		}
		
		
}
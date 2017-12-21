package org.selenium.emoney.func.high.admin;

public class Func_High_Admin_Add_Permission extends TestConfig{
	
  /* *//**
    * Tạo danh sách phân quyền trong admin
 * @throws TestLinkAPIException 
    *//*
	@Test
	public void DD001_TaoDanhSachQuyenFullQuyen() throws TestLinkAPIException{
		info("DD001:Tạo danh sách quyền trong admin");
		info("Lấy dữ liệu");
		String tenRole="";
		String moTa="Có tất cả các quyền trong ";
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=1;i<11;i++){
			tenRole=PerListData.getNameByArrayTypeRandom(i);
			info("Tạo nhóm quyền mới");
			mangPermission.createParentRole(tenRole,moTa+tenRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD002_TaoDanhSachQuyenNhoTrongQuanLyTK() throws TestLinkAPIException{
		info("DD002:Tạo danh sách quyền con trong quản lý tài khoản");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(1);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(111);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD003_TaoDanhSachQuyenNhoTrongQuanLyUyQuyen() throws TestLinkAPIException{
		info("DD003:Tạo danh sách quyền con trong quản lý ủy quyền");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(2);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(222);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD004_TaoDanhSachQuyenNhoTrongQuanLyBaoCao() throws TestLinkAPIException{
		info("DD004:Tạo danh sách quyền con trong quản lý Báo cáo");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(4);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(444);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD005_TaoDanhSachQuyenNhoTrongQuanLyGiaoDich() throws TestLinkAPIException{
		info("DD005:Tạo danh sách quyền con trong quản lý giao dịch");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(3);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(333);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD006_TaoDanhSachQuyenNhoTrongQuanLyHoSoCaNhan(){
		info("DD006:Tạo danh sách quyền con trong quản lý hồ sơ cá nhân");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(5);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(555);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD007_TaoDanhSachQuyenNhoTrongQuanLyMauIn() throws TestLinkAPIException{
		info("DD007:Tạo danh sách quyền con trong quản lý mẫu in");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(6);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(666);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD008_TaoDanhSachQuyenNhoTrongQuanLyDoiSoat(){
		info("DD008:Tạo danh sách quyền con trong quản lý đối soát");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(7);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(777);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD009_TaoDanhSachQuyenNhoTrongQuanLyThaoTacHangLoat() throws TestLinkAPIException{
		info("DD009:Tạo danh sách quyền con trong quản lý thao tác hàng loạt");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(8);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(888);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD010_TaoDanhSachQuyenNhoTrongQuanLyNguoiDung() throws TestLinkAPIException{
		info("DD010:Tạo danh sách quyền con trong quản lý người dùng");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(9);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(999);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}
	
	@Test
	public void DD011_TaoDanhSachQuyenNhoTrongQuanLyRole() throws TestLinkAPIException{
		info("DD011:Tạo danh sách quyền con trong quản lý role");
		info("Lấy dữ liệu");
		String tenChildRole="";
		String moTa="Có quyền ";
		String tenParentRole=PerListData.getNameByArrayTypeRandom(10);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = PerListData.getArrayNameByType(100);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayList.size();i++){
			tenChildRole=arrayList.get(i);
			info("Tạo nhóm quyền mới cho quyền: "+tenChildRole);
			if(i==0) i=1;
			mangPermission.createChildRole(tenParentRole,tenChildRole,moTa+tenChildRole,true);
			mangPermission.goToHomePage();
		}
	}*/
	
}

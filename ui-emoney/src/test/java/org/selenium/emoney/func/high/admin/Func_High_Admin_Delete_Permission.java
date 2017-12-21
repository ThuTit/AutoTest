package org.selenium.emoney.func.high.admin;

import java.util.ArrayList;

import org.testng.annotations.Test;

import testlink.api.java.client.TestLinkAPIException;
import static org.selenium.common.TestLogger.*;

public class Func_High_Admin_Delete_Permission extends TestConfig{
	
 /*  *//**
    * Xóa một quyền trong danh sách
 * @throws TestLinkAPIException 
    *//*
	@Test
	public void DD001_XoaToanBoNhomQuyen() throws TestLinkAPIException{
		info("DD001:Xóa toan bộ các nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole="";
		
		ArrayList<String> arrayDeleteList = new ArrayList<String>();
		arrayDeleteList = PerListData.getArrayNameDeleteByType(1);
		
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		
		for(int i=0;i<arrayDeleteList.size();i++){
			tenRole=arrayDeleteList.get(i);
			info("Xóa nhóm quyền:"+tenRole);
			mangPermission.delete(tenRole);
		}
	}
	
	@Test
	public void DD002_XoaNhomQuyenQLTK() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(111);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	
	@Test
	public void DD003_XoaNhomQuyenQLUQ() throws TestLinkAPIException{
		info("DD003:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(222);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	
	@Test
	public void DD002_XoaNhomQuyenBaoCao() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(444);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	@Test
	public void DD002_XoaNhomQuyenQLGD() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(3333);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	@Test
	public void DD002_XoaNhomQuyenHSCN(){
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(555);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	@Test
	public void DD002_XoaNhomQuyenMauIn() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(666);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	@Test
	public void DD002_XoaNhomQuyenQLDS(){
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(777);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	@Test
	public void DD002_XoaNhomQuyenQLTTHL() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(888);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	
	@Test
	public void DD002_XoaNhomQuyenQLND() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(999);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}
	
	@Test
	public void DD002_XoaNhomQuyenQLRole() throws TestLinkAPIException{
		info("DD002:Xóa một nhóm quyền trong danh sách");
		info("Lấy dữ liệu");
		String tenRole=PerListData.getNameByArrayTypeRandom(100);
		info("Step 1: mở trang quản lý nhóm quyền");
		magPerHomePage.goToQuanLyNhomQuyen();
		info("Xóa nhóm quyền:"+tenRole);
		mangPermission.delete(tenRole);
	}*/
}
	

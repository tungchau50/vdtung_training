package com.example.demo;

public class DangKyLopHocDto {

	private String maLop;
	public String getMaLop() {
		return maLop;
	}
	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}
	public int getSoSV() {
		return soSV;
	}
	public void setSoSV(int soSV) {
		this.soSV = soSV;
	}
	public GiaoVienDto getGv() {
		return gv;
	}
	public void setGv(GiaoVienDto gv) {
		this.gv = gv;
	}
	public SinhVienDto getSv() {
		return sv;
	}
	public void setSv(SinhVienDto sv) {
		this.sv = sv;
	}
	private int soSV;
	private GiaoVienDto sv;
	private SinhVienDto sv;
	
	public DangKyLopHocDto() {
	}
}

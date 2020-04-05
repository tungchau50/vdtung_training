package com.example.demo;

import javax.validation.Valid;

public class GiaoVienDto {

	@Valid
	private String mgv;
	
	private int tuoi;
	private int tuoi1;
	private String tenGV;

	public String getMgv() {
		return mgv;
	}
	public void setMgv(String msv) {
		this.mgv = msv;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenSV) {
		this.tenGV = tenSV;
	}
	
	public void dklh () {
		DangKyLopHocDto dklh = new DangKyLopHocDto();
		dklh.getSv();
		dklh.getSv();
	}
}

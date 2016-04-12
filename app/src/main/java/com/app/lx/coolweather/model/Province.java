package com.app.lx.coolweather.model;

/**
 * Created by lx on 16/4/11.
 */
public class Province {
	private  int id;
	private String provinceName;
	private String provinceCode;

	public int getId() {
		return id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}

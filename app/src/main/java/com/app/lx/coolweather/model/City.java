package com.app.lx.coolweather.model;

/**
 * Created by lx on 16/4/11.
 */
public class City {
	private int id;
	private String cityNmae;
	private String cityCode;
	private int provinceId;

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public int getProvinceId() {

		return provinceId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCityNmae(String cityNmae) {
		this.cityNmae = cityNmae;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public int getId() {
		return id;

	}

	public String getCityNmae() {
		return cityNmae;
	}

	public String getCityCode() {
		return cityCode;
	}
}

package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SelectBtnDTO")
public class SelectBtnDTO {
	private String i;
	private String list_D_priceFormat;
	private String list_A_priceFormat;
	private String total_priceFormat;
	private String totalPriceInt;
	private String totalPrice;
	
	@Override
	public String toString() {
		return "SelectBtnDTO [i=" + i + ", list_D_priceFormat=" + list_D_priceFormat + ", list_A_priceFormat="
				+ list_A_priceFormat + ", total_priceFormat=" + total_priceFormat + ", totalPriceInt=" + totalPriceInt
				+ ", totalPrice=" + totalPrice + "]";
	}
	public String getI() {
		return i;
	}
	public void setI(String i) {
		this.i = i;
	}
	public String getList_D_priceFormat() {
		return list_D_priceFormat;
	}
	public void setList_D_priceFormat(String list_D_priceFormat) {
		this.list_D_priceFormat = list_D_priceFormat;
	}
	public String getList_A_priceFormat() {
		return list_A_priceFormat;
	}
	public void setList_A_priceFormat(String list_A_priceFormat) {
		this.list_A_priceFormat = list_A_priceFormat;
	}
	public String getTotal_priceFormat() {
		return total_priceFormat;
	}
	public void setTotal_priceFormat(String total_priceFormat) {
		this.total_priceFormat = total_priceFormat;
	}
	public String getTotalPriceInt() {
		return totalPriceInt;
	}
	public void setTotalPriceInt(String totalPriceInt) {
		this.totalPriceInt = totalPriceInt;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	
}

package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("LoginDTO")
public class LoginDTO {
	private String guID;
	private String name;
	private String e_mail;
	private String phone;
	
	@Override
	public String toString() {
		return "LoginDTO [guID=" + guID + ", name=" + name + ", e_mail=" + e_mail + ", phone=" + phone + "]";
	}
	
	public String getGuID() {
		return guID;
	}
	public void setGuID(String guID) {
		this.guID = guID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}

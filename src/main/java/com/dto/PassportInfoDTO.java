package com.dto;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

//by jungwoo 20201201
@Alias("PassportInfoDTO")
public class PassportInfoDTO {
	private String p_passportNum;
	private String RESERVATION_ID;
	private String p_lastname;
	private String p_firstname;
	private String p_sex;
	private String p_birthday;
	private String p_passportExpirationdate;
	private String p_nationality;
	private String p_issuecountry;
	private List<PassportInfoDTO> list_PassportInfoDTO;
	
	@Override
	public String toString() {
		return "PassportInfoDTO [p_passportNum=" + p_passportNum + ", RESERVATION_ID=" + RESERVATION_ID
				+ ", p_lastname=" + p_lastname + ", p_firstname=" + p_firstname + ", p_sex=" + p_sex + ", p_birthday="
				+ p_birthday + ", p_passportExpirationdate=" + p_passportExpirationdate + ", p_nationality="
				+ p_nationality + ", p_issuecountry=" + p_issuecountry + ", list_PassportInfoDTO="
				+ list_PassportInfoDTO + "]";
	}
	
	public String getP_passportNum() {
		return p_passportNum;
	}
	public void setP_passportNum(String p_passportNum) {
		this.p_passportNum = p_passportNum;
	}
	public String getRESERVATION_ID() {
		return RESERVATION_ID;
	}
	public void setRESERVATION_ID(String rESERVATION_ID) {
		RESERVATION_ID = rESERVATION_ID;
	}
	public String getP_lastname() {
		return p_lastname;
	}
	public void setP_lastname(String p_lastname) {
		this.p_lastname = p_lastname;
	}
	public String getP_firstname() {
		return p_firstname;
	}
	public void setP_firstname(String p_firstname) {
		this.p_firstname = p_firstname;
	}
	public String getP_sex() {
		return p_sex;
	}
	public void setP_sex(String p_sex) {
		this.p_sex = p_sex;
	}
	public String getP_birthday() {
		return p_birthday;
	}
	public void setP_birthday(String p_birthday) {
		this.p_birthday = p_birthday;
	}
	public String getP_passportExpirationdate() {
		return p_passportExpirationdate;
	}
	public void setP_passportExpirationdate(String p_passportExpirationdate) {
		this.p_passportExpirationdate = p_passportExpirationdate;
	}
	public String getP_nationality() {
		return p_nationality;
	}
	public void setP_nationality(String p_nationality) {
		this.p_nationality = p_nationality;
	}
	public String getP_issuecountry() {
		return p_issuecountry;
	}
	public void setP_issuecountry(String p_issuecountry) {
		this.p_issuecountry = p_issuecountry;
	}
	public List<PassportInfoDTO> getList_PassportInfoDTO() {
		return list_PassportInfoDTO;
	}
	public void setList_PassportInfoDTO(List<PassportInfoDTO> list_PassportInfoDTO) {
		this.list_PassportInfoDTO = list_PassportInfoDTO;
	}
	
	
}

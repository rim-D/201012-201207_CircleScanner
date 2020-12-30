package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("ScheduleSearchDTO")
public class ScheduleSearchDTO {
	// 항공권 검색을 위한 객체 생성
	private String SCHEDULE_ID;
	private String DEPARTURE_ACODE;
	private String DESTINATION_ACODE;
	private String DEPART_DATE;
	private String ARRIVE_DATE;
	private String AIRLINE_NAME;
	private String AIRCRAFT_NAME;
	private String PRICE;
	private String DURATION_OF_TIME;
	
	@Override
	public String toString() {
		return "ScheduleSearchDTO [SCHEDULE_ID=" + SCHEDULE_ID + ", DEPARTURE_ACODE=" + DEPARTURE_ACODE
				+ ", DESTINATION_ACODE=" + DESTINATION_ACODE + ", DEPART_DATE=" + DEPART_DATE + ", ARRIVE_DATE="
				+ ARRIVE_DATE + ", AIRLINE_NAME=" + AIRLINE_NAME + ", AIRCRAFT_NAME=" + AIRCRAFT_NAME + ", PRICE="
				+ PRICE + ", DURATION_OF_TIME=" + DURATION_OF_TIME + "]";
	}
	public String getSCHEDULE_ID() {
		return SCHEDULE_ID;
	}
	public void setSCHEDULE_ID(String sCHEDULE_ID) {
		SCHEDULE_ID = sCHEDULE_ID;
	}
	public String getDEPARTURE_ACODE() {
		return DEPARTURE_ACODE;
	}
	public void setDEPARTURE_ACODE(String dEPARTURE_ACODE) {
		DEPARTURE_ACODE = dEPARTURE_ACODE;
	}
	public String getDESTINATION_ACODE() {
		return DESTINATION_ACODE;
	}
	public void setDESTINATION_ACODE(String dESTINATION_ACODE) {
		DESTINATION_ACODE = dESTINATION_ACODE;
	}
	public String getDEPART_DATE() {
		return DEPART_DATE;
	}
	public void setDEPART_DATE(String dEPART_DATE) {
		DEPART_DATE = dEPART_DATE;
	}
	public String getARRIVE_DATE() {
		return ARRIVE_DATE;
	}
	public void setARRIVE_DATE(String aRRIVE_DATE) {
		ARRIVE_DATE = aRRIVE_DATE;
	}
	public String getAIRLINE_NAME() {
		return AIRLINE_NAME;
	}
	public void setAIRLINE_NAME(String aIRLINE_NAME) {
		AIRLINE_NAME = aIRLINE_NAME;
	}
	public String getAIRCRAFT_NAME() {
		return AIRCRAFT_NAME;
	}
	public void setAIRCRAFT_NAME(String aIRCRAFT_NAME) {
		AIRCRAFT_NAME = aIRCRAFT_NAME;
	}
	public String getPRICE() {
		return PRICE;
	}
	public void setPRICE(String pRICE) {
		PRICE = pRICE;
	}
	public String getDURATION_OF_TIME() {
		return DURATION_OF_TIME;
	}
	public void setDURATION_OF_TIME(String dURATION_OF_TIME) {
		DURATION_OF_TIME = dURATION_OF_TIME;
	}

	

}

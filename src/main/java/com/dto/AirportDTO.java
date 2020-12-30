package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("AirportDTO")
public class AirportDTO {
	private String ANAME_E;
	private String ANAME_K; 
	private String IATA_A; 
	private String ICAO_A; 
	private String AREA_A; 
	private String ACOUNTRY_E; 
	private String ACOUNTRY_K; 
	private String ACITY_E; 
	private String ACITY_K;
	
	@Override
	public String toString() {
		return "AirportDTO [ANAME_E=" + ANAME_E + ", ANAME_K=" + ANAME_K + ", IATA_A=" + IATA_A + ", ICAO_A=" + ICAO_A
				+ ", AREA_A=" + AREA_A + ", ACOUNTRY_E=" + ACOUNTRY_E + ", ACOUNTRY_K=" + ACOUNTRY_K + ", ACITY_E="
				+ ACITY_E + ", ACITY_K=" + ACITY_K + "]";
	}

	public String getANAME_E() {
		return ANAME_E;
	}

	public void setANAME_E(String aNAME_E) {
		ANAME_E = aNAME_E;
	}

	public String getANAME_K() {
		return ANAME_K;
	}

	public void setANAME_K(String aNAME_K) {
		ANAME_K = aNAME_K;
	}

	public String getIATA_A() {
		return IATA_A;
	}

	public void setIATA_A(String iATA_A) {
		IATA_A = iATA_A;
	}

	public String getICAO_A() {
		return ICAO_A;
	}

	public void setICAO_A(String iCAO_A) {
		ICAO_A = iCAO_A;
	}

	public String getAREA_A() {
		return AREA_A;
	}

	public void setAREA_A(String aREA_A) {
		AREA_A = aREA_A;
	}

	public String getACOUNTRY_E() {
		return ACOUNTRY_E;
	}

	public void setACOUNTRY_E(String aCOUNTRY_E) {
		ACOUNTRY_E = aCOUNTRY_E;
	}

	public String getACOUNTRY_K() {
		return ACOUNTRY_K;
	}

	public void setACOUNTRY_K(String aCOUNTRY_K) {
		ACOUNTRY_K = aCOUNTRY_K;
	}

	public String getACITY_E() {
		return ACITY_E;
	}

	public void setACITY_E(String aCITY_E) {
		ACITY_E = aCITY_E;
	}

	public String getACITY_K() {
		return ACITY_K;
	}

	public void setACITY_K(String aCITY_K) {
		ACITY_K = aCITY_K;
	} 
	
	
}

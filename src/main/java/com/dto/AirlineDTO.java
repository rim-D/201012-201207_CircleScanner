package com.dto;

import org.apache.ibatis.type.Alias;

@Alias("AirlineDTO")
public class AirlineDTO {
	private String ANAME_E;
	private String ANAME_K;
	private String IATA_A;
	private String ICAO_A;
	private String STATUS_A;
	public AirlineDTO(String aNAME_E, String aNAME_K, String iATA_A, String iCAO_A, String sTATUS_A) {
		super();
		ANAME_E = aNAME_E;
		ANAME_K = aNAME_K;
		IATA_A = iATA_A;
		ICAO_A = iCAO_A;
		STATUS_A = sTATUS_A;
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
	public String getSTATUS_A() {
		return STATUS_A;
	}
	public void setSTATUS_A(String sTATUS_A) {
		STATUS_A = sTATUS_A;
	}
	
	
}

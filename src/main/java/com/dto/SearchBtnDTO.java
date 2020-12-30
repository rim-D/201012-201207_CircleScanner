package com.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("SearchBtnDTO")
public class SearchBtnDTO {
	private String tripType;
	private String originPlace;
	private String destinationPlace;
	private String outboundPartialDate;
	private String inboundPartialDate;
	private String non_stop;
	private String seatGrade;
	private String passenger;
	private int passengerInt;
	
	@Override
	public String toString() {
		return "SearchBtnDTO [tripType=" + tripType + ", originPlace=" + originPlace + ", destinationPlace="
				+ destinationPlace + ", outboundPartialDate=" + outboundPartialDate + ", inboundPartialDate="
				+ inboundPartialDate + ", non_stop=" + non_stop + ", seatGrade=" + seatGrade + ", passenger="
				+ passenger + ", passengerInt=" + passengerInt + "]";
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public String getOriginPlace() {
		return originPlace;
	}
	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}
	public String getDestinationPlace() {
		return destinationPlace;
	}
	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}
	public String getOutboundPartialDate() {
		return outboundPartialDate;
	}
	public void setOutboundPartialDate(String outboundPartialDate) {
		this.outboundPartialDate = outboundPartialDate;
	}
	public String getInboundPartialDate() {
		return inboundPartialDate;
	}
	public void setInboundPartialDate(String inboundPartialDate) {
		this.inboundPartialDate = inboundPartialDate;
	}
	public String getNon_stop() {
		return non_stop;
	}
	public void setNon_stop(String non_stop) {
		this.non_stop = non_stop;
	}
	public String getSeatGrade() {
		return seatGrade;
	}
	public void setSeatGrade(String seatGrade) {
		this.seatGrade = seatGrade;
	}
	public String getPassenger() {
		return passenger;
	}
	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}
	public int getPassengerInt() {
		return passengerInt;
	}
	public void setPassengerInt(int passengerInt) {
		this.passengerInt = passengerInt;
	}
	
	
	
}

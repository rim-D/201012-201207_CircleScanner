package com.dto;

import java.util.List;

import lombok.Data;

//by jungwoo 20201201
public class ReservationDTO {
	private String reservation_ID;
	private String reservation_Name;
	private String reservation_Email;
	private String reservation_phone;
	private int totalPriceInt;
	private String payState;
	private String reservation_Date;
	private List<PassportInfoDTO> list_PassportInfoDTO;
	
	@Override
	public String toString() {
		return "ReservationDTO [reservation_ID=" + reservation_ID + ", reservation_Name=" + reservation_Name
				+ ", reservation_Email=" + reservation_Email + ", reservation_phone=" + reservation_phone
				+ ", totalPriceInt=" + totalPriceInt + ", payState=" + payState + ", reservation_Date="
				+ reservation_Date + ", list_PassportInfoDTO=" + list_PassportInfoDTO + "]";
	}

	public String getReservation_ID() {
		return reservation_ID;
	}

	public void setReservation_ID(String reservation_ID) {
		this.reservation_ID = reservation_ID;
	}

	public String getReservation_Name() {
		return reservation_Name;
	}

	public void setReservation_Name(String reservation_Name) {
		this.reservation_Name = reservation_Name;
	}

	public String getReservation_Email() {
		return reservation_Email;
	}

	public void setReservation_Email(String reservation_Email) {
		this.reservation_Email = reservation_Email;
	}

	public String getReservation_phone() {
		return reservation_phone;
	}

	public void setReservation_phone(String reservation_phone) {
		this.reservation_phone = reservation_phone;
	}

	public int getTotalPriceInt() {
		return totalPriceInt;
	}

	public void setTotalPriceInt(int totalPriceInt) {
		this.totalPriceInt = totalPriceInt;
	}

	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	public String getReservation_Date() {
		return reservation_Date;
	}

	public void setReservation_Date(String reservation_Date) {
		this.reservation_Date = reservation_Date;
	}

	public List<PassportInfoDTO> getList_PassportInfoDTO() {
		return list_PassportInfoDTO;
	}

	public void setList_PassportInfoDTO(List<PassportInfoDTO> list_PassportInfoDTO) {
		this.list_PassportInfoDTO = list_PassportInfoDTO;
	}

	
}

package com.globalneochain.demo.entity;

public class CarBookingData {

	private int bookingId;
	private String customerName;
	private int carId;

	public CarBookingData(String customerName, int bookingId, int carId) {
		this.customerName = customerName;
		this.bookingId = bookingId;
		this.carId = carId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
}

package com.globalneochain.demo.service;

import java.util.List;

import com.globalneochain.demo.entity.CarBookingData;

public interface CarBookingService {

	CarBookingData addBooking(CarBookingData booking);

	List<CarBookingData> getAllBookings();

	boolean deleteBooking(int bookingId);

	boolean updateBooking(int bookingId, CarBookingData booking);
}

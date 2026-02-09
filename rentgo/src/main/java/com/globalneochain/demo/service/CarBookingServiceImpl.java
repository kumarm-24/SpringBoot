package com.globalneochain.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.globalneochain.demo.entity.CarBookingData;

@Service
public  class CarBookingServiceImpl implements CarBookingService {

	private List<CarBookingData> bookingList = new ArrayList<>();

	@Override
	public CarBookingData addBooking(CarBookingData booking) {
		bookingList.add(booking);
		return booking;
	}

	@Override
	public List<CarBookingData> getAllBookings() {
		return bookingList;
	}

	@Override
	public boolean deleteBooking(int bookingId) {
		for (int i = 0; i < bookingList.size(); i++) {
			if (bookingList.get(i).getBookingId() == bookingId) {
				bookingList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateBooking(int bookingId, CarBookingData updatedBooking) {
		for (int i = 0; i < bookingList.size(); i++) {
			if (bookingList.get(i).getBookingId() == bookingId) {
				bookingList.set(i, updatedBooking);
				return true;
			}
		}
		return false;
	}
}

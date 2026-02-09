package com.globalneochain.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globalneochain.demo.entity.CarBookingData;
import com.globalneochain.demo.service.CarBookingService;

@RestController
@RequestMapping("/car-bookings")
public class CarBookingController {

	@Autowired
	private CarBookingService carBookingService;

	@PostMapping("/create")
	public CarBookingData createBooking(@RequestBody CarBookingData booking) {
		return carBookingService.addBooking(booking);
	}

	@GetMapping("/all")
	public List<CarBookingData> getAllBookings() {
		return carBookingService.getAllBookings();
	}

	@DeleteMapping("/delete/{bookingId}")
	public String deleteBooking(@PathVariable int bookingId) {
		boolean status = carBookingService.deleteBooking(bookingId);
		return status ? "Booking deleted successfully" : "Booking not found";
	}

	@PutMapping("/update/{bookingId}")
	public String updateBooking(
			@PathVariable int bookingId,
			@RequestBody CarBookingData booking) {

		boolean status = carBookingService.updateBooking(bookingId, booking);
		return status ? "Booking updated successfully" : "Booking not found";
	}
}

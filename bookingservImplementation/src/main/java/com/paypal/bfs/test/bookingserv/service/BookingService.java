package com.paypal.bfs.test.bookingserv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.paypal.bfs.test.bookingserv.api.model.BookingDao;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	public BookingDao createBooking(BookingDao booking) {
		return bookingRepository.save(booking);
		
	}

	public List<BookingDao> getBookings() {
		return (List<BookingDao>) bookingRepository.findAll();
	}

	

}

package com.paypal.bfs.test.bookingserv.impl;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.model.BookingDao;
import com.paypal.bfs.test.bookingserv.service.BookingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingResourceImpl implements BookingResource {
	@Autowired
	private BookingService bookingService;

    @Override
    public ResponseEntity<BookingDao> create(BookingDao booking) {
    	BookingDao savedBooking =  bookingService.createBooking(booking);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }

	@Override
	public ResponseEntity<List<BookingDao>> getAllBookings() {
		List<BookingDao> listOfBookings = bookingService.getBookings();
		return new ResponseEntity<>(listOfBookings, HttpStatus.OK);
	}
}

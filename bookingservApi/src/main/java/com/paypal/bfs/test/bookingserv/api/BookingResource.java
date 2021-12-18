package com.paypal.bfs.test.bookingserv.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paypal.bfs.test.bookingserv.api.model.BookingDao;


public interface BookingResource {
    /**
     * Create {@link BookingDao} resource
     *
     * @param booking the booking object
     * @return the created booking
     */
    @RequestMapping(value = "/v1/bfs/booking", method = RequestMethod.POST)
    ResponseEntity<BookingDao> create(@RequestBody BookingDao booking);
    
    
    /**
     * get {@link BookingDao} all bookings
     *
     * 
     * @return all the bookings 
     */
    @RequestMapping(value = "/v1/bfs/booking", method = RequestMethod.GET)
    ResponseEntity<List<BookingDao>> getAllBookings();

    // ----------------------------------------------------------
    // TODO - add a new operation for Get All the bookings resource.
    // ----------------------------------------------------------
}

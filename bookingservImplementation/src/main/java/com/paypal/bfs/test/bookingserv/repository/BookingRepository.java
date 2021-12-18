package com.paypal.bfs.test.bookingserv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paypal.bfs.test.bookingserv.api.model.BookingDao;

@Repository
public interface BookingRepository extends CrudRepository<BookingDao, Integer>{

}

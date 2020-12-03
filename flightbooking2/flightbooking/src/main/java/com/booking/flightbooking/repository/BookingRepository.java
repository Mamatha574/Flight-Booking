package com.booking.flightbooking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booking.flightbooking.entity.BookingBean;


@Repository
public interface BookingRepository extends CrudRepository<BookingBean, Integer> {

//	@Modifying
//	@Query("SELECT opm FROM BookingBean opm WHERE opm.firstName=:firstName and opm.lastName=:lastName and opm.flightId=:flightId")
//	@Transactional
//	List<BookingBean> findByFirstNameLastNameFlightId(String firstName, String lastName, String flightId);
}

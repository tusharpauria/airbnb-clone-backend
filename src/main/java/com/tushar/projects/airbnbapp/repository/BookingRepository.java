package com.tushar.projects.airbnbapp.repository;

import com.tushar.projects.airbnbapp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {


}

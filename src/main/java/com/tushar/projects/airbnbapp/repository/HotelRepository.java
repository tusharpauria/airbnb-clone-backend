package com.tushar.projects.airbnbapp.repository;

import com.tushar.projects.airbnbapp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {


}

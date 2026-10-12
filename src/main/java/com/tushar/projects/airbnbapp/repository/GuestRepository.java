package com.tushar.projects.airbnbapp.repository;

import com.tushar.projects.airbnbapp.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
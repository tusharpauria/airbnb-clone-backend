package com.tushar.projects.airbnbapp.repository;

import com.tushar.projects.airbnbapp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

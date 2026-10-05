package com.tushar.projects.airbnbapp.service;

import com.tushar.projects.airbnbapp.entity.Room;


public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}

package com.tushar.projects.airbnbapp.service;

import com.tushar.projects.airbnbapp.dto.HotelDto;
import com.tushar.projects.airbnbapp.dto.HotelPriceDto;
import com.tushar.projects.airbnbapp.dto.HotelSearchRequest;
import com.tushar.projects.airbnbapp.entity.Room;
import org.springframework.data.domain.Page;


public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);

}

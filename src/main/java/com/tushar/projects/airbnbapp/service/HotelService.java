package com.tushar.projects.airbnbapp.service;

import com.tushar.projects.airbnbapp.dto.HotelDto;
import com.tushar.projects.airbnbapp.entity.Hotel;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

}

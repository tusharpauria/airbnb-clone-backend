package com.tushar.projects.airbnbapp.service;

import com.tushar.projects.airbnbapp.dto.BookingDto;
import com.tushar.projects.airbnbapp.dto.BookingRequest;
import com.tushar.projects.airbnbapp.dto.GuestDto;

import java.util.List;

public interface BookingService {
    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}

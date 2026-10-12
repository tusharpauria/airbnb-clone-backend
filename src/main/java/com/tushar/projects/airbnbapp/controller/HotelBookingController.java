package com.tushar.projects.airbnbapp.controller;

import com.tushar.projects.airbnbapp.dto.BookingDto;
import com.tushar.projects.airbnbapp.dto.BookingRequest;
import com.tushar.projects.airbnbapp.dto.GuestDto;
import com.tushar.projects.airbnbapp.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class HotelBookingController {

    private final BookingService bookingService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest) {

        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));


    }

    @PostMapping("/{bookingId}/addGuests")
    public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId,
                                                @RequestBody List<GuestDto> guestDtoList) {

        return ResponseEntity.ok(bookingService.addGuests(bookingId, guestDtoList));

    }
}

package com.tushar.projects.airbnbapp.controller;

import com.tushar.projects.airbnbapp.dto.HotelDto;
import com.tushar.projects.airbnbapp.dto.HotelInfoDto;
import com.tushar.projects.airbnbapp.dto.HotelSearchRequest;
import com.tushar.projects.airbnbapp.service.HotelService;
import com.tushar.projects.airbnbapp.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;

    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        Page<HotelDto> page = inventoryService.searchHotels(hotelSearchRequest);

        return ResponseEntity.ok(page);

    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {

        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));

    }
}

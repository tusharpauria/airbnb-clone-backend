package com.tushar.projects.airbnbapp.dto;

import com.tushar.projects.airbnbapp.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelPriceDto {

    private Hotel hotel;

    private Double price;

}

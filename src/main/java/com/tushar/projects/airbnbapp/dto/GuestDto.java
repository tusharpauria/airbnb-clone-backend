package com.tushar.projects.airbnbapp.dto;

import com.tushar.projects.airbnbapp.entity.User;
import com.tushar.projects.airbnbapp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {

    private long id;

    private User user;

    private String name;

    private Gender gender;

    private Integer age;

}

package com.example.appproj.services;


import com.example.appproj.entity.HotelEntity;
import com.example.appproj.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class HotelServiceTest {

    @Autowired
    HotelService hotelService;
    @Autowired
    HotelRepository hotelRepository;

    @Test
    void deleteHotelbyId(){
        hotelService.addHotel(new HotelEntity("hotel","adresa" ));

        assertThatCode(()->hotelService.deleteHotelById(1)).doesNotThrowAnyException();

    }


    @Test
    void addHotel() {
        HotelEntity hotel1=new HotelEntity("ab","ba");
        assertThat(hotelService.addHotel(hotel1)).isEqualTo(hotel1);
    }
}
package com.example.appproj.controller;

import com.example.appproj.entity.HotelEntity;
import com.example.appproj.entity.RoomEntity;
import com.example.appproj.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //As a user i want to see all hotels
    @GetMapping(path = "/hotels")
    public List<HotelEntity> getAllHotels(){
        return hotelService.getAllHotels();
    }
    //As a user i want to add hotel name and adress
    @PostMapping(path = "/hotel/{nume}/{adresa}")

    public HotelEntity addHotel(@PathVariable String nume, @PathVariable String adresa){
        HotelEntity hotel =new HotelEntity(nume,adresa);
        hotelService.addHotel(hotel);
        return hotel;
    }
    //As a user i want to delete a hotel by id
    @DeleteMapping(path = "/hotel/{id}")
    public void deleteHotel(@PathVariable int id)
    {
        hotelService.deleteHotelById(id);
    }

}

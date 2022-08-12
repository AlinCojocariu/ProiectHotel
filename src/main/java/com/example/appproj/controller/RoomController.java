package com.example.appproj.controller;

import com.example.appproj.entity.HotelEntity;
import com.example.appproj.entity.RoomEntity;
import com.example.appproj.services.HotelService;
import com.example.appproj.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController {
    @Autowired
    private RoomService roomService;
    @Autowired
    private HotelService hotelService;

   /* @GetMapping(path = "/")
    public String home() {
        return "Hello";
    }*/

    @GetMapping(path = "/rooms")
    public List<RoomEntity> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PostMapping(path = "/room/{numar}/hotel/{hotelId}")
    public RoomEntity addRoom(@PathVariable int numar, @PathVariable long hotelId) {
        RoomEntity room = new RoomEntity(numar);

        Optional<HotelEntity> hotelOp = hotelService.getHotelById(hotelId);
        if(hotelOp.isPresent()) {
            HotelEntity hotel =hotelOp.get();
            List<RoomEntity> camere = hotel.getCamere();
            camere.add(room);

           // hotel.setCamere(camere);
            //room.setHotel(hotel);
           // return hotel;
            hotelService.addHotel(hotel);
           roomService.addRoom(room);
            return room;

        }
        return null;
    }

    @DeleteMapping(path = "/room/{id}")
    public void deleteRoom(@PathVariable int id) {
        roomService.deleteRoomById(id);
    }
}

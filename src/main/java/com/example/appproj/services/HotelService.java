package com.example.appproj.services;

import com.example.appproj.entity.HotelEntity;
import com.example.appproj.entity.RoomEntity;
import com.example.appproj.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public HotelEntity addHotel(HotelEntity hotel) {
        if (hotel != null) {
            hotelRepository.save(hotel);
        }
        return hotel;
    }

    public List<HotelEntity> getAllHotels()
    {
        List<HotelEntity> hotels=hotelRepository.findAll();
        return hotels;
    }
    public Optional<HotelEntity> getHotelById(long id)
    {
        Optional<HotelEntity> hotelul=hotelRepository.findById(id);
        if(hotelul.isPresent())
            return hotelul;
        else throw new RuntimeException("Nu am gasit hotelul cu id-ul " +id);
    }

    public boolean deleteHotelById (long id){
        Optional<HotelEntity> hotelul=hotelRepository.findById(id);
        if(hotelul.isPresent()) {
            hotelRepository.deleteById(id);
            return true;
        }
        else throw new RuntimeException("Nu am gasit hotelul cu id-ul " +id);

    }


}

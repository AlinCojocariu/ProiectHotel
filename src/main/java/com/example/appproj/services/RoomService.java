package com.example.appproj.services;

import com.example.appproj.entity.RoomEntity;
import com.example.appproj.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public RoomEntity addRoom(RoomEntity room) {
        if (room != null) {
            roomRepository.save(room);
        }
        return room;
    }

    public List<RoomEntity>  getAllRooms()
    {
        List<RoomEntity> rooms=roomRepository.findAll();
        return rooms;
    }
    public Optional<RoomEntity> getRoomById(long id)
    {
        Optional<RoomEntity> camera=roomRepository.findById(id);
        if(camera.isPresent())
            return camera;
        else throw new RuntimeException("Nu am gasit camera cu id-ul " +id);
    }

    public boolean deleteRoomById(long id){
        roomRepository.deleteById(id);
        return true;
    }



}

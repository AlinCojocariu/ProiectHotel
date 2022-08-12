package com.example.appproj.services;

import com.example.appproj.entity.RoomEntity;
import com.example.appproj.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class RoomServiceTest {

    @Autowired
    RoomRepository roomRepository ;
    @Autowired
    RoomService roomService;

    @Test
    void getRoomById() {

        RoomEntity room1=new RoomEntity(3);
        roomService.addRoom(room1);
        assertThat(roomService.getRoomById(1).get()).isEqualTo(room1);

    }
}
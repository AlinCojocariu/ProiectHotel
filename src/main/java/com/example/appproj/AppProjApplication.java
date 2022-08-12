package com.example.appproj;

import com.example.appproj.entity.RoomEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppProjApplication {

    public static void main(String[] args) {
        RoomEntity room = new RoomEntity(12);

        SpringApplication.run(AppProjApplication.class, args);

    }

}

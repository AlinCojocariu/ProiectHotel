package com.example.appproj.repository;

import com.example.appproj.entity.RoomEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends CrudRepository< RoomEntity,Long> {
@Query("select * from camere order by cameraId")
    Optional<List<RoomEntity>> getAllRooms ();

}

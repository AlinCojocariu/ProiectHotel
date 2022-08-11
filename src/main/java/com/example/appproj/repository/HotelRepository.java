package com.example.appproj.repository;

import com.example.appproj.entity.HotelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends CrudRepository<HotelEntity,Long> {
}

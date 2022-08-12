package com.example.appproj.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "camere")

public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "camera_Id")
    private long cameraId;
   // @Column(name = "numar")
    private int numar;
    @ManyToOne
    @JoinColumn(name = "hotelId", referencedColumnName = "hotelId")
    private HotelEntity hotel;
    @OneToMany(mappedBy = "persoanaId")
    private List<PersonEntity> persoane;

    public RoomEntity() {
    }

    public RoomEntity(int numar) {
        this.numar = numar;
    }


    public long getCameraId() {
        return cameraId;
    }

    public void setCameraId(long cameraId) {
        this.cameraId = cameraId;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public HotelEntity getHotel() {
        return hotel;
    }

    public void setHotel(HotelEntity hotel) {
        this.hotel = hotel;
    }

    public List<PersonEntity> getPersoane() {
        return persoane;
    }

    public void setPersoane(List<PersonEntity> persoane) {
        this.persoane = persoane;
    }
}

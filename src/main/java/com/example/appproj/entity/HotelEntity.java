package com.example.appproj.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "hoteluri")

public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_Id")
    private long hotelId;
    @Column(name = "nume")
    private String nume;
    @Column(name = "adresa")
    private String adresa;
    @OneToMany(mappedBy = "camera")
    private List<RoomEntity> camere;

    public HotelEntity() {
    }


    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<RoomEntity> getCamere() {
        return camere;
    }

    public void setCamere(List<RoomEntity> camere) {
        this.camere = camere;
    }
}

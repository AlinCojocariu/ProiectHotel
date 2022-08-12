package com.example.appproj.entity;

import javax.persistence.*;

@Entity(name = "persoane")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "camera_Id")
    private long persoanaId;
   // @Column(name = "nume")
    private String nume;
   // @Column(name = "prenume")
    private String prenume;
    //@Column(name = "varsta")
    private int varsta;
    @ManyToOne
    @JoinColumn(name = "cameraId", referencedColumnName = "cameraId")
    private RoomEntity camera;

    public PersonEntity() {
    }

    public PersonEntity(String nume,int varsta,String prenume) {
        this.nume = nume;
        this.varsta=varsta;
        this.prenume=prenume;
    }


    public long getPersoanaId() {
        return persoanaId;
    }

    public void setPersoanaId(long persoanaId) {
        this.persoanaId = persoanaId;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public RoomEntity getCamera() {
        return camera;
    }

    public void setCamera(RoomEntity camera) {
        this.camera = camera;
    }
}

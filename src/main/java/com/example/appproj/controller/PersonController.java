package com.example.appproj.controller;

import com.example.appproj.entity.HotelEntity;
import com.example.appproj.entity.PersonEntity;
import com.example.appproj.entity.RoomEntity;
import com.example.appproj.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping(path = "/persons")
    public List<PersonEntity> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping(path = "/person/{nume}/{prenume}/{varsta}")
    public PersonEntity addPerson (@PathVariable String nume ,@PathVariable String prenume,@PathVariable int varsta){
        PersonEntity person =new PersonEntity(nume,varsta,prenume);
        personService.addPerson(person);
        return person;

    }

    @PutMapping(path = "/person/{personId}/{name}/{prenume}/{varsta}")
    public PersonEntity changePerson(
            @PathVariable  long personId,
            @PathVariable String name,
            @PathVariable String prenume,
            @PathVariable int varsta){
        PersonEntity person= personService.getPersonById(personId);
        person.setNume(name);
        person.setPrenume(prenume);
        person.setVarsta(varsta);
        personService.addPerson(person);
        return person;

    }

}

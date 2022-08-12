package com.example.appproj.services;

import com.example.appproj.entity.PersonEntity;
import com.example.appproj.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void addPerson(PersonEntity person)
    {
        personRepository.save(person);
    }

    public List<PersonEntity> getAllPersons(){
        return personRepository.findAll();
    }


    public PersonEntity getPersonById(long id){
        Optional<PersonEntity> person=personRepository.findById(id);
        if(person.isPresent())
            return person.get();
        throw new RuntimeException("Persoana negasita");


    }


}

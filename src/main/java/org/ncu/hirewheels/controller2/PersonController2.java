package org.ncu.hirewheels.controller2;

import org.ncu.hirewheels.entity2.Person;
import org.ncu.hirewheels.service2.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonController2{
    @Autowired
    private PersonDao personDao;
    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person pData = personDao.createPerson(person);
        return new ResponseEntity<Person>(pData, HttpStatus.OK);
    }
    @GetMapping("/count")
    public ResponseEntity<?> getCountPerson() {
        String count = personDao.getCountPerson();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }
    
}

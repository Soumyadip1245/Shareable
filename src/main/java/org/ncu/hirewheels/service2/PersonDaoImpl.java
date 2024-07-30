package org.ncu.hirewheels.service2;
import java.util.List;

import org.ncu.hirewheels.entity2.Laptop;
import org.ncu.hirewheels.entity2.Person;
import org.ncu.hirewheels.repository2.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private PersonRepo pr;

    @Override
    public Person createPerson(Person person) {
        List<Laptop> laptopList = person.getLaptop();
        for(Laptop l : laptopList){
            l.setPerson(person);
        }
        return pr.save(person);
    }

    @Override
    public String getCountPerson() {
        return pr.getCount();
    }
    


}

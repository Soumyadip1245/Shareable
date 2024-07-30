package org.ncu.hirewheels.service2;

import org.ncu.hirewheels.entity2.Person;

public interface PersonDao {
    public Person createPerson(Person person);
    public String getCountPerson();
}

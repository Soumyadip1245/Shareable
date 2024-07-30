package org.ncu.hirewheels.repository2;

import org.ncu.hirewheels.entity2.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{
    @Query("select count(p) from person p where p.name = 'AB'")
    public String getCount();
}

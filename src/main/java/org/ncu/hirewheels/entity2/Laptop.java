package org.ncu.hirewheels.entity2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String lname;
    @ManyToOne
    @JoinColumn(name="pId")
    private Person person;
    @Override
    public String toString() {
        return "Laptop [lid=" + lid + ", lname=" + lname + ", person=" + person + "]";
    }
   
}

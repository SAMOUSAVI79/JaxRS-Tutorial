package ir.tutorial.api.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Contact")
public class Contact {
    Long Id;
    String name;
    String lastName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

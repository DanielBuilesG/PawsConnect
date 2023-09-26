package project.paws.connect.model;

import java.util.HashMap;
import java.util.Map;

public class User {
    private Long id;
    private String name;
    private String emailAddress;
    private Map<Long, Pet> pets = new HashMap<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Pet> getPets() {
        return pets;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPets(Map<Long, Pet> pets) {
        this.pets = pets;
    }

    public void setName(String name) {
        this.name = name;
    }
}
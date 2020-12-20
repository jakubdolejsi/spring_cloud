package com.example.projectservice.models;

import org.springframework.stereotype.Service;

@Service
public class Project {

    private String owner;

    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

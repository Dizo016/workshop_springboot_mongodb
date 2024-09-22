package com.diegosilva.workshopmongo.dto;

import com.diegosilva.workshopmongo.domain.User;

import java.io.Serializable;

public class AutorDTO implements Serializable {

    private String id;
    private String name;

    public AutorDTO() {
    }

    public AutorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

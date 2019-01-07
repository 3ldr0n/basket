package org.spring;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotNull
    private Integer id;

    @NotNull
    @Size(min=1, max=20)
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

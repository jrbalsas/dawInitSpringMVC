package com.daw.spring.model;

import javax.validation.constraints.Size;

public class Entity {
    private int id;
    @Size(min = 4, max = 25, message = "Lenght ${validatedValue} between {min} and {max} characters")
    private String name ;

    public Entity () {
        id=0;
        name="unknown";
    }
    
    public Entity(int id, String name) {
        this.id=id;
        this.name=name;
    }

    /**Copy constructor*/
    public Entity(Entity e) {
        this.id=e.id;
        this.name=e.name;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}

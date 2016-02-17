package com.pachango.votar_v1.models;

/**
 * Created by jm_B on 07/12/14.
 */
public class Pusheen {

    private Integer id;
    private String name;
    private String pasTime;

    public String getPasTime() {
        return pasTime;
    }

    public void setPasTime(String passTime) {
        this.pasTime = passTime;
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

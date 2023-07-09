package com.seenam.listeninglevels.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
public class Levels {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private long id;
    private String userName;
    private String level;
    private LocalDateTime dt;

    public Levels() {
        this.userName = "";
        this.level = "";
        this.dt = LocalDateTime.now();
    }

    public Levels(String userName, String level) {
        this.userName = userName;
        this.level = level;
        this.dt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Levels{" +
                "userName=" + userName +
                ", id=" + id +
                ", level=" + level +
                ", dt=" + dt +
                '}';
    }
}

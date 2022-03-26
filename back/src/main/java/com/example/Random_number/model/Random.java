package com.example.Random_number.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document
public class Random {
    private Date date;
    @Id
    private String id;
    private int numeroIncial;
    private int numeroFinal;
    private int numeroRandom;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumeroIncial() {
        return numeroIncial;
    }

    public void setNumeroIncial(int numeroIncial) {
        this.numeroIncial = numeroIncial;
    }

    public int getNumeroFinal() {
        return numeroFinal;
    }

    public void setNumeroFinal(int numeroFinal) {
        this.numeroFinal = numeroFinal;
    }

    public int getNumeroRandom() {
        return numeroRandom;
    }

    public void setNumeroRandom(int numeroRandom) {
        this.numeroRandom = numeroRandom;
    }
}

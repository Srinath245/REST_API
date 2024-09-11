package com.Back_end.REST_API.TABLE_ENTITY;

import jakarta.persistence.*;

@Entity
@Table(
        name = "Student_Area"
)
public class Student_Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long number;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }




}

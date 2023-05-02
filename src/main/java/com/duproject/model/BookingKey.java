package com.duproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BookingKey implements Serializable {
    @Column(name = "user_Id")
    String userID;
    @Column(name = "flight_Id")
    String flightID;
}

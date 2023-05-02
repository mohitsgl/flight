package com.duproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UserFlightId implements Serializable {

//    private static final long serialVersionUID = 1L;

    @Column(name = "user_id")
    private int userID;

    @Column(name = "flight_id")
    private int flightID;

}

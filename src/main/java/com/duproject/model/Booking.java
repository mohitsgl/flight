package com.duproject.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "booking")
public class Booking {
        @EmbeddedId
        private BookingKey bookingKey;
        private LocalDateTime BookingTime;
        private int TotalTicketsBooked;
        private  int TotalPrice;
        private  String Status;

//
//        @ManyToMany
//        @MapsId("UserID")
//        @JoinColumn(name = "user_id")
//        List<User> users;
//
//        @ManyToMany
//        @MapsId("FlightID")
//        @JoinColumn(name = "user_id")
//        List<Flight> flights;
//
//        int rating;
//
//         standard constructors, getters, and setters
    }


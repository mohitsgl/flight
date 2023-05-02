package com.duproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_flight")
public class UserFlight {

    @EmbeddedId
    private UserFlightId ID = new UserFlightId();

//    @ManyToMany
//    @MapsId("userID")
//    private User user;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

//    @ManyToMany
//    @MapsId("flightID")
//    private Flight flight;

    @ManyToOne
    @MapsId("flightId")
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToMany
    @JoinTable(name = "user_flight",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "flight_id"))

    // use this way - only - joinColumns = JoinColumns({ @JoinColumn(name = "user_id"), referencedColumn(name = "id") })

    private List<User> users;

    @ManyToMany(mappedBy = "users")
    private List<Flight> flights;



}

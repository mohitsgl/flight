package com.duproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "flights")
public class Flight {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "flight_id")
//    private String flightID;

    @Id
    @Column(name = "flight_id")
    private int flightId;

    @NotNull
    private String source;

    @NotNull
    private String destination;

    @NotNull
    private LocalTime departure;

    @NotNull
    private LocalTime arrival;

    @NotNull
    @Column(name = "date")
    private LocalDate dof;

    @NotNull
    private int duration;

    @NotNull
    private int fare;

    @NotNull
    @Column(name = "available_seats")
    private int availableSeats;

    @NotNull
    private int status;

//    @ManyToMany(cascade = { CascadeType.ALL })
//    @JoinTable(
//            name = "bookings",
//            joinColumns = { @JoinColumn(name = "flight_id") },
//            inverseJoinColumns = { @JoinColumn(name = "user_id") }
//    )
//    private Set<User> users = new HashSet<>();

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<UserFlight> userFlights = new ArrayList<>();


}

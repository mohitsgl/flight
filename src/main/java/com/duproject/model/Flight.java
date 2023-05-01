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
public class Flight {

    @Id
    @Column(name = "flight_id")
    private String flightID;

    @NotNull
    private String source;

    @NotNull
    private String destination;

    @NotNull
    @Column(name = "available_seats")
    private int availableSeats;

    @NotNull
    @Column(name = "date")
    private LocalDate dof;

    @NotNull
    @Column(name = "time")
    private LocalTime tof;

    @NotNull
    private int status;

    @ManyToOne
    @JoinColumn(name = "plane_id")
    private Plane plane;

    @ManyToMany(mappedBy = "flights")
    private List<User> users;

}

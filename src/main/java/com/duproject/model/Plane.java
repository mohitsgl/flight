package com.duproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Plane {

    @Id
    @Column(name = "plane_id")
    private String planeID;

    @NotNull
    private String airline;

    @NotNull
    private int capacity;

    @NotNull
    private int status;

    @OneToMany(mappedBy = "plane")
    private List<Flight> flights;
}

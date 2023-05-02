package com.duproject.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "user_id")
//	private String userID;

	@Id
	@Column(name = "user_id")
	private int userId;

	@NotNull
	private String fName;

	@NotNull
	private String lName;

	@NotNull
	private String email;

	@NotNull
	private String password;

	@NotNull
	private String role;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<UserFlight> userFlights = new ArrayList<>();

	@ManyToMany(mappedBy = "userFlights")
	private List<Flight> flights = new ArrayList<>();

}


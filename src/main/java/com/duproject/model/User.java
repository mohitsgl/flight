package com.duproject.model;

import jakarta.persistence.*;
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
public class User {
	
	@Id
	@Column(name = "user_id")
	private String userID;
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
	@NotNull
	private String score;

	@ManyToMany
	@JoinTable(name = "booking", uniqueConstraints = {
			@UniqueConstraint(columnNames = "booking_id")
	})
	private List<Flight> flights;


}

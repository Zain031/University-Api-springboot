package com.enigma.university_spring.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(unique = true,nullable = false)
    private String nim;

    @Column(nullable = false)
    private String address;

    @Column(unique = true,nullable = false, length = 13)
    @Size(min = 11, max = 13, message = "Phone number must between {min} and {max} characters")
    private String phone;

    @Column(unique = true,nullable = false)
    @jakarta.validation.constraints.Email(
            message = "Email should be valid"
    )
    private String email;



}

package com.example.database;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;





}
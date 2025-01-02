package com.example.conference.dao.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;

    @OneToMany(mappedBy = "session")
    private List<Conference> conferences = new ArrayList<>();

    @OneToOne(mappedBy = "session")
    private Moderateur moderateur;


    @OneToOne(mappedBy = "session")
    private Salle salle;

    @OneToOne
    private Inscription inscription;
}

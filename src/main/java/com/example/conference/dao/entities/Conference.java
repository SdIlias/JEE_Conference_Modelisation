package com.example.conference.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private Date date;
    private String heure_debut;
    private String heure_fin;
    private String description;

    @ManyToOne
    private Session session;

    @OneToOne(mappedBy = "conference")
    private Speaker speaker;

    @OneToMany(mappedBy = "conference")
    private List<Commentaire> commentaires = new ArrayList<>();

    @OneToOne
    private Commentaire commentaire;
}

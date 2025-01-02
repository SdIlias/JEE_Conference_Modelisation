package com.example.conference.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String contenu;
    private Integer nombreLike;

    @ManyToOne
    private Conference conference;


    @OneToOne(mappedBy = "commentaire")
    private Conference conferencee;

    @OneToOne(mappedBy = "commentaire")
    private Participant participant;
}

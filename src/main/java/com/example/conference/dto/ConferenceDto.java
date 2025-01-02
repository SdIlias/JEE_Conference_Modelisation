package com.example.conference.dto;

import com.example.conference.dao.entities.Session;
import com.example.conference.dao.entities.Speaker;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ConferenceDto implements Serializable {
    Integer id;
    @NotEmpty
    String titre;
    @NotNull
    Date date;
    String heure_debut;
    String heure_fin;
    @NotEmpty
    String description;
    Session session;
    Speaker speaker;
    List<CommentaireDto> commentaires;
    CommentaireDto commentaire;
}
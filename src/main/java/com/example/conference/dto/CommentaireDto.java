package com.example.conference.dto;

import com.example.conference.dao.entities.Conference;
import com.example.conference.dao.entities.Participant;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentaireDto implements Serializable {
    Long id;
    @NotNull
    Date date;
    @NotEmpty
    String contenu;
    @PositiveOrZero
    Integer nombreLike;
    Conference conference;
    Conference conferencee;
    Participant participant;
}
package com.example.conference.dto;

import com.example.conference.dao.entities.Invite;
import com.example.conference.dao.entities.Session;
import com.example.conference.dao.entities.StatutInscription;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InscriptionDto implements Serializable {
    Long id;
    Date date;
    @NotNull
    StatutInscription statut;
    @Min(1)
    @PositiveOrZero
    Double prix;
    Invite invite;
    Session session;
}
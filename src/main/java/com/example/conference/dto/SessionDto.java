package com.example.conference.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SessionDto implements Serializable {
    Integer id;
    @NotEmpty
    String nom;
    List<ConferenceDto> conferences;
    ModerateurDto moderateur;
    SalleDto salle;
    InscriptionDto inscription;
}
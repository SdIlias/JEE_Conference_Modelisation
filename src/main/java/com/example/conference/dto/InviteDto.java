package com.example.conference.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InviteDto implements Serializable {
    Long id;
    @NotEmpty
    String affiliation;
    List<InscriptionDto> inscriptions;
}
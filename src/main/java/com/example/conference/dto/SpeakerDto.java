package com.example.conference.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SpeakerDto implements Serializable {
    Long id;
    @NotEmpty
    String lien_profile;
    ConferenceDto conference;
}
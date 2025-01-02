package com.example.conference.dto;

import com.example.conference.dao.entities.Session;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalleDto implements Serializable {
    Integer id;
    @NotEmpty
    String nom;
    Session session;
}
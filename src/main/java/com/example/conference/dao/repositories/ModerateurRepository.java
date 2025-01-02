package com.example.conference.dao.repositories;

import com.example.conference.dao.entities.Moderateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModerateurRepository extends JpaRepository<Moderateur, Long> {
}
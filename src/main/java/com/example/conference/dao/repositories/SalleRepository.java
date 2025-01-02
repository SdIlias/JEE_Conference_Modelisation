package com.example.conference.dao.repositories;

import com.example.conference.dao.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalleRepository extends JpaRepository<Salle, Integer> {
}
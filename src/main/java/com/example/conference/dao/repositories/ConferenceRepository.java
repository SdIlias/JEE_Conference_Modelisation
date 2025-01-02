package com.example.conference.dao.repositories;

import com.example.conference.dao.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
  public List<Conference> findAllBySpeakerId(Integer id);
}
package com.example.conference.service;

import com.example.conference.dao.entities.Session;
import com.example.conference.dao.entities.Speaker;
import com.example.conference.dao.repositories.SessionRepository;
import com.example.conference.dao.repositories.SpeakerRepository;
import com.example.conference.dto.SessionDto;
import com.example.conference.dto.SpeakerDto;
import com.example.conference.mapper.SessionMapper;
import com.example.conference.mapper.SpeakerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionManager implements ISessionService{
    @Autowired
    private SpeakerRepository speakerRepository;
    @Autowired
    private SessionMapper sessionMapper;
    @Autowired
    private SessionRepository sessionRepository;

    public SessionDto getSession(Integer id) {
        Session session = sessionRepository.findById(id).orElse(null);
        return sessionMapper.fromSessionToSessionDto(session);
    }
}

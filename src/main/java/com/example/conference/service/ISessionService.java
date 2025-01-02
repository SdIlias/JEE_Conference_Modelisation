package com.example.conference.service;

import com.example.conference.dto.SessionDto;
import com.example.conference.dto.SpeakerDto;

public interface ISessionService {
    public SessionDto getSession(Integer id);
}

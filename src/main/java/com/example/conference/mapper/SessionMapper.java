package com.example.conference.mapper;

import com.example.conference.dao.entities.Conference;
import com.example.conference.dao.entities.Session;
import com.example.conference.dto.ConferenceDto;
import com.example.conference.dto.SessionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SessionMapper {
    ModelMapper mapper = new ModelMapper();
    public SessionDto fromSessionToSessionDto(Session session){
        return mapper.map(session, SessionDto.class);
    }
    public Session fromSessionDtoToSession(SessionDto sessionDto){
        return mapper.map(sessionDto, Session.class);
    }
}

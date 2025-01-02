package com.example.conference.mapper;

import com.example.conference.dao.entities.Conference;
import com.example.conference.dto.ConferenceDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ConferenceMapper {
    private final ModelMapper mapper = new ModelMapper();
    public ConferenceDto fromConferenceToConferenceDto(Conference conference){
        return mapper.map(conference, ConferenceDto.class);
    }
    public Conference fromConferenceDtoToConference(ConferenceDto conferenceDto){
        return mapper.map(conferenceDto, Conference.class);
    }
}

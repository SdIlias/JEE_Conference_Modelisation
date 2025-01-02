package com.example.conference.mapper;

import com.example.conference.dao.entities.Conference;
import com.example.conference.dao.entities.Speaker;
import com.example.conference.dto.ConferenceDto;
import com.example.conference.dto.SpeakerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SpeakerMapper {
    ModelMapper mapper = new ModelMapper();
    public SpeakerDto fromSpeakerToSpeakerDto(Speaker speaker){
        return mapper.map(speaker, SpeakerDto.class);
    }
    public Speaker fromSpeakerDtoToSpeaker(SpeakerDto speakerDto){
        return mapper.map(speakerDto, Speaker.class);
    }
}

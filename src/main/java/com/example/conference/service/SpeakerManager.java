package com.example.conference.service;

import com.example.conference.dao.entities.Conference;
import com.example.conference.dao.entities.Speaker;
import com.example.conference.dao.repositories.ConferenceRepository;
import com.example.conference.dao.repositories.SpeakerRepository;
import com.example.conference.dto.ConferenceDto;
import com.example.conference.dto.SpeakerDto;
import com.example.conference.mapper.ConferenceMapper;
import com.example.conference.mapper.SpeakerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerManager implements ISpeakerService{
    @Autowired
    private SpeakerRepository speakerRepository;
    @Autowired
    private SpeakerMapper speakerMapper;

    public SpeakerDto getSpeaker(Long id) {
        Speaker speaker = speakerRepository.findById(id).orElse(null);
        return speakerMapper.fromSpeakerToSpeakerDto(speaker);
    }
}

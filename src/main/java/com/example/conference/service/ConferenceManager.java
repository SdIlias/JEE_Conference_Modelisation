package com.example.conference.service;


import com.example.conference.dao.entities.Conference;
import com.example.conference.dao.repositories.ConferenceRepository;
import com.example.conference.dto.ConferenceDto;
import com.example.conference.mapper.ConferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ConferenceManager implements IConferenceService{

    @Autowired
    private ConferenceRepository conferenceRepository;
    @Autowired
    private ConferenceMapper conferenceMapper;

    public ConferenceDto addConference(ConferenceDto conferenceDto) {

        return conferenceMapper.fromConferenceToConferenceDto(
                conferenceRepository.save(
                        conferenceMapper.fromConferenceDtoToConference(conferenceDto)));
    }


    public List<ConferenceDto> getConferencesBySpeakerId(Integer id) {

        List<Conference> conferences = conferenceRepository.findAllBySpeakerId(id);

        return conferences.stream().map(conferenceMapper::fromConferenceToConferenceDto) .toList();

    }
    @Override
    public List<ConferenceDto> getConferences() {
        List<Conference> conferences = conferenceRepository.findAll();
        return conferences.stream().map(conferenceMapper::fromConferenceToConferenceDto).toList();
    }




}

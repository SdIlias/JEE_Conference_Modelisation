package com.example.conference.service;

import com.example.conference.dto.ConferenceDto;

import java.util.List;

public interface IConferenceService {
    public ConferenceDto addConference(ConferenceDto conferenceDto);
    public List<ConferenceDto> getConferences();
    public List<ConferenceDto> getConferencesBySpeakerId(Integer id);
}

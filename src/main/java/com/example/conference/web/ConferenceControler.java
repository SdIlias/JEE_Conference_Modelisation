package com.example.conference.web;


import com.example.conference.dao.entities.Speaker;
import com.example.conference.dto.ConferenceDto;
import com.example.conference.dto.SessionDto;
import com.example.conference.service.IConferenceService;
import com.example.conference.service.ISessionService;
import com.example.conference.service.ISpeakerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@AllArgsConstructor
public class ConferenceControler {


    private IConferenceService conferenceService;

    private ISpeakerService speakerService;

    private ISessionService sessionService;



    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/conferences")
    public String getConferencesBySpeakerId(Model model) {
        List<ConferenceDto> conferences = conferenceService.getConferences();
        model.addAttribute("conferences", conferences);
        return "conferences";
    }

    @GetMapping("/addConference")
    public String addConference(@RequestParam Long speakerId,Model model) {
        model.addAttribute("conference", new ConferenceDto());
        model.addAttribute("speakers", speakerService.getSpeaker(speakerId));
        return "addConference";
    }

    @PostMapping("/addConference")
    public String addConference(@Valid @ModelAttribute("conference") ConferenceDto conferenceDto, BindingResult bindingResult, @RequestParam Long speakerId, Model model) {
        // If there are binding errors, return the form view with error messages
        if (bindingResult.hasErrors()) {
            model.addAttribute("speakers", speakerService.getSpeaker(speakerId));

            return "addConference";
        }


        // Save the reservation
        conferenceService.addConference(conferenceDto);
        return "redirect:conferences";
    }



    @GetMapping("/sessions")
    public String getSalles(@RequestParam Integer sessionId,Model model) {
        SessionDto sessions = sessionService.getSession(sessionId);
        model.addAttribute("salles", sessions);
        return "sessions";
    }


    @GetMapping("/addSession")
    public String addSession(Model model) {
        model.addAttribute("session", new SessionDto());
        return "addSession";
    }
}

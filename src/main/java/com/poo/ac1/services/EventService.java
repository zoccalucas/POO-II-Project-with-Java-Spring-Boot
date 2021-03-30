package com.poo.ac1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.poo.ac1.dto.EventInsertDto;
import com.poo.ac1.dto.Eventdto;
import com.poo.ac1.entities.Event;
import com.poo.ac1.repositories.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EventService {
    
    @Autowired
    private EventRepository repo;

    public List<Eventdto> getEvent() {
        List<Event> list = repo.findAll();
        return toDTOList(list);
    }

    private List<Eventdto> toDTOList(List<Event> list) {
        List<Eventdto> listDTO = new ArrayList<>();

        for (Event c : list) {
            listDTO.add(new Eventdto(c.getId(), c.getName(), c.getDescription(), c.getPlace(), c.getStart_Date(), c.getEnd_Date(), c.getStart_Time(), c.getEnd_Time(), c.getEmail_Contact()));
        }
        return listDTO;
    }

    public Eventdto getEventById(Long id) {
        Optional<Event> op = repo.findById(id);
        Event event = op.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Event not found"));
        return new Eventdto(event);
    }

    public Eventdto insert(EventInsertDto insertDTO) {
        Event entity = new Event(insertDTO);
        entity = repo.save(entity);
        return new Eventdto(entity);
    }
}
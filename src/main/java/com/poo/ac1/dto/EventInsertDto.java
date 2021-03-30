package com.poo.ac1.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.poo.ac1.entities.Event;

public class EventInsertDto {
    private String name;
    private String description;
    private String place;
    private LocalDate start_Date;
    private LocalDate end_Date;
    private LocalTime start_Time;
    private LocalTime end_Time;
    private String email_Contact;

    public EventInsertDto (){

    }
    
	public EventInsertDto(Event event) {
        setName(event.getName());
        setDescription(event.getDescription());
        setPlace(event.getPlace());
        setStart_Date(event.getStart_Date());
        setEnd_Date(event.getEnd_Date());
        setStart_Time(event.getStart_Time());
        setEnd_Time(event.getEnd_Time());
        setEmail_Contact(event.getEmail_Contact());
	}

    public EventInsertDto(String name, String description, String place, LocalDate start_Date, LocalDate end_Date,
            LocalTime start_Time, LocalTime end_Time, String email_Contact) {
        this.name = name;
        this.description = description;
        this.place = place;
        this.start_Date = start_Date;
        this.end_Date = end_Date;
        this.start_Time = start_Time;
        this.end_Time = end_Time;
        this.email_Contact = email_Contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDate getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(LocalDate start_Date) {
        this.start_Date = start_Date;
    }

    public LocalDate getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(LocalDate end_Date) {
        this.end_Date = end_Date;
    }

    public LocalTime getStart_Time() {
        return start_Time;
    }

    public void setStart_Time(LocalTime start_Time) {
        this.start_Time = start_Time;
    }

    public LocalTime getEnd_Time() {
        return end_Time;
    }

    public void setEnd_Time(LocalTime end_Time) {
        this.end_Time = end_Time;
    }

    public String getEmail_Contact() {
        return email_Contact;
    }

    public void setEmail_Contact(String email_Contact) {
        this.email_Contact = email_Contact;
    }

    
}


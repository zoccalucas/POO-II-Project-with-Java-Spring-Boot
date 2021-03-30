package com.poo.ac1.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.poo.ac1.dto.EventInsertDto;

@Entity
@Table (name="TB_EVENT")

public class Event implements Serializable {
   
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String place;
    private LocalDate start_Date;
    private LocalDate end_Date;
    private LocalTime start_Time;
    private LocalTime end_Time;
    private String email_Contact;

    public Event(){

    }

    public Event(Long id, String name, String description, String place, LocalDate start_Date, LocalDate end_Date,
            LocalTime start_Time, LocalTime end_Time, String email_Contact) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.place = place;
        this.start_Date = start_Date;
        this.end_Date = end_Date;
        this.start_Time = start_Time;
        this.end_Time = end_Time;
        this.email_Contact = email_Contact;
    }

    public Event(EventInsertDto insertDTO) {
        this.name = insertDTO.getName();
        this.description = insertDTO.getDescription();
        this.place = insertDTO.getPlace();
        this.start_Date = insertDTO.getStart_Date();
        this.end_Date = insertDTO.getEnd_Date();
        this.start_Time = insertDTO.getStart_Time();
        this.end_Time = insertDTO.getEnd_Time();
        this.email_Contact = insertDTO.getEmail_Contact();
	}
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((email_Contact == null) ? 0 : email_Contact.hashCode());
        result = prime * result + ((end_Date == null) ? 0 : end_Date.hashCode());
        result = prime * result + ((end_Time == null) ? 0 : end_Time.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((place == null) ? 0 : place.hashCode());
        result = prime * result + ((start_Date == null) ? 0 : start_Date.hashCode());
        result = prime * result + ((start_Time == null) ? 0 : start_Time.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Event other = (Event) obj;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (email_Contact == null) {
            if (other.email_Contact != null)
                return false;
        } else if (!email_Contact.equals(other.email_Contact))
            return false;
        if (end_Date == null) {
            if (other.end_Date != null)
                return false;
        } else if (!end_Date.equals(other.end_Date))
            return false;
        if (end_Time == null) {
            if (other.end_Time != null)
                return false;
        } else if (!end_Time.equals(other.end_Time))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (place == null) {
            if (other.place != null)
                return false;
        } else if (!place.equals(other.place))
            return false;
        if (start_Date == null) {
            if (other.start_Date != null)
                return false;
        } else if (!start_Date.equals(other.start_Date))
            return false;
        if (start_Time == null) {
            if (other.start_Time != null)
                return false;
        } else if (!start_Time.equals(other.start_Time))
            return false;
        return true;
    }
  
    
}



package com.poo.ac1.repositories;


import org.springframework.stereotype.Repository;


import com.poo.ac1.entities.Event;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EventRepository extends JpaRepository <Event,Long> {

}

package com.jarov.web.restful.todolistapp.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.DayEntity;

@Repository
public interface DaysRepository extends JpaRepository<DayEntity, String> {

	
}

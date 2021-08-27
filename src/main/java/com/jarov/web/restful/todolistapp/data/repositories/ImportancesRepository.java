package com.jarov.web.restful.todolistapp.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.ImportanceEntity;

@Repository
public interface ImportancesRepository extends JpaRepository<ImportanceEntity, String>{

}

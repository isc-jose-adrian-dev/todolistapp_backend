package com.jarov.web.restful.todolistapp.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.ToDoEntity;
import com.jarov.web.restful.todolistapp.data.entities.UserEntity;

@Repository
public interface ToDosRepository extends JpaRepository<ToDoEntity, Long>{

	//List<ToDoEntity> findByUser(UserEntity user);
}

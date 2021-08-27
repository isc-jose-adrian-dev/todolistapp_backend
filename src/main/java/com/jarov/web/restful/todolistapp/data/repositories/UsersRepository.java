package com.jarov.web.restful.todolistapp.data.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long> {

	Optional<UserEntity> findByUsername(String username);
	
	Optional<UserEntity> findByEmail(String email);
}

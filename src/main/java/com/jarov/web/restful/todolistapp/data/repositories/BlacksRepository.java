package com.jarov.web.restful.todolistapp.data.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.BlackJWTEntity;

@Repository
public interface BlacksRepository extends JpaRepository<BlackJWTEntity, String> {

	Optional<BlackJWTEntity> findByJwt(String jwt);
	
//	@Query("DELETE FROM blacks_jwt WHERE createAt <= :createAt")
//	void deleteByCreateAt(Date createAt);
}

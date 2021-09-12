package com.jarov.web.restful.todolistapp.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarov.web.restful.todolistapp.data.entities.RoleEntity;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, String>{

}

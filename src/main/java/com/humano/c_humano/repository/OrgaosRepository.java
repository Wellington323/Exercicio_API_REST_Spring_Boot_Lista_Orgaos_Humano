package com.humano.c_humano.repository;

import javax.persistence.Id;  

import org.springframework.data.jpa.repository.JpaRepository;

import com.humano.c_humano.models.Orgaos;

public interface OrgaosRepository extends JpaRepository<Orgaos, Id> {
	
	 Orgaos findById ( long id); 

}

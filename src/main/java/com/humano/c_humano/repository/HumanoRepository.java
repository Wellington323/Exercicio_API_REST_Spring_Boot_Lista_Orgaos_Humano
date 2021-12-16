package com.humano.c_humano.repository;

import javax.persistence.Id;   

import org.springframework.data.jpa.repository.JpaRepository;

import com.humano.c_humano.models.Humano;

public interface HumanoRepository extends JpaRepository<Humano, Id> {

	 Humano findById(long id);  
		
	
}   
 
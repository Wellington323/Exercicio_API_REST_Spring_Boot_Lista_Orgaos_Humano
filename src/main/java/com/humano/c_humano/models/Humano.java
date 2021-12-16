package com.humano.c_humano.models;

import java.io.Serializable;  
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javassist.SerialVersionUID;

@SuppressWarnings("unused")
@Entity
@Table(name="TB_C_HUMANO")
public class Humano implements Serializable {
	 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	private String nome;
	private String idade;
	private String cor; 
	
	//MAPEAMENTO DAS CLASS
	@OneToMany(mappedBy  = "humano",cascade = CascadeType.ALL) 
	private List<Orgaos> orgaos;
	 
	
	public Humano( String nome, String idade, String cor ) {
		
	
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		
	}
	public Humano() {
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	public String getCor() {
		return cor;
	}
	public List<Orgaos> getOrgaos() {
		return orgaos;
	}
}

	
	
	
	
	
	
	
	
	
	
	


  

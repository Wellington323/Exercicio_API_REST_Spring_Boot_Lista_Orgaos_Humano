package com.humano.c_humano.models;

import java.io.Serializable;  

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TB_ORGAOS")
public class Orgaos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	 private long id;
	 
	private String courocabeludo; 
	private String cerebro;
	private String Veias;
	private String coração;
	
	// MAPEAMENTO DAS Class 
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.MERGE) 
	private Humano humano;
	
	
	public Orgaos(long id, String courocabeludo, String cerebro, String veias, String coração) {
		
		this.id = id;
		this.courocabeludo = courocabeludo;
		this.cerebro = cerebro;
		Veias = veias;
		this.coração = coração;
		
	}
	public Orgaos() {
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourocabeludo() {
		return courocabeludo;
	}
	public void setCourocabeludo(String courocabeludo) {
		this.courocabeludo = courocabeludo;
	}
	public String getCerebro() {
		return cerebro;
	}
	public void setCerebro(String cerebro) {
		this.cerebro = cerebro;
	}
	public String getVeias() {
		return Veias;
	}
	public void setVeias(String veias) {
		Veias = veias;
	}
	public String getCoração() {
		return coração;
	}
	public void setCoração(String coração) {
		this.coração = coração;
	}
	public Humano getHumano() {
		return humano;
	}
	public void setHumano(Humano humano) {
		this.humano = humano;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

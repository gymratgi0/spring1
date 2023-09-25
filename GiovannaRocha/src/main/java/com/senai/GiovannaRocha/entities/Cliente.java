package com.senai.GiovannaRocha.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String nCliente;
	
	@Column(name = "fone")
	private String fone;
	
	public Long getId() {
		return idcCliente;
	}
	
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getName() {
		return nCliente;
	}
	
	public void setName(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}

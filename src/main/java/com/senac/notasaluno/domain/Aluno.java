package com.senac.notasaluno.domain;

import java.util.Set;

import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;

@Entity
public class Aluno extends Pessoa {

	@Transient
	private static final long serialVersionUID = 1L;

	@Column(unique = true, nullable = false)
	private String email;

	private String situacao;

	@Autowired
	@ElementCollection
	@CollectionTable(name = "telefone")
	private Set<String> telefones;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Set<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<String> telefones) {
		this.telefones = telefones;
	}
}

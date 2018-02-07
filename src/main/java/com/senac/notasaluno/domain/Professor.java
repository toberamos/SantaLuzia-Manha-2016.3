package com.senac.notasaluno.domain;

import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class Professor extends Pessoa {

	@Transient
	private static final long serialVersionUID = 1L;

}

package com.senac.notasaluno.persistence;

import org.springframework.data.repository.CrudRepository;

import com.senac.notasaluno.domain.Aluno;

public interface PessoaRepository extends CrudRepository<Aluno, Long> {

}
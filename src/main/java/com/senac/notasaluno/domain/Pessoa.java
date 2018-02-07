package com.senac.notasaluno.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;


/**
 * As anotações do hibernate serão do javax.persistence
 * A anotação @Entity é utilizada para definir a classe como uma entidade(persistida) no banco
 * A anotação @Entity pode ter parametros passados como o nome da tabela, é necessário
 * adicionar () com o valor " name= ", como no exemplo @Entity(name="tb_pessoa")
 *  -- Anotaçoes para herença na superclass (Classe mãe) -- 
 *  @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) - Define qual a estratégia de 
 *  mapeamento da herança será utilizada
 *  <strong> Um ponto importante </strong> A utilização da palavara-chave abstract, para que na 
 *  hora da criação do banco o HIBERNATE nao crie uma tabaela com os atributos da classe Pessoa
 *  @MappedSuperclass - Define o mapeamento de herança concreta. Quando utilizado, deve-se por 
 * somente ele (removendo o @Entity  e @Inheritance
 * 
 * Palavra-chave abstract
 * é sempre bom utilizar essa Keyword nas superclasses para que elas não sejam instanciadas
 *  e persisteidas no banco pelo hebernate
 * */
@MappedSuperclass  
public abstract class Pessoa implements Serializable {

	/**
	 * A anotação @Transient é utilizada para dizermos ao hibernate que aquele atributo não 
	 * será persistido no banco
	 * */
	@Transient
	private static final long serialVersionUID = 1L;

	/**
	 * A anotação @Id comunica ao hibernate qual atributo será a chave primaria(PK)
	 * A anotação @GeneratedValue define que a chave(PK) será incrementada e o escopo de 
	 * incrementação
	 * */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nome;
	/**
	 * A anotação @Column é utilizada para definir caracteriscas do atributo(coluna)
	 * Tais como: tamanho de caracteres, se é unica, se terá valores nulos e etc..
	 * */
	@Column(unique=true)
	private String cpf;
	@Column(unique=true)
	private String matricula;
	
	public Pessoa() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}

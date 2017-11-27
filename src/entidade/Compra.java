package entidade;

import java.util.List;

public class Compra {

	private Long id;
	private Empregada empregada;
	private List<Produto> listaDeCompras;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empregada getEmpregada() {
		return empregada;
	}

	public void setEmpregada(Empregada empregada) {
		this.empregada = empregada;
	}

	public List<Produto> getListaDeCompras() {
		return listaDeCompras;
	}

	public void setListaDeCompras(List<Produto> listaDeCompras) {
		this.listaDeCompras = listaDeCompras;
	}
	
	
}

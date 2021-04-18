package model;

import java.util.ArrayList;

public class ListaDeGastos {
	
	private ArrayList<Produto> listaDeGastos = new ArrayList<Produto>();
	private String nomeDaLista;
	private double total;
	
	public ListaDeGastos(String nomeDaLista) {
		this.nomeDaLista = nomeDaLista;
	}

	
	public ArrayList<Produto> getListaDeGastos() {
		return listaDeGastos;
	}

	public void setListaDeGastos(ArrayList<Produto> listaDeGastos) {
		this.listaDeGastos = listaDeGastos;
	}

	public String getNomeDaLista() {
		return nomeDaLista;
	}


	public void setNomeDaLista(String nomeDaLista) {
		this.nomeDaLista = nomeDaLista;
	}

	public double getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}

	public void addProduto(Produto prod) {
		int quantidade = prod.getQuantidade();
		this.listaDeGastos.add(prod);
		total = total + (prod.getCusto() * quantidade);
		
	}
	
	public void retirarProduto(Produto prod, int quantidadeARetirar) {
		int quantidade = quantidadeARetirar;
		int antigaQuantidade = prod.getQuantidade();
		int novaQuantidade = prod.getQuantidade() - quantidade;
	
		
		if(novaQuantidade <= 0) {
			prod.setQuantidade(novaQuantidade);
				
			total = total - (prod.getCusto() * quantidade);
			this.listaDeGastos.remove(prod);
			
		}else {
		
		prod.setQuantidade(novaQuantidade);
		
		total = total - (prod.getCusto() * quantidade);
		
		}
	}


	@Override
	public String toString() {
		return "ListaDeGastos [listaDeGastos=" + listaDeGastos + ", nomeDaLista=" + nomeDaLista + ", total=" + total
				+ "]";
	}
	
	
	
	

	
	
	
	

}

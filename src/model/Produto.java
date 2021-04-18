package model;

import java.util.Arrays;

public class Produto {
	
	private String nome;
	private double custo;
	private int quantidade;
	//private String[] tipo = new String[] {"Alimentos", "Bebidas", "Padaria", "Frutas, Legumes e Verduras", "Carnes", "Frios e Laticíneos", "Higiene e Limpeza" };
	
	public Produto(String nome, double custo, int quantidade) {
		super();
		this.nome = nome;
		this.custo = custo;
		this.quantidade = quantidade;
		//this.tipo = tipo;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

//	public String[] getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String[] tipo) {
//		this.tipo = tipo;
//	}
//


	@Override
	public String toString() {
		return "Produto -> nome: " + nome + ", custo = " + custo + ", quantidade = " + quantidade + " item(ns)" +  "\n";
	}
	
	
	
	
	
	

}

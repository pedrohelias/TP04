package model;

import java.util.ArrayList;

public class MasterModelo {
	
	private ArrayList<Convidado> convidados = new ArrayList<Convidado>();
	private ArrayList<Evento> eventos = new ArrayList<Evento>();
	private ArrayList<Produto> prod = new ArrayList<Produto>();
	private ArrayList<ListaDeGastos> lista = new ArrayList<ListaDeGastos>();
	private Convidado convs;
	private Produto produto;
	private boolean variavelDeConfirmacao;
	
	public MasterModelo() {
		variavelDeConfirmacao = true;
	}
	
	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}
	public void setConvidados(ArrayList<Convidado> convidados) {
		this.convidados = convidados;
	}
	public ArrayList<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}
	public ArrayList<Produto> getProd() {
		return prod;
	}
	public void setProd(ArrayList<Produto> prod) {
		this.prod = prod;
	}
	public ArrayList<ListaDeGastos> getLista() {
		return lista;
	}
	public void setLista(ArrayList<ListaDeGastos> lista) {
		this.lista = lista;
	}
	public Convidado getConvs() {
		return convs;
	}
	public void setConvs(Convidado convs) {
		this.convs = convs;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public void addConvidado(Convidado c) {
		this.convidados.add(c);
	}
	
	public void retiraConvidado(Convidado c) {
		this.convidados.remove(c);
	}
	
	public void addProduto(Produto prod) {
		this.prod.add(prod);
	}
	
	public void retiraProduto(Produto prod) {
		this.prod.remove(prod);
	}
	
	
	

}

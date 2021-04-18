package model;

public class Telefone {
	protected int DDD;
	protected int numero;
	
	public Telefone(int codigo, int number) {
		this.DDD = codigo;
		this.numero = number;
	}
	
	public void cadastrar(int dDD, int numero) {
		setDDD(dDD);
		setNumero(numero);
		System.out.println("(" +  getDDD() + ")" + getNumero() );
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
	
	public int getDDD() {
		return DDD;
	}
	public void setDDD(int dDD) {
		DDD = dDD;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: (" + DDD + ")" + numero;
	}
	
	
	
	
	
}

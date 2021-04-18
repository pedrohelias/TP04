package model;

import java.util.ArrayList;

public class Evento {
	
	private ArrayList<Convidado> listaDePresenca = new ArrayList<Convidado>();
	private String nomeDoEvento;
	
	private String tempo;
	private boolean statusDoEvento;
	
	
	public Evento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public ArrayList<Convidado> getListaDePresenca() {
		return listaDePresenca;
	}


	public void setListaDePresenca(ArrayList<Convidado> listaDePresenca) {
		this.listaDePresenca = listaDePresenca;
	}


	public String getNomeDoEvento() {
		return nomeDoEvento;
	}


	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}





	public String getTempo() {
		return tempo;
	}


	public void setTempo(String tempo) {
		this.tempo = tempo;
	}


	public boolean isStatusDoEvento() {
		return statusDoEvento;
	}


	public void setStatusDoEvento(boolean statusDoEvento) {
		this.statusDoEvento = statusDoEvento;
	}
	
	//Adicoes e retirada de convidados para eventos
	
	public void addConvidado(Convidado conv) {
		this.listaDePresenca.add(conv);
	}
	
	public void retirarConvidado(Convidado conv) {
		this.listaDePresenca.remove(conv);
	}

	//FIM ADICAO E RETIRADA DO EVENTO
	
	
	
	@Override
	public String toString() {
		return "Evento [listaDePresenca=" + listaDePresenca + ", nomeDoEvento=" + nomeDoEvento + ", tempo=" + tempo
				+ ", statusDoEvento=" + statusDoEvento + "]";
	}
	
	//fim de adicoes e retiradas de convidados
	
	
	
	
	
	
	
	
	
	
		
	
	

	
	
	
}

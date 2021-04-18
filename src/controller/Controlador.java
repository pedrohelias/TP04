package controller;
import java.util.ArrayList;

import model.*;
import view.*;


public class Controlador {

	PainelLista painelLista = new PainelLista(this); //adicionando painel lista de convidados
	TabelaLista tabelalista = new TabelaLista(this); //adicionando tabela dos convidados 
	PainelListaCompras painelcompras = new PainelListaCompras(this);
	//TabelaListaCompras tabelacompras = new TabelaListaCompras(this);
	MasterModelo servico = new MasterModelo();
	
	Master menuPrincipal = new Master(painelLista, tabelalista, painelcompras);
	
	public void mudarSetVisible() { //criado pois nõa é possivel um panel alterar a visibilidade do Frame Master, sendo necessario chamar o Controle
		menuPrincipal.setVisible(true);
	}
	
}

package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.*;

public class Master extends JFrame{
	
	private JButton botaoListaConv;
	private JButton botaoTabelaCompras;
	private JLabel titulo;
	private JLabel descricaoBottLista;
	private JLabel descricaoBottTabela;
	
	
	public Master(PainelLista painellista, TabelaLista tabelalista, PainelListaCompras painellistacompras)
	{
		getContentPane().setBackground(Color.WHITE);
		
		setBounds(100, 100, 781, 533);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setTitle("Menu Inicial");
		setResizable(true);
		setLocationRelativeTo(null); //centralizar a tela

		//setVisible(true);
		
		
		titulo = new JLabel("MENU");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.BLACK);
		titulo.setFont(new Font("null", Font.BOLD, 35));
		titulo.setBounds(267, 150, 245, 150);
		getContentPane().add(titulo);
		
		
		botaoListaConv = new JButton("Lista de Convidados");
		botaoListaConv.setBounds(550, 300, 180, 180);
		getContentPane().add(botaoListaConv);
		
		botaoListaConv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Click) {
				painellista.setLocationRelativeTo(null); //centralizar a tela
				painellista.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		botaoTabelaCompras = new JButton("Lista de Compras");
		botaoTabelaCompras.setBounds(50, 300, 180, 180);
		getContentPane().add(botaoTabelaCompras);
		
		botaoTabelaCompras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Click) {
				painellistacompras.setLocationRelativeTo(null); //centralizar a tela
				painellistacompras.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		
		
		
		//painellista.setVisible(false); //teste!!!
		//tabelalista.setVisible(false);
		setVisible(true);
		
	}
}

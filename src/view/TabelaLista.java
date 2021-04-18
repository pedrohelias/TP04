package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controller.*;

public class TabelaLista extends JFrame {
	
	private JButton botaoVoltar;
	private JPanel painelTabela;

	public TabelaLista(Controlador controle) {
		super("Tabela com convidados");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 572);
//		painelTabela = new JPanel();
//		painelTabela.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(painelTabela);
//		painelTabela.setLayout(null);
		
		
		Object[][] dados =
			{
					{"1", "A", "AAAA", "AAAAAA"},
					{"2", "B", "AAAA", "AAAAAA"},
					{"3", "C", "AAAA", "AAAAAA"},
					{"4", "D", "AAAA", "AAAAAA"},
					{"5", "E", "AAAA", "AAAAAA"},
					
					
			};
		
		String[] Cabecalho= {"numero" , "letra" , "letrasss" , "letraassss"};
		
		//criando a tabela
		JTable table = new JTable(dados,Cabecalho);
		table.setPreferredScrollableViewportSize(new Dimension(500,80));
		//painelTabela.add(table);
		//
		JScrollPane pane = new JScrollPane(table);
		getContentPane().add(pane,BorderLayout.CENTER);
		//painelTabela.add(pane);
		
//		botaoVoltar = new JButton("Voltar");
//		botaoVoltar.setBounds(300, 500, 140,27);
//		table.add(botaoVoltar);
		
		
	}
	
	
	
}

package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
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


public class PainelLista extends JFrame  {
	
	
	private JPanel painelLista;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textID;
	private JTextField textTelefone;
	private JTextField textPermissao;
	private JLabel labelNome;
	private JLabel labelEmail;
	private JLabel labelID;
	private JLabel labelTelefone;
	private JLabel labelPermissao; //false para convidados
	private JButton botaoAdicionar;
	private JButton botaoVoltar;
	private JButton botaoVerLista;
	private Controlador controle;
	private Master master;
	
	
	
	public PainelLista(Controlador controleDireto) {
		
		controle = controleDireto;
		//abaixo as definições sobre o painel e como ele vai se comportar no frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Painel | Lista");
		setBounds(100, 100, 524, 380);
		painelLista = new JPanel();
		painelLista.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelLista);
		painelLista.setLayout(null);
		painelLista.setBackground(Color.WHITE);
		
		
		//LABELS
		
		//abaixo as configurações para LABELNOME
		labelNome = new JLabel("Nome:"); //texto da label 
		//labelNome.setHorizontalAlignment(SwingConstants.TRAILING); //definindo a orientacao e formatacao
		//labelnome.setFont(new Font("Arial", Font.PLAIN, 15)); //definindo a fonte do label
		labelNome.setBounds(73, 61, 77, 27); //definindo dimensões
		painelLista.add(labelNome); //adicionar essa label ao painel
		
		//abaixo as configuracoes para LABEL
		
		textNome = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textNome.setBounds(273,61,200,27);
		painelLista.add(textNome);
		
		
		labelEmail = new JLabel("E-mail:"); //texto da label 
		//labelEmail.setHorizontalAlignment(SwingConstants.TRAILING); //definindo a orientacao e formatacao
		//labelnome.setFont(new Font("Arial", Font.PLAIN, 15)); //definindo a fonte do label
		labelEmail.setBounds(73, 100, 77, 27); //definindo dimensões
		painelLista.add(labelEmail); //adicionar essa label ao painel
		
		textEmail = new JTextField();
		//textNome.setHorizontalAlignment(SwingConstants.TRAILING);
		//textNome.setFont(new Font(""))
		textEmail.setBounds(273,100,200,27);
		painelLista.add(textEmail);
		
		labelID = new JLabel("ID:");
		labelID.setBounds(73,139,77,27);
		painelLista.add(labelID);
		
		textID = new JTextField();
		textID.setBounds(273,139,200,27);
		painelLista.add(textID);
		
		labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(73,178,77,27);
		painelLista.add(labelTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(273,178,200,27);
		painelLista.add(textTelefone);
		
		labelTelefone = new JLabel("Permissão");
		labelTelefone.setBounds(73,217,77,27);
		painelLista.add(labelTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(273,217,200,27);
		painelLista.add(textTelefone);
		
		botaoAdicionar = new JButton("Add convidado");
		botaoAdicionar.setBounds(36,300,140,27);
		painelLista.add(botaoAdicionar);
		
		botaoVerLista = new JButton("Ver a lista");
		botaoVerLista.setBounds(187,300,140,27);
		painelLista.add(botaoVerLista);
		
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(336, 300, 140,27);
		painelLista.add(botaoVoltar);
		
		botaoVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent click) {
				controleDireto.mudarSetVisible();
				setVisible(false);
				
				
			}
		});
		
		
	}
	
}

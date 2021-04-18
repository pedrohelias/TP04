package model;

public class Convidado extends Pessoa{
	

	private boolean presenca;
	private String presenteConv;
	
	
	public Convidado(String no, String em, Telefone numero, int ida, int idzao, boolean pres, String presente) {
		super();
		this.nome = no;
		this.email = em;
		this.telefone = numero;
		this.idade = ida;
		this.permissaoMaster = false;
		this.ID = idzao;
		this.presenca = pres;
		this.presenteConv = presente;
		this.papel = "Convidado";
	}
	
	 //sobreescrito pois a classe Pessoa não representa o presente inserido, já a classe Convidado possui associação direta com presente, sendo necessário fazer uma sobreescrição no método status(), original da classe Pessoa.
	
	@Override
	
	public void status() {
		System.out.println("_____________Status________________");
		System.out.println(getNome());
		System.out.println(getTelefone());
		System.out.println(getID());
		System.out.println(getEmail());
		System.out.println(getIdade());
		System.out.println(getPermissaoMaster());
		System.out.println(getPapel());
		System.out.println(getPresenteConv());
		
		
		
		
	}
	
	public void checkIn() {
		if(getPresenca()) {
			System.out.println("Vou estar presente!");
		}else {
			System.out.println("Não irei!");
		}
	}

	public boolean getPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	

	public String getPresenteConv() {
		return presenteConv;
	}




	public void setPresenteConv(String presenteConv) {
		this.presenteConv = presenteConv;
	}

	@Override
	public String toString() {
		return " Convidado -> " + nome + ", email=" + email + ", " + telefone + ", idade = " + idade + " anos"
				+ ", permissaoMaster=" + permissaoMaster + ", ID=" + ID + ", papel=" + papel + ", presenca=" + presenca
				+ ", presenteConv = " + presenteConv +  "\n";
	}





	
	
	
}

package entidades;

public class Aluguel {
	private String nome;
	private String email;
	
	
	public Aluguel() {
		
	}


	public Aluguel(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Aluguel:" + nome + ", email=" + email;
	}


	
	
	
}

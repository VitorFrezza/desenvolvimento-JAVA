package entidades;

public class Conta {
	private int numero;
	private String usuario;
	private double saldo;
	
	public Conta(int numero, String usuario, double depositoInicial) {
		this.numero = numero;
		this.usuario = usuario;
		deposito(depositoInicial);
	}

	public Conta(int numero, String usuario) {
		this.numero = numero;
		this.usuario = usuario;
	}
	
	

	public Conta() {
		
	}

	public int getNumero() {
		return numero;
	}
	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
	
	public void saque(double quantidade) {
		saldo -= quantidade + 5;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", usuario=" + usuario + ", saldo=" + saldo + "]";
	}
	
	
	

}


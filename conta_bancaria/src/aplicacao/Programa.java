package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Conta conta;

		System.out.println("Digite o numero da conta:");
		int numero = sc.nextInt();

		System.out.println("Digite o nome do usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();

		System.out.println("Possui deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);

		if (resposta == 's' || resposta == 'S') {
			System.out.println("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, usuario, depositoInicial);
		} else {
			conta = new Conta(numero, usuario);
		}

		System.out.println(conta);
		
		System.out.println();
		System.out.println("Deseja fazer um deposito (s/n)?");
		resposta = sc.next().charAt(0);
		
		if (resposta == 's' || resposta == 'S') {
		System.out.println();
		System.out.println("Entre com o valor do depósito:");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);
		}
		
		System.out.println("Deseja fazer um saque (s/n)?");
		resposta = sc.next().charAt(0);
		
		if (resposta == 's' || resposta == 'S') {
		System.out.println();
		System.out.println("Entre com o valor do saque:");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta);
		}
		
		System.out.println("Programa Encerrado!");

		sc.close();
	}

}

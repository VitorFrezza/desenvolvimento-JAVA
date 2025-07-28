package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		System.out.println("Digite a quantidade de produtos pra cadastrar");
		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (i = 0; i < vect.length; i++) {
			sc.nextLine(); // consumir a quebra de linha
			System.out.println("Digite o nome do produto");
			String nome = sc.nextLine();
			System.out.println("Digite o preco do produto");
			Double preco = sc.nextDouble();
			vect[i] = new Product(nome, preco); // vai apontar para o objeto no heap

		}
		
		double soma = 0;
		for(i=0; i < vect.length; i ++) {
			soma += vect[i].getPrice();
			
		}
		double media = soma/vect.length;
		
		System.out.println("A media de preço dos produtos é: $" + media);

		sc.close();

	}

}

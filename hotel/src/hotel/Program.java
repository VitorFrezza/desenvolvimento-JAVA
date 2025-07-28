package hotel;

import java.util.Scanner;

import entidades.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		
		Aluguel [] vect = new Aluguel[10];
		
		System.out.println("Quantos quartos gostaria de alugar?");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			System.out.println("Aluguel #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.print("Digite o numero do quarto desejado (1 a 10): ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Aluguel(nome, email);
			
		}
		
		System.out.println();
		System.out.println("Quartos alugados:" );
		for( int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();


	}

}

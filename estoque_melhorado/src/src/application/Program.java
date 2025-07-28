package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		JOptionPane.showMessageDialog(null,"Entre com os dados do produto");
		
		product.name = JOptionPane.showInputDialog("Digite o Nome do produto:");
		product.price = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
		product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd do produto"));
		
		
		JOptionPane.showMessageDialog(null,product);
		
		JOptionPane.showMessageDialog(null,"Entre com a quantidade de produtos que gostaria de add:");
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd a adicionar"));
		product.addProducts(quantity);
		
		JOptionPane.showMessageDialog(null,"Dados atualizados do produto:"+ product);
		
		JOptionPane.showMessageDialog(null,"Entre com a quantidade de produtos que gostaria de remover:");
		quantity = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtd a remover"));
		product.removeProducts(quantity);
		
		JOptionPane.showMessageDialog(null,"Dados atualizados do produto:"+ product);
		
		sc.close();

	}

}

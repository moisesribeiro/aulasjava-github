package aplicacao_exercicio_estoque;

import java.util.Locale;
import java.util.Scanner;

import entidades_exercicio_estoque.Product;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		/*
		 * Quando eu quero meu programa com um construtor definido, primeiro eu tenho que ler as informações
		 * e depois eu as instancio no objeto.
		 *  
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		*/
		
		/*
		 * Quando eu quero meu programa com um construtor definido, primeiro eu tenho que ler as informações
		 * e depois eu as instancio no objeto.
		 * Aqui vou utilizar apenas dois argumentos, entendendo que a quantidade será padronizada pelo Java,
		 * ou seja, não será solicitado ao usuário entrar com a quantidade no início do programa.
		 *  
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		*/
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println(); 
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		//quantity = sc.nextInt(); caso eu utilize o construtor com argumentos essa linha precisa ser lida.
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println(); 
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		sc.close();

	}

}

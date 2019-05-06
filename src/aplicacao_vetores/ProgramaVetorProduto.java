package aplicacao_vetores;

import java.util.Locale;
import java.util.Scanner;

import entidades_vetores.VetorProduto;

public class ProgramaVetorProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		VetorProduto[] vet = new VetorProduto[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new VetorProduto(nome, preco);
		}
		
		double soma = 0.0;
		
		for(int i = 0; i<vet.length; i++) {
			soma += vet[i].getPreco();
		}
		
		double media = soma/vet.length;
		
		System.out.printf("MEDIA PRECO = %.2f%n" , media);

		sc.close();

	}

}

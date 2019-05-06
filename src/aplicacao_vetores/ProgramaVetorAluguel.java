package aplicacao_vetores;

import java.util.Scanner;

import entidades_vetores.VetorAluguel;

public class ProgramaVetorAluguel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		VetorAluguel[] vet = new VetorAluguel[10];

		System.out.println("Quantos quartos deseja alugar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vet[quarto] = new VetorAluguel(nome, email);
		}

		System.out.println();
		System.out.println("Lista de Quartos:");
		for(int i = 0; i<10; i++) {
			if(vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		sc.close();

	}

}

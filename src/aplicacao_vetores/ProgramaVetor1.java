package aplicacao_vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaVetor1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vet = new double[n];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		double media = soma / vet.length;

		System.out.printf("MEDIA ALTURA: %.2f%n", media);

		sc.close();

	}

}

package aplicacao_exercicios_medios;

import java.util.Scanner;
import java.util.Locale;

public class AreaCirculo {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		 * valor da área deste círculo com quatro casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double R, A, pi = 3.14159;

		double pi = 3.14159;

		double R = sc.nextDouble();

		double A = pi * R * R;

		System.out.printf("A=%.4f%n", A);

		sc.close();
	}

}

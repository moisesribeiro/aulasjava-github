package aplicacao_exercicios_medios;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		 * calcule e mostre a diferen�a do produto de A e B pelo produto de C e D
		 * segundo a f�rmula: DIFERENCA = (A * B - C * D).
		 */
		
		int A, B, C, D, Diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = A * B - C * D;
		
		System.out.println("DIFERENCA = " + Diferenca);
		
		sc.close();

	}

}

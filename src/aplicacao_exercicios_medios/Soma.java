package aplicacao_exercicios_medios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 * Entrada:10 30 Saída:SOMA = 40
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//int A, B;
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int Soma  = A + B;
		
		System.out.println("SOMA = " + Soma);
		
		sc.close();

	}

}

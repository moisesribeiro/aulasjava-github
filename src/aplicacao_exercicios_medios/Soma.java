package aplicacao_exercicios_medios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses n�meros com uma mensagem explicativa, conforme exemplos.
		 * Entrada:10 30 Sa�da:SOMA = 40
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

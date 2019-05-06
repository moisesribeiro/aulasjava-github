package aplicacao_exercicios_medios;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		/*
		 * Em Java, quando for para ter a entrada de dados pelo usu�rio,
		 * o processo segue da seguinte forma:
		 * 1� Declara um Scanner, que � o m�todo utilizado para introduzir a leitura do dado.
		 * 2� Faz a leitura desse dado atrav�s da declara��o, que pode ser inteiro ou double.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		sc.close();
	}

}

package aplicacao_exercicios_medios;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Valores s�o multiplos");
		} else {
			System.out.println("Valores n�o s�o multiplos");
		}
		sc.close();

	}

}

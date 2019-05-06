package exercicios_iniciais;


import java.util.Scanner;
import java.util.Locale;


public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale .US);
		Scanner sc = new Scanner(System.in);
		
		int Funcionario, Horas;
		double Salario;
		
		Funcionario = sc.nextInt();
		Horas = sc.nextInt();
		Salario = sc.nextDouble();
		
		Salario = Salario * Horas;
		
		System.out.println("NUMBER " + Funcionario);
		System.out.printf("SALARY = U$ %.2f%n", Salario);
		
		
		sc.close();
		

	}

}

package aplicacao_orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

import entidades_orientacao_objetos.ContaCorrente;

public class ProgramaBanco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente contacorrente;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			contacorrente = new ContaCorrente(number, holder, initialDeposit);
		} else {
			contacorrente = new ContaCorrente(number, holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(contacorrente);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contacorrente.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(contacorrente);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		contacorrente.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(contacorrente);

		sc.close();
	}
}
package aplicacao_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades_listas.Funcionario;



public class ProgramListaFuncionario {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
           N funcionários. Não deve haver repetição de id.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
				System.out.print("How many employees will be registered? ");
				int n = sc.nextInt();
				
				for (int i=1; i<=n; i++) {
					System.out.println();
					System.out.println("Employee #" + i + ": ");
					System.out.print("Id: ");
					int id = sc.nextInt();
					System.out.print("Name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.print("Salary: ");
					double salary = sc.nextDouble();
					list.add(new Funcionario(id, name, salary));
				}
				
				/*
				 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
				   Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
                   mensagem e abortar a operação. 
                   */
				
				// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
				
				System.out.println();
				System.out.print("Enter the employee id that will have salary increase: ");
				int id = sc.nextInt();
				Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (emp == null) {
					System.out.println("This id does not exist!");
				}
				else {
					System.out.print("Enter the percentage: ");
					double percentage = sc.nextDouble();
					emp.aumentoSalary(percentage);
				}
				
				/*
				 * Ao final, mostrar a listagem atualizada dos funcionários,
                   conforme exemplos.
                   
                   How many employees will be registered? 3
				
				Emplyoee #1:
				Id: 333
				Name: Maria Brown
				Salary: 4000.00
				Emplyoee #2:
				Id: 536
				Name: Alex Grey
				Salary: 3000.00
				
				Enter the employee id that will have salary increase : 536
				Enter the percentage: 10.0
				
				List of employees:
				333, Maria Brown, 4000.00
				536, Alex Grey, 3300.00
				
				 */
				
				// PART 3 - LISTING EMPLOYEES:
				
				System.out.println();
				System.out.println("List of employees:");
				for (Funcionario obj : list) {
					System.out.println(obj);
				}
		
		sc.close();

	}

}

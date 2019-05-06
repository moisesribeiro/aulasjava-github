package aplicacao_orientacao_objetos;

import java.util.Locale;
import java.util.Scanner;

import entidades_orientacao_objetos.Aluno;

public class ProgramaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("RESULTADO %.2f POINTS%n", aluno.resultadoFinal());
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
		

	}

}

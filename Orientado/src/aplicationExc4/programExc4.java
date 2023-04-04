package aplicationExc4;

import java.util.Scanner;

import entitiesExc4.student;

public class programExc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		student aluno = new student();

		System.out.println("Nome: ");
		aluno.name = sc.nextLine();
		System.out.println("Notas: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();

		System.out.println("Nota Final: " + aluno.soma());
		if (aluno.soma() < 60) {
			System.out.println("Reprovado!!!");
			System.out.println("pontos que falta: " + aluno.media());
		} else {
			System.out.println("Passou!!!");
		}
		sc.close();
	}

}

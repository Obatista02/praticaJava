package aplicationExc3;

import java.util.Scanner;

import entitiesExc3.salario;

public class programExc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		salario sal = new salario();

		System.out.printf("Name: ");
		sal.name = sc.nextLine();
		System.out.println("Salario Bruto: ");
		sal.glossSalary = sc.nextDouble();
		System.out.println("Taxa: ");
		sal.tax = sc.nextDouble();

		System.out.println("Funcionario: " + sal.toString());
		System.out.println();

		System.out.println("qual porcentagem vai aumentar?");
		double porcetagem = sc.nextDouble();
		sal.incrementSalary(porcetagem);
		
		System.out.println("Salario Atualizado: "+ sal);

		sc.close();
	}

}

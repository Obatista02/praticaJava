package aplicationExc5;

import java.util.Scanner;

import entitiesExc5.Dolar;

public class programExc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		Dolar dol = new Dolar();
		
		System.out.print("Quanto ta o dolar?  ");
		dol.preco = sc.nextDouble();
		System.out.print("Quantos dolares quer?  ");
		dol.dolar = sc.nextDouble();
		
		System.out.println("Em reais: "+ dol.conversao());
		
		
		sc.close();
	}

}

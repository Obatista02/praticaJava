package aplicationExc2;

import java.util.Scanner;

import entitiesExc2.retangulo;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		retangulo ret = new retangulo();

		System.out.println("Entre com os valores de altura e largura: ");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();

		System.out.println(ret.toString());
		sc.close();
	}

}

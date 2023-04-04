package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("entre com os valores do triangulo A: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com os valores do triangulo B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble(); 
		y.c = sc.nextDouble();

		
		double areaA = x.area();
		
		double areaB = y.area(); 
				
		System.out.println(areaA);
		System.out.println(areaB);
		
		if(areaA > areaB) {
			System.out.println("maior area A");
		}else {
			System.out.println("Menor area B");
		}
		sc.close();
	}

}

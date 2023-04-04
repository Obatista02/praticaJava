package helloWord;

import java.util.Locale;
import java.util.Scanner;

public class olaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		Double result;
		Double reais;
		Double dolar = 5.39;
		
		System.out.println("quer converte para (1) dolar ou (2)real?");
		n = sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Digite o valor de dolares para a conversão");
			reais = sc.nextDouble();
			result = reais * dolar;
			System.out.println(result);
		case 2:
			System.out.println("Digite o valor de reias para a conversão");
			reais = sc.nextDouble();
			result = reais / dolar;
		 	System.out.println(result);
		 }
		
		sc.close();
		
		
	}

}

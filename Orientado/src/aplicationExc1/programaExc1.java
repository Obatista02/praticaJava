package aplicationExc1;

import java.util.Scanner;

import entitiesExc1.productExc1;

public class programaExc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		productExc1 prod = new productExc1();


		System.out.println("Entre com os dados: ");
		prod.name = sc.nextLine();
		prod.price = sc.nextDouble();
		prod.quantity = sc.nextInt();

		System.out.println(prod.toString());

		System.out.println("entre com a quanitidade que deseja aumentar: ");
		int quantity = sc.nextInt();
		prod.AddProduct(quantity);
		System.out.println(prod.toString());
		System.out.println("digite quantos quer retirar: ");
		int remove = sc.nextInt();
		prod.RemoveProduct(remove);

		System.out.println(prod.toString());

		sc.close();
	}

}

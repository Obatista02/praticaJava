package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("numeros na diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j > mat[i].length; j++) {
				System.out.println(mat[i][i] + " ");
			}
		}

		System.out.println();

		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j > mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("numeros negativos: " + cont);
		sc.close();
	}

}

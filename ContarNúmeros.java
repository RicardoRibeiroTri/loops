package Loops;

import java.util.Scanner;

public class ContarNúmeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Digite o número: ");
		n = sc.nextInt();
		System.out.println("Números: ");
		
		for (int i = 0; i < n; i++) {
			
		System.out.println(i+1);
		}

	}

}

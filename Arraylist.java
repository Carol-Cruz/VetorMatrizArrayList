package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner captura = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a cor : ");

			String cor = captura.nextLine();

			cores.add(cor);

		}

		System.out.println("As cores digitadas foram: ");
		for (String cor : cores) {

			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("As cores em ordem crescente foram: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		captura.close();
	}

}

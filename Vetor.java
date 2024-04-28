package arraylist;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		int mostra = 0;
		Scanner captura = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar:");
		numero = captura.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
				System.out.println("O número " + numero + " está localizado na posição:" + i);
				mostra = i;
				{

				}
			}
		}
		if (numero != vetor[mostra]) {
			System.out.println("o número " + numero + " não foi encontrado");
		}

	}

}

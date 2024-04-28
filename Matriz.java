package arraylist;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float matriz[][] = new float[10][4];
		float vetor[] = new float[10];

		float participante = 0;
		float soma = 0f;
		float media = 0;
	
		
		
		Scanner captura = new Scanner(System.in);

		for (int linha = 0; linha < 10; linha++) {
			System.out.println(
					"Prezado(a/e) participante, favor inserir suas quatro notas. Obs: Insira números decimais ex: 1,0.");
			soma = 0f;
			media = 0;

			for (int coluna = 0; coluna < 4; coluna++) {

				participante = matriz[linha][coluna];
				participante = captura.nextFloat();
				soma += participante;
				media = soma / 4f;
				
				
				
			}

			vetor[linha] = media;

		}
		

		
		for (int indice = 0; indice < 10; indice++) {

			System.out.printf("Prezados(as/es) participantes as notas foram: %.2f\n", vetor[indice]);

		}
	
	
	}

}

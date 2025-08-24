import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);

		int soma = 0;
		double media = 0.00;
		int maior = 0;
		int menor = 0;
		int pares = 0;
		int impares = 0;
		int somaP = 0;
		int somaS = 0;

		System.out.println("Números");
		int tam = inp.nextInt();

		int[][] mat = new int[tam][tam];

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.println("Valor");
				mat[i][j] = inp.nextInt();
				soma += mat[i][j];
				if (i == 0 && j == 0) {
					maior = mat[i][j];
					menor = mat[i][j];
				}
				if (mat[i][j] > maior)
					maior = mat[i][j];
				if (mat[i][j] < menor)
					menor = mat[i][j];

				if ((mat[i][j] % 2) == 0)
					pares++;
				else
					impares++;

			}
			somaP += mat[i][i];
			somaS += mat[i][tam - 1 - i];
		}
		media = soma / tam;
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
		System.out.println("Pares " + pares);
		System.out.println("Impares " + impares);
		System.out.println("Principal " + somaP);
		System.out.println("Secundária " + somaS);
		System.out.println("Maior " + maior);
		System.out.println("Maior " + menor);

		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				System.out.print(" | " + mat[i][j]);
			}
		System.out.println("");
		}
		
		inp.close();

	}

}

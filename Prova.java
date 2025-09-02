import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		final int LINHA = 2;
		final int COLUNA = 2;

		int[][] mat = new int[LINHA][COLUNA];
		int soma = 0;
		int maior = 0;
		int menor = 0;
		double media = 0;

		for (int i = 0; i < LINHA; i++) {

			for (int j = 0; j < COLUNA; j++) {

				System.out.println("VALOR");
				mat[i][j] = inp.nextInt();

				if (i == 0 && j == 0) {
					maior = mat[i][j];
					menor = mat[i][j];
				}
				if (mat[i][j] > maior)
					maior = mat[i][j];
				if (mat[i][j] < menor)
					menor = mat[i][j];

				soma += mat[i][j];
			}
		}

		media = soma / (LINHA * COLUNA);
		System.out.println("Gráfico");
		for (int i = 0; i < LINHA; i++) {
			for (int k = 0; k < COLUNA; k++) {
				System.out.print(mat[i][k] + " : ");
				for (int j = 0; j < mat[i][k]; j++) {
					if (mat[i][k] > 0)
						System.out.print("#");
					else {
						System.out.print("Negativo não apresentado");
						System.out.println("  ");
					}
					
					if ((j + 1) == mat[i][k])
						System.out.println("  ");

				}
			}
		}

		System.out.println("Matriz");
		for (int i = 0; i < LINHA; i++) {
			for (int j = 0; j < COLUNA; j++) {
				System.out.print(" | " + mat[i][j]);
			}
			System.out.println("  ");
		}

		System.out.println("Dados");
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		inp.close();

	}

}

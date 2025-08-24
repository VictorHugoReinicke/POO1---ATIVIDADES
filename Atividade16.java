import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


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
		try {
		    BufferedWriter writer = new BufferedWriter(new FileWriter("resultado.txt"));

		    writer.write("Soma: " + soma + "\n");
		    writer.write("Média: " + media + "\n");
		    writer.write("Pares: " + pares + "\n");
		    writer.write("Ímpares: " + impares + "\n");
		    writer.write("Diagonal Principal: " + somaP + "\n");
		    writer.write("Diagonal Secundária: " + somaS + "\n");
		    writer.write("Maior: " + maior + "\n");
		    writer.write("Menor: " + menor + "\n");
		    writer.write("Matriz:\n");

		    for (int i = 0; i < tam; i++) {
		        for (int j = 0; j < tam; j++) {
		            writer.write(" | " + mat[i][j]);
		        }
		        writer.write("\n");
		    }

		    writer.close();
		    System.out.println("Resultados salvos em 'resultado.txt'");
		} catch (IOException e) {
		    System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
		}

		
		inp.close();

	}

}

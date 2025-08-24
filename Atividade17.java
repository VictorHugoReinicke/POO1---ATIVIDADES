import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final int TAM = 5;
        double[][] mat = new double[TAM][TAM];
        double[] mediaProduto = new double[TAM];
        double[] somaSupermercado = new double[TAM];

        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Supermercado " + (i + 1));
            for (int j = 0; j < TAM; j++) {
                System.out.print("  Preço do produto " + (j + 1) + ": ");
                mat[i][j] = inp.nextDouble();
            }
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("precos.txt"))) {
            for (int i = 0; i < TAM; i++) {
                for (int j = 0; j < TAM; j++) {
                    writer.write(mat[i][j] + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        
        for (int j = 0; j < TAM; j++) {
            double soma = 0;
            for (int i = 0; i < TAM; i++) {
                soma += mat[i][j];
            }
            mediaProduto[j] = soma / TAM;
        }

       
        for (int i = 0; i < TAM; i++) {
            double soma = 0;
            for (int j = 0; j < TAM; j++) {
                soma += mat[i][j];
            }
            somaSupermercado[i] = soma;
        }

        
        double menor = somaSupermercado[0];
        double maior = somaSupermercado[0];
        int indiceMenor = 0;
        int indiceMaior = 0;

        for (int i = 1; i < TAM; i++) {
            if (somaSupermercado[i] < menor) {
                menor = somaSupermercado[i];
                indiceMenor = i;
            }
            if (somaSupermercado[i] > maior) {
                maior = somaSupermercado[i];
                indiceMaior = i;
            }
        }

        System.out.println("Preços por supermercado");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Supermercado " + (i + 1) + ": ");
            for (int j = 0; j < TAM; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média de preço por produto");
        for (int j = 0; j < TAM; j++) {
            System.out.printf("Produto %d: %.2f\n", j + 1, mediaProduto[j]);
        }

        System.out.println("Soma de preços por supermercado");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("Supermercado %d: %.2f\n", i + 1, somaSupermercado[i]);
        }

        System.out.println("Supermercado mais barato: " + (indiceMenor + 1) + " com total de R$" + menor);
        System.out.println("Supermercado mais caro: " + (indiceMaior + 1) + " com total de R$" + maior);

        // 
        System.out.println("Lendo dados do arquivo");
        try (BufferedReader reader = new BufferedReader(new FileReader("precos.txt"))) {
            String linha;
            int linhaNum = 1;
            while ((linha = reader.readLine()) != null) {
                System.out.println("Supermercado " + linhaNum + ": " + linha);
                linhaNum++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        inp.close();
    }
}

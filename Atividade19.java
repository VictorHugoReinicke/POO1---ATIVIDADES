import java.util.Scanner;
import java.io.*;

public class Atividade19 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Digite o número de atletas: ");
        int N = inp.nextInt();

        double[][] saltos = new double[N][5];
        double[] medias = new double[N];
        String[] nomes = new String[N];
        inp.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do atleta " + (i + 1) + ": ");
            nomes[i] = inp.nextLine();

            double soma = 0;
            double menor = Double.MAX_VALUE;

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o salto " + (j + 1) + " de " + nomes[i] + ": ");
                saltos[i][j] = inp.nextDouble();
                soma += saltos[i][j];
                if (saltos[i][j] < menor) {
                    menor = saltos[i][j];
                }
            }
            inp.nextLine();

            medias[i] = (soma - menor) / 4;
            System.out.print("Média dos saltos (desprezando o pior) de " + nomes[i] + ": ");
            System.out.println(String.format("%.2f", medias[i]));
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saltos.txt"))) {
            for (int i = 0; i < N; i++) {
                writer.write(nomes[i]);
                for (int j = 0; j < 5; j++) {
                    writer.write(";" + saltos[i][j]);
                }
                writer.write(";" + medias[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.print("Erro ao gravar o arquivo: ");
            System.out.println(e.getMessage());
        }

        
        System.out.println("Resultados Finais");
        for (int i = 0; i < N; i++) {
            System.out.print(nomes[i] + " - Saltos: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("%.2f", saltos[i][j]) + " ");
            }
            System.out.print("- Média: ");
            System.out.println(String.format("%.2f", medias[i]));
        }

  
        double maiorMedia = medias[0];
        double menorMedia = medias[0];
        String campeao = nomes[0];
        String ultimo = nomes[0];

        for (int i = 1; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                campeao = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                ultimo = nomes[i];
            }
        }

        System.out.print("Campeão: " + campeao + " com média ");
        System.out.println(String.format("%.2f", maiorMedia));
        System.out.print("Último lugar: " + ultimo + " com média ");
        System.out.println(String.format("%.2f", menorMedia));

       
        System.out.println("Dados gravados no arquivo");
        try (BufferedReader reader = new BufferedReader(new FileReader("saltos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.print("Erro ao ler o arquivo: ");
            System.out.println(e.getMessage());
        }

        inp.close();
    }
}

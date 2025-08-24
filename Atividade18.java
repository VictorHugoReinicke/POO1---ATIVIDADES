import java.util.Scanner;
import java.io.*;

public class Atividade18 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int N = inp.nextInt();
        inp.nextLine();

        String[] nomes = new String[N];
        double[][] notas = new double[N][2];
        double[] medias = new double[N];

       
        for (int i = 0; i < N; i++) {
            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = inp.nextLine();
            System.out.print("Nota 1: ");
            notas[i][0] = inp.nextDouble();
            System.out.print("Nota 2: ");
            notas[i][1] = inp.nextDouble();
            inp.nextLine();
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))) {
            for (int i = 0; i < N; i++) {
                writer.write(nomes[i] + ";" + notas[i][0] + ";" + notas[i][1] + ";" + medias[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

    
        System.out.println("Dados dos Alunos");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s - Nota1: %.2f, Nota2: %.2f, Média: %.2f\n",
                    nomes[i], notas[i][0], notas[i][1], medias[i]);
        }

        
        double maiorNota = notas[0][0], menorNota = notas[0][0];
        String alunoMaiorNota = nomes[0], alunoMenorNota = nomes[0];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                    alunoMaiorNota = nomes[i];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                    alunoMenorNota = nomes[i];
                }
            }
        }

       
        double maiorMedia = medias[0], menorMedia = medias[0];
        String alunoMaiorMedia = nomes[0], alunoMenorMedia = nomes[0];

        for (int i = 1; i < N; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaiorMedia = nomes[i];
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenorMedia = nomes[i];
            }
        }

       
        double somaMedias = 0;
        for (double m : medias) {
            somaMedias += m;
        }
        double mediaGeral = somaMedias / N;

        
        System.out.println("Estatísticas");
        System.out.printf("Maior nota: %.2f (%s)\n", maiorNota, alunoMaiorNota);
        System.out.printf("Menor nota: %.2f (%s)\n", menorNota, alunoMenorNota);
        System.out.printf("Maior média: %.2f (%s)\n", maiorMedia, alunoMaiorMedia);
        System.out.printf("Menor média: %.2f (%s)\n", menorMedia, alunoMenorMedia);
        System.out.printf("Média geral da turma: %.2f\n", mediaGeral);

        System.out.println("Alunos acima da média geral");
        for (int i = 0; i < N; i++) {
            if (medias[i] > mediaGeral) {
                System.out.println(nomes[i] + " - Média: " + medias[i]);
            }
        }

        System.out.println("Alunos abaixo da média geral");
        for (int i = 0; i < N; i++) {
            if (medias[i] < mediaGeral) {
                System.out.println(nomes[i] + " - Média: " + medias[i]);
            }
        }

        
        System.out.println("Lendo dados do arquivo");
        try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        inp.close();
    }
}

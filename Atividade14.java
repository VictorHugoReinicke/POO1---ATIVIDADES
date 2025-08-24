import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        final int ALUNOS = 30;
        int[] idades = new int[ALUNOS];
        double[] alturas = new double[ALUNOS];
        Scanner input = new Scanner(System.in);

        
        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Idade: ");
            idades[i] = input.nextInt();
            System.out.print("Altura (em metros): ");
            alturas[i] = input.nextDouble();
        }

       
        double somaAlturas = 0;
        for (int i = 0; i < ALUNOS; i++) {
            somaAlturas += alturas[i];
        }
        double mediaAltura = somaAlturas / ALUNOS;

        
        int contador = 0;
        for (int i = 0; i < ALUNOS; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("\nMédia de altura: " + String.format("%.2f", mediaAltura) + "m");
        System.out.println("Alunos com mais de 13 anos e altura abaixo da média: " + contador);
        
        input.close();
    }
}

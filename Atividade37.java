import java.util.Scanner;

public class Atividade37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        char[] gabarito = {'A', 'B', 'C', 'D', 'E', 'E', 'D', 'C', 'B', 'A'};

        
        int totalAlunos = 0;
        int maiorAcerto = -1;
        int menorAcerto = 11;
        double somaDasNotas = 0.0;
        
        System.out.println("--- Sistema de Correção de Provas ---");

        String continuar;
        do {
            totalAlunos++;
            int acertosAluno = 0;

            System.out.println("\n--- Aluno " + totalAlunos + " ---");
            for (int i = 0; i < gabarito.length; i++) {
                System.out.print("Resposta da questão " + (i + 1) + ": ");
                char respostaAluno = input.next().toUpperCase().charAt(0);

                if (respostaAluno == gabarito[i]) {
                    acertosAluno++;
                }
            }

           
            double notaAluno = acertosAluno;

            System.out.println("Nota do aluno " + totalAlunos + ": " + notaAluno);

           
            if (acertosAluno > maiorAcerto) {
                maiorAcerto = acertosAluno;
            }
            if (acertosAluno < menorAcerto) {
                menorAcerto = acertosAluno;
            }
            somaDasNotas += notaAluno;

            System.out.print("\nOutro aluno vai utilizar o sistema? (S/N): ");
            continuar = input.next().toUpperCase();

        } while (continuar.equals("S"));

       
        double mediaNotas = 0.0;
        if (totalAlunos > 0) {
            mediaNotas = somaDasNotas / totalAlunos;
        }

        
        System.out.println("\n--- Relatório da Turma ---");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média das notas: " + mediaNotas);

        input.close();
    }
}
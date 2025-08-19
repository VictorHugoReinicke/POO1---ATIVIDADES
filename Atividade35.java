import java.util.Scanner;

public class Atividade35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        System.out.println("--- Eleição Presidencial ---");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar a votação");
        System.out.println("----------------------------");

        int voto;
        do {
            System.out.print("Digite seu voto: ");
            voto = input.nextInt();

            if (voto >= 1 && voto <= 6) {
                totalVotos++;
                switch (voto) {
                    case 1:
                        votosCandidato1++;
                        break;
                    case 2:
                        votosCandidato2++;
                        break;
                    case 3:
                        votosCandidato3++;
                        break;
                    case 4:
                        votosCandidato4++;
                        break;
                    case 5:
                        votosNulos++;
                        break;
                    case 6:
                        votosBrancos++;
                        break;
                }
            } else if (voto != 0) {
                System.out.println("Voto inválido. Tente novamente.");
            }
        } while (voto != 0);

        System.out.println("\n--- Resultado da Votação ---");
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Votos para José (1): " + votosCandidato1);
        System.out.println("Votos para João (2): " + votosCandidato2);
        System.out.println("Votos para Maria (3): " + votosCandidato3);
        System.out.println("Votos para Ana (4): " + votosCandidato4);
        System.out.println("Votos Nulos (5): " + votosNulos);
        System.out.println("Votos em Branco (6): " + votosBrancos);

        if (totalVotos > 0) {
            double percentualNulos = (double) votosNulos / totalVotos * 100;
            double percentualBrancos = (double) votosBrancos / totalVotos * 100;
            
            System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
            System.out.println("Percentual de votos em branco: " + percentualBrancos + "%");
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        input.close();
    }
}
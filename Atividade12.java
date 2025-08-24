import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        final int TAM = 5;
        int[] idade = new int[TAM];
        int[] altura = new int[TAM];

        int velho = 0, novo = 0, alto = 0, baixo = 0;
        int indVelho = 0, indNovo = 0, indAlto = 0, indBaixo = 0;
        double mediaI = 0, mediaA = 0;

        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idade[i] = inp.nextInt();

            System.out.println("Digite a altura (em cm) da pessoa " + (i + 1) + ":");
            altura[i] = inp.nextInt();

            mediaI += idade[i];
            mediaA += altura[i];

            if (i == 0) {
                velho = novo = idade[i];
                alto = baixo = altura[i];
            }

            if (idade[i] > velho) {
                velho = idade[i];
                indVelho = i;
            }
            if (idade[i] < novo) {
                novo = idade[i];
                indNovo = i;
            }

            if (altura[i] > alto) {
                alto = altura[i];
                indAlto = i;
            }
            if (altura[i] < baixo) {
                baixo = altura[i];
                indBaixo = i;
            }
        }

        mediaI /= TAM;
        mediaA /= TAM;

        
        System.out.println("Idades e alturas na ordem inversa:");
        for (int i = TAM - 1; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idade[i] + ", Altura = " + altura[i] + " cm");
        }

        
        System.out.println("Mais velho: Idade = " + velho + ", Altura = " + altura[indVelho] + " cm");
        System.out.println("Mais novo: Idade = " + novo + ", Altura = " + altura[indNovo] + " cm");
        System.out.println("Mais alto: Altura = " + alto + " cm, Idade = " + idade[indAlto]);
        System.out.println("Mais baixo: Altura = " + baixo + " cm, Idade = " + idade[indBaixo]);

       
        System.out.printf("Média de idade: %.2f\n", mediaI);
        System.out.printf("Média de altura: %.2f cm\n", mediaA);

        System.out.println("Pessoas acima da média de idade ou altura:");
        for (int i = 0; i < TAM; i++) {
            if (idade[i] > mediaI || altura[i] > mediaA) {
                System.out.println("Pessoa " + (i + 1) + ": Idade = " + idade[i] + ", Altura = " + altura[i] + " cm");
            }
        }

        System.out.println("Pessoas abaixo da média de idade ou altura:");
        for (int i = 0; i < TAM; i++) {
            if (idade[i] < mediaI || altura[i] < mediaA) {
                System.out.println("Pessoa " + (i + 1) + ": Idade = " + idade[i] + ", Altura = " + altura[i] + " cm");
            }
        }

        inp.close();
    }
}

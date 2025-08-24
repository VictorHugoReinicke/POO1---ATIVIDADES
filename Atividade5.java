import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TAM = 20;
        int pares = 0;
        int impares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        int[] inte = new int[TAM];

        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o valor:");
            inte[i] = input.nextInt();

            if ((inte[i] % 2) == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        
        int[] par = new int[pares];
        int[] impar = new int[impares];

        
        for (int i = 0; i < TAM; i++) {
            if ((inte[i] % 2) == 0) {
                par[contadorPares] = inte[i];
                contadorPares++;
            } else {
                impar[contadorImpares] = inte[i];
                contadorImpares++;
            }
        }

        System.out.println("---");
        System.out.println("Valores originais:");
        for (int i = 0; i < TAM; i++) {
            System.out.print(inte[i] + " ");
        }
        System.out.println("\n---");

        System.out.println("Valores pares:");
        for (int i = 0; i < pares; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println("\n---");

        System.out.println("Valores ímpares:");
        for (int i = 0; i < impares; i++) {
            System.out.print(impar[i] + " ");
        }
        System.out.println("\n---");

        input.close();
    }
}
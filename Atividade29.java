import java.util.Scanner;

public class Atividade29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;

        System.out.println("Telefonou para a vítima? (s/n)");
        if (input.next().equalsIgnoreCase("s")) contador++;

        System.out.println("Esteve no local do crime? (s/n)");
        if (input.next().equalsIgnoreCase("s")) contador++;

        System.out.println("Mora perto da vítima? (s/n)");
        if (input.next().equalsIgnoreCase("s")) contador++;

        System.out.println("Devia para a vítima? (s/n)");
        if (input.next().equalsIgnoreCase("s")) contador++;

        System.out.println("Já trabalhou com a vítima? (s/n)");
        if (input.next().equalsIgnoreCase("s")) contador++;

        input.close();

        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}

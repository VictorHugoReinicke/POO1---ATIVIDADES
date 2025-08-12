import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pontuacao = 0;

        System.out.println("Responda as 10 questões com letras (a,b,c,d,e):");

        System.out.print("Q1: ");
        String r1 = input.nextLine().toLowerCase();
        if (r1.equals("a")) pontuacao++;

        System.out.print("Q2: ");
        String r2 = input.nextLine().toLowerCase();
        if (r2.equals("a")) pontuacao++;

        System.out.print("Q3: ");
        String r3 = input.nextLine().toLowerCase();
        if (r3.equals("b")) pontuacao++;

        System.out.print("Q4: ");
        String r4 = input.nextLine().toLowerCase();
        if (r4.equals("b")) pontuacao++;

        System.out.print("Q5: ");
        String r5 = input.nextLine().toLowerCase();
        if (r5.equals("c")) pontuacao++;

        System.out.print("Q6: ");
        String r6 = input.nextLine().toLowerCase();
        if (r6.equals("c")) pontuacao++;

        System.out.print("Q7: ");
        String r7 = input.nextLine().toLowerCase();
        if (r7.equals("d")) pontuacao++;

        System.out.print("Q8: ");
        String r8 = input.nextLine().toLowerCase();
        if (r8.equals("d")) pontuacao++;

        System.out.print("Q9: ");
        String r9 = input.nextLine().toLowerCase();
        if (r9.equals("e")) pontuacao++;

        System.out.print("Q10: ");
        String r10 = input.nextLine().toLowerCase();
        if (r10.equals("e")) pontuacao++;

        System.out.println("\nResultado:");

        System.out.println("Q1 : " + r1 + " : " + (r1.equals("a") ? "Correto" : "Errada, resposta correta (a)"));
        System.out.println("Q2 : " + r2 + " : " + (r2.equals("a") ? "Correto" : "Errada, resposta correta (a)"));
        System.out.println("Q3 : " + r3 + " : " + (r3.equals("b") ? "Correto" : "Errada, resposta correta (b)"));
        System.out.println("Q4 : " + r4 + " : " + (r4.equals("b") ? "Correto" : "Errada, resposta correta (b)"));
        System.out.println("Q5 : " + r5 + " : " + (r5.equals("c") ? "Correto" : "Errada, resposta correta (c)"));
        System.out.println("Q6 : " + r6 + " : " + (r6.equals("c") ? "Correto" : "Errada, resposta correta (c)"));
        System.out.println("Q7 : " + r7 + " : " + (r7.equals("d") ? "Correto" : "Errada, resposta correta (d)"));
        System.out.println("Q8 : " + r8 + " : " + (r8.equals("d") ? "Correto" : "Errada, resposta correta (d)"));
        System.out.println("Q9 : " + r9 + " : " + (r9.equals("e") ? "Correto" : "Errada, resposta correta (e)"));
        System.out.println("Q10 : " + r10 + " : " + (r10.equals("e") ? "Correto" : "Errada, resposta correta (e)"));

        System.out.println("\nPontuação Final: " + pontuacao);

        input.close();
    }
}

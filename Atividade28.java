import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Digite o primeiro número: ");
        double numero1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = input.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = input.next().charAt(0);
        input.close();
        double resultado = 0;
        String mensagemErro = null;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    mensagemErro = "Erro: Divisão por zero não é permitida.";
                }
                break;
            default:
                mensagemErro = "Operação inválida.";
        }

        if (mensagemErro != null) {
            System.out.println(mensagemErro);
        } else {
            String parImpar = (resultado % 2 == 0) ? "par" : "ímpar";
            String positivoNegativo = (resultado > 0) ? "positivo" : (resultado < 0) ? "negativo" : "zero";
            String inteiroDecimal = (resultado == (long) resultado) ? "inteiro" : "decimal";

            System.out.println("O resultado da operação é: " + df.format(resultado));
            System.out.println("Características do número: " + parImpar + ", " + positivoNegativo + ", " + inteiroDecimal + ".");
        }

        
    }
}
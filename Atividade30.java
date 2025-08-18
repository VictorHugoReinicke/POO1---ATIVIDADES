import java.util.Scanner;

public class Atividade30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo = 0;
        float peso, altura;

        float pesoGordo = 0;
        int codigoGordo = 0;

        float pesoMagro = 0;
        int codigoMagro = 0;

        float alturaAlto = 0;
        int codigoAlto = 0;

        float alturaBaixo = 0;
        int codigoBaixo = 0;

        float somaAlturas = 0;
        float somaPesos = 0;
        int totalClientes = 0;

        
        System.out.println("Digite o código do cliente (0 para sair):");
        codigo = input.nextInt();
        if (codigo != 0) {
            System.out.println("Digite a altura:");
            altura = input.nextFloat();
            System.out.println("Digite o peso:");
            peso = input.nextFloat();

          
            pesoGordo = peso;
            codigoGordo = codigo;
            pesoMagro = peso;
            codigoMagro = codigo;
            alturaAlto = altura;
            codigoAlto = codigo;
            alturaBaixo = altura;
            codigoBaixo = codigo;

            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
        }

    
        while (true) {
            System.out.println("Digite o código do cliente (0 para sair):");
            codigo = input.nextInt();

           
            if (codigo == 0) {
                break;
            }

            System.out.println("Digite a altura:");
            altura = input.nextFloat();
            System.out.println("Digite o peso:");
            peso = input.nextFloat();

      
            if (peso > pesoGordo) {
                pesoGordo = peso;
                codigoGordo = codigo;
            }
            if (peso < pesoMagro) {
                pesoMagro = peso;
                codigoMagro = codigo;
            }

           
            if (altura > alturaAlto) {
                alturaAlto = altura;
                codigoAlto = codigo;
            }
            if (altura < alturaBaixo) {
                alturaBaixo = altura;
                codigoBaixo = codigo;
            }

            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
        }

        System.out.println("--- Relatório da Academia ---");

        if (totalClientes > 0) {
            float mediaAltura = somaAlturas / totalClientes;
            float mediaPeso = somaPesos / totalClientes;

            System.out.printf("O cliente mais alto é o de código %d, com %.2f de altura.%n", codigoAlto, alturaAlto);
            System.out.printf("O cliente mais baixo é o de código %d, com %.2f de altura.%n", codigoBaixo, alturaBaixo);
            System.out.printf("O cliente mais gordo é o de código %d, com %.2f kg.%n", codigoGordo, pesoGordo);
            System.out.printf("O cliente mais magro é o de código %d, com %.2f kg.%n", codigoMagro, pesoMagro);
            System.out.printf("A média de altura dos clientes é: %.2f%n", mediaAltura);
            System.out.printf("A média de peso dos clientes é: %.2f%n", mediaPeso);
        } else {
            System.out.println("Nenhum cliente foi cadastrado.");
        }

        input.close();
    }
}
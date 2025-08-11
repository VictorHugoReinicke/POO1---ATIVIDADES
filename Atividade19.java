import java.util.Scanner;
public class Atividade19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		double a = input.nextDouble();
		
		if(a == 0)
		{
			 System.out.println("A equação não é do segundo grau.");
			 input.close();
		}
		
		System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();
		
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        input.close();
        
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f%n", raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f%n", raiz1, raiz2);
        }
		
	}

}

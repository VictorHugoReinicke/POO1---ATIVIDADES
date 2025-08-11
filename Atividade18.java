import java.util.Scanner;
public class Atividade18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lado1");
		float l1 = input.nextFloat();
		System.out.println("Lado2");
		float l2 = input.nextFloat();
		System.out.println("Lado3");
		float l3 = input.nextFloat();
		
		input.close();
		if (l1 + l2 > l3 &&
	            l1 + l3 > l2 &&
	            l2 + l3 > l1) {

	            System.out.println("Os lados formam um triângulo.");

	            if (l1 == l2 && l2 == l3) {
	                System.out.println("Tipo: Equilátero");
	            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
	                System.out.println("Tipo: Isósceles");
	            } else {
	                System.out.println("Tipo: Escaleno");
	            }

	        } else {
	            System.out.println("Os lados NÃO formam um triângulo.");
	        }
	}

}

import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quanto você ganhar por hora?");
		float salh = input.nextFloat();
		
		System.out.println("Quantas horas trabalha por mês?");
		float horas = input.nextFloat();
		
		input.close();
		
		System.out.println("O salário do mês foi : " + (salh*horas));

	}

}

import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua altura em metros. Ex: 1.73");
		float alt = input.nextFloat();
		
		input.close();
		
		System.out.println("O seu peso ideal é : "+ ((72.7 * alt)-58));
		
	}
	
}

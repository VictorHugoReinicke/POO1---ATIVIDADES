import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite sua altura");
		float alt = input.nextFloat();
		
		System.out.println("Se você é homem, então seu peso ideal é : "+ ((72.7 * alt)-58));
		System.out.println("Se você é mulher, então seu peso ideal é : "+ ((62.1*alt)-44.7));
		
	}

}

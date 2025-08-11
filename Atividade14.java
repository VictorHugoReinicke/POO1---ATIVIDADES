import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Número da semana ");
		int dia = input.nextInt();
		String semana = "";
		
		switch(dia) {
		case 1 :
			semana = "Domingo";
			break;
		case 2 :
			semana = "Segunda";
			break;
		case 3 :
			semana = "Terça";
			break;
		case 4 :
			semana = "Quarta";
			break;
		case 5 :
			semana = "Quinta";
			break;
		case 6 :
			semana = "Sexta";
			break;
		case 7 :
			semana = "Sábado";
			break;
		}
		
		input.close();
		
		System.out.println(semana);
		
		
		
	}

}

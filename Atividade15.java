import java.util.Scanner;
public class Atividade15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Valor do produto");
		float preco = input.nextFloat();
		
		System.out.println("Código");
		int codigo = input.nextInt();
		String local = "";
		
		switch(codigo) {
		
		case 1:
			local = "Sul";
			break;
		case 2:
			local = "Norte";
			break;
		case 3:
			local = "Leste";
			break;
		case 4:
			local = "Oeste";
			break;
		case 5:
			local = "Nordeste";
			break;
		case 6:
			local = "Nordeste";
			break;
		case 7:
			local = "Centro-oeste";
			break;
		case 8:
			local = "Centro-oeste";
			break;
		default:
			local = "Importado";
		
		}
		input.close();
		
		System.out.println("Preço e local : " + preco + " " + local);
		
	}

}

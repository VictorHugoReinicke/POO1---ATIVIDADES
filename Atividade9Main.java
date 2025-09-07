import java.util.Scanner;
public class Atividade9Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		Atividade9 atv = new Atividade9();
		
		System.out.println("Digite o canal");
		atv.setCanal(inp.nextInt());
		
		System.out.println("Digite o volume");
		atv.setVolume(inp.nextInt());
		
		System.out.println(atv.getCanal());
		System.out.println(atv.getVolume());
		
		inp.close();
		

	}

}

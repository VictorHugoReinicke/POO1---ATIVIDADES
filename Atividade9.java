import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Texto");
		String txt = inp.nextLine();
		
		char[] letrasAr = txt.toCharArray();
		
		for(int i =0; i < letrasAr.length; i++) {
			System.out.println(letrasAr[i]);
		}
		
		

	}

}

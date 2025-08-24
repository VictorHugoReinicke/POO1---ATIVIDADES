import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Digite os nomes separados por ; ");
		String[] texto = inp.nextLine().split(";");
		
		for(int i =0; i< texto.length;i++)
			System.out.println(texto[i]);
		
		inp.close();
	}

}

import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número");
		int num = input.nextInt();
		
		input.close();
		 int primeiro = 0;
	     int segundo = 1;

		for(int i = 1; i <= num; i++) {
			int proximo = primeiro + segundo;
			primeiro = segundo;
            segundo = proximo;
			
		}
		System.out.println(primeiro);

	}

}

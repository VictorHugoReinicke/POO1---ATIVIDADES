import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Número 1 do intervalo");
	int num1 = input.nextInt();
	
	System.out.println("Número 1 do intervalo");
	int num2 = input.nextInt();
	
	input.close();
	
	for(int i = num1; i <= num2;i++)
		System.out.println(i);

}
}
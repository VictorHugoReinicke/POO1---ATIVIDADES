import java.util.Scanner;
public class Atividade24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0;

		System.out.println("Número de cds");
		int cds = input.nextInt();
		
		for(int i =0; i< cds;i++) {
			System.out.println("Valor cd " + i);
			int vCd = input.nextInt();
			
			total += vCd;
			}
			input.close();
		System.out.println("O valor total " + total);
		System.out.println("O valor médio " + (total/cds));
		
		}
		

	}
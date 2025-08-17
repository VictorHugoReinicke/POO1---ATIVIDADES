import java.util.Scanner;
public class Atividade23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número de turmas");
		int nT = input.nextInt();
		int med = 0;
		
		for(int i =0; i< nT;i++) {
			System.out.println("Número alunos turma " + i);
			int alunos = input.nextInt();
			if(alunos > 40) {
				System.out.println("Número muito grande. Parando aqui");
				break;
			}
			med += alunos;
		}
		input.close();
		System.out.println("Número média de alunos " + (med/nT));
			
		
		
	}

}

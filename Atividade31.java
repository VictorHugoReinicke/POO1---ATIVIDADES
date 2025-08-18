import java.util.Scanner;
public class Atividade31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroAlunoMaisAlto = 0;
        int alturaMaisAlta = 0;
        int numeroAlunoMaisBaixo = 0;
        int alturaMaisBaixa = 0;
		
		for(int i=1; i<=10;i++) {
			
			System.out.println("Conjunto " + i + ":");
            System.out.print("Digite o número do aluno: ");
            
            int numeroAluno = input.nextInt();
			
            System.out.print("Altura em cm ");
            int alturaAluno = input.nextInt();
            
            if(i ==1) {
            	 numeroAlunoMaisAlto = numeroAluno;
                 alturaMaisAlta = alturaAluno;
                 numeroAlunoMaisBaixo = numeroAluno;
                 alturaMaisBaixa = alturaAluno;
            }
            
            if (alturaAluno > alturaMaisAlta) {
                alturaMaisAlta = alturaAluno;
                numeroAlunoMaisAlto = numeroAluno;
            }
            
            if (alturaAluno < alturaMaisBaixa) {
                alturaMaisBaixa = alturaAluno;
                numeroAlunoMaisBaixo = numeroAluno;
            }
            
		}
		input.close();
		System.out.println("\n--- Resultado ---");
        System.out.println("Aluno mais alto:");
        System.out.println("Número: " + numeroAlunoMaisAlto);
        System.out.println("Altura: " + alturaMaisAlta + " cm");

        System.out.println("\nAluno mais baixo:");
        System.out.println("Número: " + numeroAlunoMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixa + " cm");

	}

}

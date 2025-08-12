package aula1208;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {

		//Montar em 5 minutos com a estrutura for um programa onde o usuário escolha um número para gerar uma tabuada, ele vai escolher onde a tabuada começa e onde ela termina, não pode ser o primeiro número maior que o segundo, invertendo os valores
		
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma tabuada");
		int tab = input.nextInt();
		
		System.out.println("Escolha um número inicial");
		int n1 = input.nextInt();
		
		System.out.println("Escolha um número final");
		int n2 = input.nextInt();
		int recebe =0;
		
		input.close();
		
		
		if(n1 > n2) {
			System.out.println("Número inicial maior que o segundo, invertendo valores");
			recebe = n1;
			n1 = n2;
			n2 = recebe;
		}
		for(int x = n1; x <=n2;x++) {
			System.out.println("Tabuada de "+ tab + " Iniciando em " + x +" Finalizando em "+ n2 + " = "+ x*tab);
		}		
		
		//Perguntar ao usuário um valor e só aceitar sair do dowhile se o valor for par
		
		
		/*
		for(int i =0; i<10;i++) {
			System.out.println("Teste " + i);
		}
		
		int x =0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		
		int y =0;
		do {
			System.out.println("Teste2 "+y);
			y++;
		}
		while(y<10);
		*/
	}

}

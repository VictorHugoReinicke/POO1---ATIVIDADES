import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int[] data = new int[3];
		boolean valido = true;
		System.out.println("Digite a data dd/mm/aaaa");
		String text = inp.nextLine();
		
		String[] dataTexto = text.split("/");
		
		
		for(int i =0; i< dataTexto.length;i++) {
			
			data[i] = Integer.parseInt(dataTexto[i]);
			
		}
		
		if (data[2] < 1 || data[2]> 9999) {
            System.out.println("Ano inválido.");
            valido = false;
        }

        
        if (data[1] < 1 || data[1] > 12) {
            System.out.println("Mês inválido.");
            valido = false;
        }

        
        if (valido) {
            int[] diasNoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

           
            if ((data[2] % 4 == 0 && data[2] % 100 != 0) || (data[2] % 400 == 0)) {
                diasNoMes[2] = 29;
            }

            if (data[0] < 1 || data[0] > diasNoMes[data[1]]) {
                System.out.println("Dia inválido para o mês e ano fornecidos.");
                valido = false;
            }
        }

        
        if (valido) {
            System.out.println("Data válida.");
            System.out.println("Vetor de inteiros: [" + data[0] + ", " + data[1] + ", " + data[2] + "]");
        }
        else
        	System.out.println("Errado");
		
        inp.close();
		
		

	}

}

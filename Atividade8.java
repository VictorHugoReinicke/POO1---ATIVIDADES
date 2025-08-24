import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        char[] alfabeto = new char[26];
        char[] vogais = new char[5];
        char[] consoantes = new char[21];
        
        
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('a' + i);
        }
        
        vogais[0] = 'a';
        vogais[1] = 'e';
        vogais[2] = 'i';
        vogais[3] = 'o';
        vogais[4] = 'u';
        
        int indiceConsoante = 0;
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                consoantes[indiceConsoante] = letra;
                indiceConsoante++;
            }
        }

        System.out.println("Digite o tamanho da senha (menor que " + alfabeto.length + "):");
        int tamanhoDesejado = input.nextInt();
        input.close();

       
        if (tamanhoDesejado <= 0 || tamanhoDesejado > alfabeto.length) {
            System.out.println("Tamanho de senha inválido. Por favor, insira um valor válido.");
            return;
        }

       
        char[] senha = new char[tamanhoDesejado];
        int indiceSenha = 0;

       
        long semente = System.currentTimeMillis();

       
        for (int i = 0; i < tamanhoDesejado / 2; i++) {
       
            int indiceConsoanteAleatorio = (int) ((semente + i) % consoantes.length);
            int indiceVogalAleatorio = (int) ((semente + i) % vogais.length);

            senha[indiceSenha] = consoantes[indiceConsoanteAleatorio];
            indiceSenha++;
            senha[indiceSenha] = vogais[indiceVogalAleatorio];
            indiceSenha++;
        }

        
        if (tamanhoDesejado % 2 != 0) {
            int indiceConsoanteFinal = (int) ((semente + (tamanhoDesejado / 2)) % consoantes.length);
            senha[indiceSenha] = consoantes[indiceConsoanteFinal];
        }

        
        System.out.print("Sua nova senha é: ");
        System.out.println(new String(senha));
    }
}
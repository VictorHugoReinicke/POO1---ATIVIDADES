
public class Atividade3 {

	private int valor1 = 0;
	private int valor2 = 1;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void apresentacao(int valor1, int valor2) {

		System.out.println("Soma: " + (valor1 + valor2));
		System.out.println("Subtração: " + (valor1 - valor2));
		System.out.println("Multiplicação: " + (valor1 * valor2));
		System.out.println("Divisão: " + ((double) valor1 / valor2));

	}

}

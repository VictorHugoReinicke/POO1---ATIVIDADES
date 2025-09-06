
public class Atividade2 {

	private int valor_inicio = 0;
	private int valor_final = 1;

	public int getValor_inicio() {
		return valor_inicio;
	}

	public void setValor_inicio(int valor_inicio) {
		this.valor_inicio = valor_inicio;
	}

	public int getValor_final() {
		return valor_final;
	}

	public void setValor_final(int valor_final) {
		this.valor_final = valor_final;
	}

	public void apresentacao(int inicio, int Vfinal) {

		if (Vfinal < inicio) {
			int c = Vfinal;
			Vfinal = inicio;
			inicio = c;
			System.out.println("Invertendo.");
		}
		System.out.println("Os valores de intervalo inteiro são: ");
		for (int i = inicio + 1; i < Vfinal; i++)
			System.out.println(i);

	}

}

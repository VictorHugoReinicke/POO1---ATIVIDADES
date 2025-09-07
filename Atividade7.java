
public class Atividade7 {

	private String nome = "";
	private int idade = 0;
	private double peso = 0;
	private double altura = 0;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public void envelhecer() {
		idade++;

		if (idade <= 20) {
			crescer(0.5);
		}
	}

	public void engordar(double quilos) {
		peso += quilos;
	}

	public void emagrecer(double quilos) {

		if (peso - quilos >= 0) {
			peso -= quilos;
		} else {
			peso = 0;
		}
	}

	public void crescer(double centimetros) {
		altura += (centimetros / 100);
	}

	public void apresentacao() {
		System.out.println("--- Dados da Pessoa ---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
		System.out.printf("Peso: %.2f kg\n", peso);
		System.out.printf("Altura: %.2f m\n", altura);
	}

}

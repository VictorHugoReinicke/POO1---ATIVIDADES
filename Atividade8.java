
public class Atividade8 {

	private int numeroConta;
	private String nome;
	private double saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private boolean validarNome(String nome) {
		return nome != null && !nome.trim().isEmpty();
	}

	private boolean validarValor(double valor) {
		return valor > 0;
	}

	public void alterarNome(String novoNome) {
		if (validarNome(novoNome)) {
			nome = novoNome;
			System.out.println("Nome alterado para: " + nome);
		} else {
			System.out.println("Erro: Nome inválido. A alteração não foi realizada.");
		}
	}

	public void depositar(double valor) {
		if (validarValor(valor)) {
			saldo += valor;
			System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
		} else {
			System.out.println("Erro: O valor do depósito deve ser maior que zero.");
		}
	}

	public void sacar(double valor) {
		if (!validarValor(valor)) {
			System.out.println("Erro: O valor do saque deve ser maior que zero.");
			return;
		}

		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
		} else {
			System.out.println("Erro: Saldo insuficiente.");
		}
	}

	public void exibirSaldo() {
		System.out.printf("Saldo atual da conta %d de %s: R$ %.2f\n", this.numeroConta, this.nome, this.saldo);
	}

}

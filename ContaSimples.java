
public class ContaSimples extends ContaBancaria {

	private double saldoPoupanca;

	public ContaSimples(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa corretista,
			double saldoPoupanca) {
		super(banco, agencia, numeroDaConta, saldo, corretista);
		this.saldoPoupanca = saldoPoupanca;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		if (valor == 1)
			return true;
		return false;
	}

	public boolean saquePoupanca(double valor) {
		if (valor == 1)
			return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}

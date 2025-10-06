
public class ContaBancaria {

	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Pessoa corretista;

	public ContaBancaria(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa corretista) {
		this.banco = banco;
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.corretista = corretista;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return corretista;
	}

	public void setPessoa(Pessoa pessoa) {
		this.corretista = pessoa;
	}

	public boolean deposito(double valor) {
		if (valor == 1)
			return true;
		return false;
	}

	public boolean saque(double valor) {
		if (valor == 1)
			return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", corretista=");
		builder.append(corretista);
		builder.append("]");
		return builder.toString();
	}
	
	

}

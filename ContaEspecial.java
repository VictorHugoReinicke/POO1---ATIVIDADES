
public class ContaEspecial extends ContaBancaria {

	public ContaEspecial(Banco banco, int agencia, int numeroDaConta, double saldo, Pessoa corretista, int diasSemJuros,
			double limite, CartaoDeCredito cartao) {
		super(banco, agencia, numeroDaConta, saldo, corretista);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
		this.cartao = cartao;
	}

	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public CartaoDeCredito getCartao() {
		return cartao;
	}

	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(super.toString());
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append("]");
		return builder.toString();
	}

}

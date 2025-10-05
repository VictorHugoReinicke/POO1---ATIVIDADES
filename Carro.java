
public class Carro {

	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa dono;
	protected Motor motor;

	public Carro(String fabricante, String modelo, String cor, int ano, Pessoa dono, Motor motor) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.dono = dono;
		this.motor = motor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor marca) {
		this.motor = marca;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [fabricante=");
		builder.append(fabricante);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", ano=");
		builder.append(ano);
		builder.append(", dono=");
		builder.append(dono);
		builder.append(", motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

}


public class SistemaDeSom extends EquipamentoEletronico {

	private String marca;
	private String modelo;
	private float potencia;

	public SistemaDeSom(float tensao, float consumo, String marca, String modelo, float potencia) {
		super(tensao, consumo);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("SistemaDeSom ");
		builder.append(super.toString());
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", potencia=");
		builder.append(potencia);
		builder.append("]");
		return builder.toString();
	}

}

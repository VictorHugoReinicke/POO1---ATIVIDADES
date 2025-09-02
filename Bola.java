
public class Bola {

	String cor;
	float circunferencia;
	String material;
	
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCircunferencia(float circunferencia) {
		this.circunferencia = circunferencia;
	}
	
	public float getCircunferencia() {
		return circunferencia;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	// CLASSE NÃO PODE TER ENTRADA E SAÍDA DE DADOS
	public String getMaterial() {
		return material;
	}
}

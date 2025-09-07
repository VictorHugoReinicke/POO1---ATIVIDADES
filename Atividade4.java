
public class Atividade4 {

	double salario;
	float horas;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public float getHoras() {
		return horas;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}

	public double salaBruto() {

		return (salario * horas);

	}

	public double inss() {

		return (salaBruto()* 0.08);

	}

	public double ir() {

		return (salaBruto() * 0.11);

	}

	public double sindicato() {

		return (salaBruto() * 0.05);

	}

	public double salaLiquido() {
		
		return (salaBruto()-sindicato() - ir() - inss());

	}
	
	public void apresentacao() {
		System.out.println("+ Salário Bruto: " + salaBruto());
		System.out.println("-IR (11%): " + ir());
		System.out.println("-INSS (8%): " + inss());
		System.out.println("-Sindicato: " + sindicato());		
		System.out.println("= Salário Líquido: " + salaLiquido());
	}

}

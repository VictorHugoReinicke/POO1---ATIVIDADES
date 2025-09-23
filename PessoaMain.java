
public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Curvello", "Casa da sua tia");	
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Victor", "PQP");
		pf.setCpf("115.984.729-09");
		pf.setEstadoCivil("Solteiro");
		System.out.println(pf);

		PessoaJuridica pj = new PessoaJuridica("Victor", "Zinco");
		pj.setCnpj("123.123.123.10/0001");
		pj.setTipoEmpresa("Super maneira");
		System.out.println(pj);
		
	}

}

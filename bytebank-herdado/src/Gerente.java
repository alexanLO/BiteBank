//gerente é um funcionario, gerente herda da class funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.Autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return 50;
	}




	/*INTERFACE
	private int senha;
	
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o metódo de bonificação do GERENTE");
		return super.getSalario();
	}
	
	*/
}
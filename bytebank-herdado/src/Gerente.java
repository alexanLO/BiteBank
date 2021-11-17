//gerente é um funcionario, gerente herda da class funcionario
public class Gerente extends Funcionario implements Autenticavel {

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

}
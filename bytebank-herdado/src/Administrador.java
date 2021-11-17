public class Administrador extends Funcionario implements Autenticavel{

		//COMPOSIÇÃO

		private AutenticacaoUtil autenticador;

		public Administrador() {
	
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
			return 0;
		}
		

	/* INTERFACE
    private int senha;



    @Override
    public double getBonificacao() {
        
        return 50;
    }

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
*/
}

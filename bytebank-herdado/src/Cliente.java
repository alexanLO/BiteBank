public class Cliente implements Autenticavel {

//COMPOSIÇÃO

    private AutenticacaoUtil autenticador;

    public Cliente() {

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

    


    /*  INTERFACE
    private int senha;
    @Override
    public void setSenha(int senha) {
       
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
       
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    */
}

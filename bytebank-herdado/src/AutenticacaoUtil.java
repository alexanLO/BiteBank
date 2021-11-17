public class AutenticacaoUtil {
    
private int senha;

public void setSenha(int Senha){
    this.senha = Senha;
}

public boolean Autentica(int Senha) {
    if(this.senha == Senha) {
        return true;
    } else {
        return false;
    }
}


}

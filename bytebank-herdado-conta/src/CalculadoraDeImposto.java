public class CalculadoraDeImposto {

    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorDeImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}

package Projeto_03_07.Conta_Corrente_Poupanca;

public class ContaCorrente extends Conta{

    private float limite;

    ContaCorrente(String titular, String senha, float limite){
        super(titular, senha);
        this.limite = limite;
    }

    public boolean sacar(float valor){
        if(valor <= saldo && valor <= limite){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return String.format("O saldo da conta é R$%.2f", saldo);
    }

}

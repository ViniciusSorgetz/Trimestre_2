package Projeto_12_06.Contas;

public class Conta {
    String titular;
    String identificador;
    float saldo;
    void depositar(float valor){
        saldo+valor;
    }
    boolean sacar(float valor){
        if(valor <= saldo){
            return true;
        }
        return false;
    }
    String mostrarSaldo(){
        return "Saldo atual: R$" + String.format("%.2f", saldo);
    }
}

package Projeto_12_06.Contas;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;

    public Conta(String titular, float saldo, String senha){
        this.identificador = String.valueOf(new Random().nextInt(1000, 10000));
        this.titular = titular;
        this.saldo = saldo;
        this.senha = senha;
    }

    void depositar(float valor){
        saldo += valor;
    }
    boolean sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
    String mostrarSaldo(){
        return "Saldo atual: R$" + String.format("%.2f", saldo);
    }
}

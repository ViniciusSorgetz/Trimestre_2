package Projeto_03_07.Conta_Corrente_Poupanca;

public class Principal {
    public static void main(String[] args){

        ContaCorrente cc1 = new ContaCorrente("Pedro", "9090", 12000);
        cc1.verificaSaldo();
        cc1.depositar(5000);
        System.out.println(cc1.verificaSaldo());
        cc1.sacar(2500);
        System.out.println(cc1.verificaSaldo());
        System.out.println(cc1.validaAcesso(cc1.getIdentificador(), "9090"));

        ContaPoupanca cp1 = new ContaPoupanca("John", "1280", 2000);
        System.out.println(cp1.verificaSaldo());
        if(cp1.sacar(3000)){
            System.out.println("Saque realizado.");
        }
        else{
            System.out.println("Saque inválido.");
        }
        cp1.sacar(500);
        System.out.println(cp1.verificaSaldo());
        System.out.println(cp1.validaAcesso(cp1.getIdentificador(), "1280"));
    }
}

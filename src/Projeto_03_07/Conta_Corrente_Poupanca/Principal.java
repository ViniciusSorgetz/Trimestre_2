package Projeto_03_07.Conta_Corrente_Poupanca;

import java.util.Scanner;

public class Principal {

    static boolean logado = false;

    static Scanner ler = new Scanner(System.in);

    static ContaCorrente[] ContasCorrente = new ContaCorrente[20];
    static int contCC = 0;
    static ContaPoupanca[] ContasPoupanca = new ContaPoupanca[20];
    static int contCP = 0;

    static ContaCorrente CCLogada = new ContaCorrente();
    static ContaPoupanca CPLogada = new ContaPoupanca();

    static String tipoConta = "";

    static String[] pegarTitularSenha(){
        System.out.print("Digite o titular: ");
        String titular = ler.next();
        System.out.print("Digite sua senha: ");
        String senha = ler.next();
        String[] resp = {titular, senha};
        return resp;
    }

    static void criarConta(){
        char escolha = '0';
        do{
            System.out.println("+--------------------------+");
            System.out.println("|        CRIAR CONTA       |");
            System.out.println("+--------------------------+");
            System.out.println("| 1 - Conta Corrente       |");
            System.out.println("| 2 - Conta Poupanca       |");
            System.out.println("| 3 - Cancelar             |");
            System.out.println("+--------------------------+");
            System.out.print("Sua escolha: ");
            escolha = ler.next().charAt(0);
        }while(escolha != '1' && escolha != '2' && escolha != '3'  && escolha != '4');
        switch(escolha){
            case '1' ->{
                String[] resp = pegarTitularSenha();
                System.out.print("Digite seu limite: ");
                float limite = ler.nextFloat();
                ContaCorrente cc1 = new ContaCorrente(resp[0], resp[1], limite);
                System.out.println("Seu identificador é: " + cc1.getIdentificador());
                ContasCorrente[contCC] = cc1;
                contCC++;
            }
            case '2' ->{
                String[] resp = pegarTitularSenha();
                System.out.print("Digite seu depósito: ");
                float deposito = ler.nextFloat();
                ContaPoupanca cp1 = new ContaPoupanca(resp[0], resp[1], deposito);
                System.out.println("Seu identificador é: " + cp1.getIdentificador());
                ContasPoupanca[contCP] = cp1;
                contCP++;
            }
            case '3' ->{
                return;
            }
            default -> {
                System.out.println("ERRO");
            }
        }
    }

    static void listarUsuarios(){
        if(contCC == 0 && contCP == 0){
            System.out.println("Ainda não há nenhuma conta.");
            return;
        }
        if(contCC > 0){
            System.out.println("+--------------------------+");
            System.out.println("|     Contas Corrente      |");
            System.out.println("+--------------------------+");
            for(int i=0; i<contCC; i++){
                System.out.println("| Titular: " + ContasCorrente[i].getTitular() + " |" +
                        " " + "Identificador: " + ContasCorrente[i].getIdentificador() +
                        " |");
            }
        }
        if(contCP > 0){
            System.out.println("+--------------------------+");
            System.out.println("|    Contas Poupança       |");
            System.out.println("+--------------------------+");
            for(int i=0; i<contCP; i++){
                System.out.println("| Titular: " + ContasCorrente[i].getTitular() + " |" +
                        " " + "Identificador: " + ContasCorrente[i].getIdentificador() +
                        " |");
            }
        }
    }

    static boolean entrar(){
        System.out.println("+--------------------------+");
        System.out.println("|          Entrar          |");
        System.out.println("+--------------------------+");
        System.out.print("Insira o identificador da sua conta: ");
        String identificador = ler.next();
        System.out.print("Insira a senha da sua conta: ");
        String senha = ler.next();
        for(int i=0; i<contCC; i++){
            if(ContasCorrente[i].validaAcesso(identificador, senha)){
                CCLogada = ContasCorrente[i];
                tipoConta = "CC";
                return true;
            }
        }
        for(int i=0; i<contCP; i++){
            if(ContasPoupanca[i].validaAcesso(identificador, senha)){
                CPLogada = ContasPoupanca[i];
                tipoConta = "CP";
                return true;
            }
        }
        return false;
    }

    static void sacar(){
        System.out.println("+--------------------------+");
        System.out.println("|          Saque           |");
        System.out.println("+--------------------------+");
        System.out.print("Digite o valor a ser sacado: ");
        float valor = ler.nextFloat();
        if(tipoConta.equals("CC")){
            if(CCLogada.sacar(valor)){
                System.out.println("Valor inválido.");
            }
            else{
                System.out.println("Valor de R$" + String.format("%.2f", valor) + " " +
                        "sacado.");
            }
        }
        else if(tipoConta.equals("CP")){
            if(CPLogada.sacar(valor)){
                System.out.println("Valor inválido.");
            }
            else{
                System.out.println("Valor de R$" + String.format("%.2f", valor) + " " +
                        "sacado.");
            }
        }
    }

    static void depositar(){

    }

    public static void main(String[] args){

        char escolha = '0';

        do{
            if(logado){
                do{
                    System.out.println("+--------------------------+");
                    System.out.println("|     SISTEMA BANCARIO     |");
                    System.out.println("+--------------------------+");
                    System.out.println("|                          |");
                    System.out.println("+--------------------------+");
                    System.out.println("| 1 - Sair                 |");
                    System.out.println("| 2 - Sacar                |");
                    System.out.println("| 3 - Depositar            |");
                    System.out.println("| S - Fechar               |");
                    System.out.println("+--------------------------+");
                    System.out.print("Sua escolha: ");
                    escolha = ler.next().charAt(0);
                }while(escolha != '1' && escolha != '2' && escolha != '3' && escolha != 'S');

                switch(escolha){
                    case '1' -> {
                        logado = false;
                    }
                    case '2' -> {
                        sacar();
                    }
                    case '3' -> {
                        depositar();
                    }
                    case '4' -> {
                        return;
                    }
                    default -> {
                        throw new Error("Opção inválida: " + escolha);
                    }
                }
            }
            else{
                do{
                    System.out.println("+--------------------------+");
                    System.out.println("|     SISTEMA BANCARIO     |");
                    System.out.println("+--------------------------+");
                    System.out.println("| 1 - Entrar               |");
                    System.out.println("| 2 - Criar Conta          |");
                    System.out.println("| 3 - Listar Usuários      |");
                    System.out.println("| 4 - Fechar               |");
                    System.out.println("+--------------------------+");
                    System.out.print("Sua escolha: ");
                    escolha = ler.next().charAt(0);
                }while(escolha != '1' && escolha != '2' && escolha != '3' && escolha != 'S');

                switch(escolha){
                    case '1' -> {
                        logado = entrar();
                    }
                    case '2' -> {
                        criarConta();
                    }
                    case '3' -> {
                        listarUsuarios();
                    }
                    case '4' -> {
                        return;
                    }
                    default -> {
                        throw new Error("Opção inválida: " + escolha);
                    }
                }
            }

        }while(escolha != 'S');
    }
}

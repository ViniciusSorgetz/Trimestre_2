package Projeto_12_06.Contas;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Main {

    static Scanner ler = new Scanner(System.in);
    static Conta contas[] = new Conta[20];
    static int contasQuntidade = 0;

    public static void cadastro(){
        System.out.println("---- CRIAR CONTA ----");
        System.out.print("Titular: ");
        String titular = ler.next();
        System.out.print("Saldo: ");
        float saldo = ler.nextFloat();
        System.out.print("Senha: ");
        String senha = ler.next();
        Conta conta = new Conta(titular, saldo, senha);
        contas[contasQuntidade] = conta;
        mostrarConta(conta, true);
        contasQuntidade++;
    }

    public static void listar(){
        for(int i=0; i<contasQuntidade; i++){
            mostrarConta(contas[i], false);
        }
    }

    public static void mostrarConta(Conta conta, boolean mostrarSenha){
        System.out.println("---------------------");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: " + String.format("R$%.2f", conta.saldo));
        System.out.println("Indentificador: " + conta.identificador);
        if(mostrarSenha)
            System.out.println("Senha: " + conta.senha);
    }

    public static void depositar(){
        int posicao = acessar();
        if(posicao == -1){
            System.out.println("Dados inválidos.");
            return;
        }
        System.out.print("Digite o valor a ser depositado: ");
        float valor = ler.nextFloat();
        Conta conta = contas[posicao];
        conta.depositar(valor);
        System.out.println("Valor de " + String.format("%.2f", valor) + " depositado.");
        contas[posicao] = conta;
    }

    public  static void sacar(){
        int posicao = acessar();
        if(posicao == -1){
            System.out.println("Dados inválidos.");
            return;
        }
        System.out.print("Digite o valor a ser sacado: ");
        float valor = ler.nextFloat();
        Conta conta = contas[posicao];
        if(conta.sacar(valor)){
            System.out.println("Valor de " + String.format("%.2f", valor) + " sacado.");
            contas[posicao] = conta;
            return;
        }
        else{
            System.out.println("Valor inválido para o saque");
        }
    }

    public static int acessar(){
        System.out.print("Identificador: ");
        String identificador = ler.next();
        System.out.print("Senha: ");
        String senha = ler.next();
        int posicao = -1;
        for(int i=0; i<contasQuntidade;i++){
            if(contas[i].senha.equals(senha) && contas[i].identificador.equals(identificador))
                posicao = i;
        }
        return posicao;
    }

    public static void main(String[] args){
        boolean rodando = true;
        do{
            System.out.println("---------------------");
            System.out.println("-------CONTAS--------");
            System.out.println("---------------------");
            System.out.println("1 - cadastrar conta");
            System.out.println("2 - listar");
            System.out.println("3 - depositar");
            System.out.println("4 - sacar");
            System.out.println("5 - sair");
            System.out.print("Escolha: ");
            char escolha = toLowerCase(ler.next().charAt(0));
            if(escolha == '5')
                rodando = false;
            else{
                switch(escolha){
                    case '1':
                        cadastro();
                        break;
                    case '2':
                        listar();
                        break;
                    case '3':
                        depositar();
                        break;
                    case '4':
                        sacar();
                        break;
                    default:
                        System.out.println("Escolha inválida");
                }
            }
        }while(rodando);
    }
}

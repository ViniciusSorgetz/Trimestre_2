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
            mostrarConta(contas[i]);
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

    }

    public  static void sacar(){

    }

    public static void acessar(){
        System.out.print("Identificador: ");
        String identificador = ler.next();
        System.out.print("Senha: ");
        String senha = ler.next();
        Conta conta;
        for(int i=0; i<contasQuntidade; i++) {
            if (contas[i].identificador.equals(identificador)) ;
            conta = contas[i];
        }
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

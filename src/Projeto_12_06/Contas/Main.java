package Projeto_12_06.Contas;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("-----CONTAS-----");
        System.out.println("----------------");

        Conta c1 = new Conta();

        System.out.print("Nome: ");
        c1.titular = ler.next();

        System.out.print("Saldo: ");
        c1.saldo = ler.nextFloat();

        int identificador = new Random().nextInt(1000, 100000);
        c1.identificador = String.valueOf(identificador);

        System.out.println("----------------");
        System.out.println("--CONTA-CRIADA--");
        System.out.println("Nome: " + c1.titular);
        System.out.printf("Saldo: R$%.2f\n", c1.saldo);
        System.out.println("Identificador: #" + c1.identificador);
    }
}

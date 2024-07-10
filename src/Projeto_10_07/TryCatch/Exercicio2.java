package Projeto_10_07.TryCatch;

import java.util.Scanner;

public class Exercicio2 {

    static public int lerNum(String frase){

        Scanner ler = new Scanner(System.in);
        boolean correto = false;
        int num;

        do{
            try{
                System.out.print(frase + ": ");
                num = ler.nextInt();
                correto = true;
                return num;
            }
            catch(Exception error){
                ler.next();
                System.out.println("Algo deu errado.");
            }

        }while(!correto);

        return -1;
    }

    public static void main(String[] args){
        int num1 = lerNum("Digite um número");
        int num2 = lerNum("Digite outro número");
        System.out.println("Soma: " + (num1 + num2));
    }
}

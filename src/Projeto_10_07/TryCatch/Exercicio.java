package Projeto_10_07.TryCatch;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        boolean correto = false;

        do{
            try{
                System.out.print("Digite um número: ");
                int num1 = ler.nextInt();
                System.out.print("Digite outro número: ");
                int num2 = ler.nextInt();
                correto = true;
            }
            catch(Exception error){
                ler.next();
                System.out.println("Algo deu errado.");
            }

        }while(!correto);

    }
}

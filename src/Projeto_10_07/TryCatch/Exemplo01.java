package Projeto_10_07.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        try{
            System.out.print("Digite um número: ");
            int num1 = ler.nextInt();
            System.out.print("Digite outro número: ");
            int num2 = ler.nextInt();
            System.out.println("Resultado: " + (num1 / num2));
        }
        catch(InputMismatchException error){
            System.out.println("Os valores precisam ser números.");
        }
        catch(ArithmeticException error){
            System.out.println("Não é possível dividir por zero.");
        }
        finally {
            System.out.println("Sempre é executado");
        }

    }
}

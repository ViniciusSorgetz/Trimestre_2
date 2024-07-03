package Projeto_19_06.Contas;

public class Teste {

   public static void main(String[] args){
       Conta c1 = new Conta("Joao", 800, "123");
       Conta c2 = new Conta("Otavio", 1200, "123");

       c1.nomeBanco = "Banco Cimol";

       System.out.println("Nome do banco de c1: " + c1.nomeBanco);
       System.out.println("Nome do banco de c2: " + c2.nomeBanco);

       Conta.nomeBanco = "Cimol's Bank";

       System.out.println("Nome do banco de c1: " + c1.nomeBanco);
       System.out.println("Nome do banco de c2: " + c2.nomeBanco);
   }
}

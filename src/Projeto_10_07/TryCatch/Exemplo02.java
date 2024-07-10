package Projeto_10_07.TryCatch;

public class Exemplo02 {

    static public int divide(int num1, int num2) throws ArithmeticException{
        if(num2 == 0)
            throw new ArithmeticException("Não é possível dividir por zero.");
        return num1 / num2;
    }

    public static void main(String[] args){
        int divisao;
        try{
            divisao = divide(8, 0);
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
}

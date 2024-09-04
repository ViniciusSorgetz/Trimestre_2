package Projeto_04_09.Exemplo_Abstract;

public class Main {
    public static void main(String[] args) {

        Circulo c1 =  new Circulo();
        c1.setRaio(15);
        c1.setNomeFigura("Círulo01");
        System.out.println(c1.toString());;
        System.out.println("----------------------");
        Retangulo r1 = new Retangulo();
        r1.setBase(8);
        r1.setAltura(14);
        r1.setNomeFigura("Retangulo01");
        System.out.println(r1.toString());
    }
}

package Projeto_04_09.Exemplo_Abstract;

public class Main2 {
    // Para criar uma instância de uma interface, preciso usar o construtor de uma
    // classe que a implemente. Desta forma estarão disponíveis na instâmcia criada
    // apenas os métodos comuns a interface e a classe, com o comportamento
    // implementado na classe.
    public static void main(String[] args){
        Vetor v1 = new Vetor(8);
        v1.adiciona("Ice");
        v1.adiciona("Fire");
        v1.adiciona("Water");
        System.out.println(v1);
        v1.remove();
        System.out.println(v1);
    }
}

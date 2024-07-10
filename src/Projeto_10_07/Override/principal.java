package Projeto_10_07.Override;

public class principal {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        System.out.println(p1.obterDados());

        Aluno a1 = new Aluno();
        a1.setNome("Oliver");
        a1.setSobrenome("Tree");
        a1.setMatricula("ZR3");
        System.out.println(a1.obterDados());

    }
}

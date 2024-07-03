package Projeto_03_07.Heranca;

public class Motorista extends Funcionario{

    private String cnh;

    public Motorista(String nome, String sobrenome, float salario, String cnh){
        super(nome, sobrenome, salario);
        this.cnh = cnh;
    }

    public String getCnh(){
        return cnh;
    }

    public void setCnh(String cnh){
        this.cnh = cnh;
    }
}

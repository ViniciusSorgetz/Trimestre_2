package Projeto_03_07.Heranca;

public class Engenheiro extends Funcionario{
    
    private String crea;
    
    public Engenheiro(String nome, String sobrenome, float salario, String crea){
        super(nome, sobrenome, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}

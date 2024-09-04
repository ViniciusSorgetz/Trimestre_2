package Projeto_04_09.Sistema_Pagamento;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, int horasTrabalhadas, double salarioHora){
        this.nome = nome;
        this.salarioBase = calcularSalario(horasTrabalhadas, salarioHora);
    }

    public abstract double calcularSalario();

    public abstract double calcularSalario(int horasTrabalhadas, double salarioHora);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

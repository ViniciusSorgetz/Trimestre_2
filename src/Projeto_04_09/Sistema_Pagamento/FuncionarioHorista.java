package Projeto_04_09.Sistema_Pagamento;

public class FuncionarioHorista extends Funcionario implements Pagamento{

    public FuncionarioHorista(String nome, int horasTrabalhadas, double salarioHora) {
        super(nome, horasTrabalhadas, salarioHora);
    }

    @Override
    public double calcularSalario(int horasTrabalhadas, double salarioHora) {
        return 0;
    }

    @Override
    public String processarPagamento() {
        return null;
    }
}

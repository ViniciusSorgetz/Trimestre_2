package Projeto_04_09.Sistema_Pagamento;

public class FuncionarioMensalista extends Funcionario implements Pagamento{

    public FuncionarioMensalista(String nome, int horasTrabalhadas, double salarioHora) {
        super(nome, horasTrabalhadas, salarioHora);
    }

    @Overrid
    public double calcularSalario() {
        return 0;
    }

    @Override
    public String processarPagamento() {
        return null;
    }

    @Override
    public double calcularSalario(int horasTrabalhadas, double salarioHora) {
        return 0;
    }
}

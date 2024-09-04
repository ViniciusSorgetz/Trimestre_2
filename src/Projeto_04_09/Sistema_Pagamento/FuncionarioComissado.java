package Projeto_04_09.Sistema_Pagamento;

public class FuncionarioComissado extends Funcionario implements Pagamento{

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public String processarPagamento() {
        return "Pagamento de $" + String.format("%.2f", getSalarioBase()) + " para o " +
                "funcionário " + getNome();
    }
}

package Projeto_04_09.Exemplo_Abstract;

public abstract class Figura {

    private String nomeFigura;

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public abstract double calculaArea();
    public abstract  double calculaPerimetro();

    @Override
    public String toString(){
        String retorno = "Nome: " + nomeFigura;
        retorno += "\nÁrea: " + String.format("%.2f", calculaArea());
        retorno += "\nPerímetro: " + String.format("%.2f", calculaPerimetro());
        return retorno;
    }
}

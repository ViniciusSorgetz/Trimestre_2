package Projeto_04_09.Exemplo_Abstract;

public class Retangulo extends Figura{

    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return altura * base;
    }

    @Override
    public double calculaPerimetro() {
        return (altura + base) * 2;
    }
}

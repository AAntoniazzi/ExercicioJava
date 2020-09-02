package Geometria;

public class Circulo extends Forma {
    protected double raio;

    public Circulo() {
        super();
    }

    public Circulo(double raio) {
        super();
        this.setRaio(raio);
    }

    public Circulo(double raio, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.setRaio(raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor=" + cor +
                ", preenchido" + preenchido +
                '}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        double pi = 3.1416;
        return pi * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        double pi = 3.1416;
        return 2 * pi * raio;
    }
}

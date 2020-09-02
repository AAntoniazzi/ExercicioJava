package Geometria;

public class Retangulo extends Forma {
    protected double base;
    protected double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(double base, double altura) {
        super();
        this.setBase(base);
        this.setAltura(altura);
    }

    public Retangulo(double base, double altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.setBase(base);
        this.setAltura(altura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", cor=" + cor +
                ", preenchido=" + preenchido +
                '}';
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

package Geometria;

public class Retangulo extends Forma {
    protected float base;
    protected float altura;

    public Retangulo(float base, float altura) {
        super();
        this.setBase(base);
        this.setAltura(altura);
    }

    public Retangulo(float base, float altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.setBase(base);
        this.setAltura(altura);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}

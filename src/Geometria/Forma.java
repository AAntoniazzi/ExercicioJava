package Geometria;

public abstract class Forma {
    protected String cor;
    protected boolean preenchido;

    public Forma() {
    }

    public Forma(String cor, boolean preenchido) {
        this.setCor(cor);
        this.setPreenchido(preenchido);
    }

    @Override
    public String toString() {
        return "Forma{" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                '}';
    }

    public double getArea() {
        return 0;
    }

    public double getPerimetro() {
        return 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
}

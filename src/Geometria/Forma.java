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

    public void getArea() {
    }

    public void getPerimetro() {
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

package Geometria;

public class Quadrado extends Retangulo {
    public Quadrado() {
        super();
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(double lado, String cor, boolean preenchido) {
        super(lado, lado, cor, preenchido);
    }

    public double getLado() {
        return super.getAltura();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

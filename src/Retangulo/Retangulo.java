package Retangulo;

public class Retangulo {
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) {
        if (largura == 0 || comprimento == 0){
            System.out.println("Um dos lados do retângulo é igual ou menor que zero.");
        } else {
            this.setComprimento(comprimento);
            this.setLargura(largura);

            System.out.println("AREA: " + this.calculaArea());
            System.out.println("PERIMETRO:" + this.calculaPerimetro());
        }
    }

    public float calculaPerimetro() {
        float comprimento = this.getComprimento() * 2;
        float largura = this.getLargura() * 2;

        return comprimento + largura;
    }

    public float calculaArea() {
        float comprimento = this.getComprimento();
        float largura = this.getLargura();

        return comprimento * largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
}

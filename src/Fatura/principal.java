package Fatura;

public class principal {
    public static void main(String[] args) {
        int qt = Integer.parseInt(args[2]);
        float preco = Float.parseFloat(args[3]);

        Fatura fatura1 = new Fatura(qt, preco, args[2], args[3]);
        fatura1.imprime();
    }
}

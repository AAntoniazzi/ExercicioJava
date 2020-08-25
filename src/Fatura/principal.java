package Fatura;

public class principal {
    public static void main(String[] args) {
        int qt = Integer.parseInt(args[0]);
        float preco = Float.parseFloat(args[1]);
        //quantidade, preco, codigo, descricao ex: 2, 7, L22, lapis
        Fatura fatura1 = new Fatura(qt, preco, args[2], args[3]);
        fatura1.imprime();
    }
}

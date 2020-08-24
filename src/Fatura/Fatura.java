package Fatura;

public class Fatura {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Insira quatro argumentos, Codigo, produto, quantidade, valor");
        } else {
            int qt = Integer.parseInt(args[2]);
            float valor = Float.parseFloat(args[3]);
            float total = qt * valor;

            System.out.println("CODIGO: " + args[0]);
            System.out.println("DESCRICAO: " + args[1]);
            System.out.println("TOTAL: " + total);
        }
    }
}

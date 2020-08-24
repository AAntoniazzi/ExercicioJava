package Calculadora;

public class Calculadora {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Insira dois numeros");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            System.out.println("SOMA: " + (num1 + num2));
            System.out.println("PRODUTO: " + (num1 * num2));
            System.out.println("DIFERENCA: " + (num1 - num2));
            System.out.println("DIVISAO: " + (Float.parseFloat(args[0]) / Float.parseFloat(args[1])));
            int maior = num1 > num2 ? num1 : num2;
            System.out.println("MAIOR NUMERO: " + maior);
        }
    }
}

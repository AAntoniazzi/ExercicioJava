package PopulacaoMundial;

public class PopulacaoMundial {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Insira um numero");
        } else {
            long teste = 7444333222L;
            int calculator = Integer.parseInt(args[0]);
            System.out.println((calculator * 3500) + teste);
        }
    }
}

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quanto você tem para gastar com doces? ");
            
            mesada = scanner.nextDouble();
        }
        int doce = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de valor " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;

            System.out.println("Mesada: " + mesada);            
          doce++;
            System.out.println("Joãozinho comprou " + doce + " doces.");
        }        
        
        System.out.println("Joãozinho gastou toda sua mesada em doces.");
    }

    private static Double valorAleatorio() {
        //return ThreadLocalRandom.current().nextDouble(2, 8);
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}

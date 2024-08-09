import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int doce = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de valor " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;

            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou toda sua mesada em doces.");
          doce++;
            System.out.println("Joãozinho comprou " + doce + " doces.");
        }        
    }

    private static Double valorAleatorio() {
        //return ThreadLocalRandom.current().nextDouble(2, 8);
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }

        System.out.println("Digite um valor para sacar: ");
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            valorSolicitado = scanner.nextDouble();
        } 
        
        //sempre uso chaves para colocar o bloco de códigos mesmo que possua apenas uma linha.
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
}

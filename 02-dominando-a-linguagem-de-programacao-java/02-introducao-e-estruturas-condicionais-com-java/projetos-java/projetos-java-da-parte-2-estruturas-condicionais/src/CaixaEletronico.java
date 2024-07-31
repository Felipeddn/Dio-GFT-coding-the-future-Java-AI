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

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }
        else (valorSolicitado > saldo){
            System.out.println("Valor insuficiente para saque");
        }

    }
}

import java.util.Locale;
import java.util.Scanner;

public class NewAboutMe {
    public static void main(String[] args){
        try (//criando o objeto scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Seu nome é " + nome + " " + sobrenome);
            System.out.println("Sua idade é " + idade + " anos.");
            System.out.println("A sua altura é " + altura + " centímetros.");
        }
    }
}

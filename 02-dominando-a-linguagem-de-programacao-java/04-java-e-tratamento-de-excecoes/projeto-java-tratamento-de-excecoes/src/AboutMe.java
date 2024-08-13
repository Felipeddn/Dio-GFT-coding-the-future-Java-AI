import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            // Que coisa doida, quando eu coloco meus dois sobrenomes ele me retorna a mensagem do método catch, sem mesmo dar a chance de eu escrever minha idade.
            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " centímetros");
            scanner.close();
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos.");

            //System.err.println("Os campos idade e altura precisam ser numéricos.");
        }
    }
}

import java.util.Scanner;

public class PlanoOperadora2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual plano você deseja?");
            String plano = scanner.next().toUpperCase();
            // a retirada do break permite um comportamento de hierarquia do switch/case, mas acho que o guanabara comentou algo sobre isso ser errado acredito.

            switch (plano) {
                case "T":
                    System.out.println("5GB de Youtube.");

                case "M":
                    System.out.println("Whats app e instagram grátis.");

                case "B":
                    System.out.println("100 minutos de ligação.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class SistemaMedida2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual o tamanho?");
            String sigla = scanner.next();
            sigla = sigla.toUpperCase();

            switch (sigla) {
                case "P":
                    System.out.println("PEQUENO");
                    break;

                case "M":
                    System.out.println("MÉDIO");
                    break;

                case "G":
                    System.out.println("GRANDE");
                    break;
            
                default:
                    System.out.println("INDETERMINADO");
                    break;
            }
        }
    }
}

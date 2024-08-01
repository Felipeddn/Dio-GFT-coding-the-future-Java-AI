import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual o tamanho? ");

            String sigla = "P";

            // Começou as frescuras de Java...
            // Para solucionar o problema do resultado voltar indeterminado para letras minúsculas devo usar

            //String sigla = scanner.next();
            // ao invés de usar 
            //String sigla = scanner.nextLine();
            //sigla = sigla.toUpperCase();

            if(sigla == "P")
                System.out.println("PEQUENO");
            else if(sigla == "M")
                System.out.println("MÉDIO");
            else if(sigla == "G")
                System.out.println("GRANDE");
            else
                System.out.println("INDETERMINADO");

            
                sigla = "M";

                if(sigla == "P")
                    System.out.println("PEQUENO");
                else if(sigla == "M")
                    System.out.println("MÉDIO");
                else if(sigla == "G")
                    System.out.println("GRANDE");
                else
                    System.out.println("INDETERMINADO");

                
            sigla = "G";

            if(sigla == "M")
                System.out.println("PEQUENO");
            else if(sigla == "M")
                System.out.println("MÉDIO");
            else if(sigla == "G")
                System.out.println("GRANDE");
            else
                System.out.println("INDETERMINADO");

            
            sigla = "A";
    
            if(sigla == "P")
                System.out.println("PEQUENO");
            else if(sigla == "M")
                System.out.println("MÉDIO");
            else if(sigla == "G")
                System.out.println("GRANDE");
            else
                System.out.println("INDETERMINADO");
        }
    }
}

import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual será seu plano?");
            System.out.println("B = Basic, M = Midia, T = Turbo");
            String escolha = scanner.next();
            escolha = escolha.toUpperCase();

            //primeira tentativa
            /* */
            if(escolha.equals("B")){
                System.out.println("100 minutos de ligação");
            } else if(escolha.equals("M") ){
                System.out.println("100 minutos de ligação");
                System.out.println("whats app e instagram grátis");
            } else if(escolha.equals("T")){
                System.out.println("100 minutos de ligação");
                System.out.println("whats app e instagram grátis");
                System.out.println("5GB de Youtube");
            } else {
                System.out.println("Opção invalida, fim do programa!");
            }
            
        }

    }
}

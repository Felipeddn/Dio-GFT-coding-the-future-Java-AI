import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a nota? ");
            nota = scanner.nextInt();
        }

        if(nota >= 7){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }
    }
}

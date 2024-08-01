import java.util.Scanner;

public class ResultadoEscolar {
        public static void main(String[] args) {
        /*
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
        else if(nota >= 5 && nota < 7){
            System.out.println("Prova de recuperação");
        }
        else{
            System.out.println("Reprovado");
        }
        */
    
    
        int nota = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a nota? ");
            nota = scanner.nextInt(); //dessa forma posso testar as condições sem alterar o código.
        }
    
        String resultado = nota >= 7? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação":"Reprovado";

        System.out.println(resultado);
    }

}

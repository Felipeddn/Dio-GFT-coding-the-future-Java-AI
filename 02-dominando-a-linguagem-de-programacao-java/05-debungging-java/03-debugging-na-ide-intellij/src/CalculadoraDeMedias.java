import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        //Estava tentando println e era printf
        //System.out.println("Média da turma %d", media);
        System.out.printf("Média da turma %.1f", media);
    }

    static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for(String aluno : alunos){
            //Estava tentando println e era printf
            //System.out.println("Nota do aluno %s:", aluno);
            System.out.printf("Nota do aluno %s:", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return  soma / alunos.length;
    }
}

# Condicional Composta 

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/


## Condicionais composta

Algumas vezes o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio, este cenário é denominado **Estrutura condicional composta**. Vejamos o exemplo abaixo:  

´´´java

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }
    }
}

´´´

Fim da aula

# For em arrays
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

Também usamos o controle de fluxo **for** para interagir sobre arrays e coleções: 

```java

public class ExemploForArrays {
    public static void main(String[] args ){
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " tem o nome " + alunos[x]);
        }
    }
}

```

Observe que como os arrays começam com indice igual a **0 (zero)**, iniciamos a nossa variável **x** também com valor zero e validamos a quantidade de repetições a partir da quantidade de elementos do array.

Fala a verdade: Depois desta explicação deu até sono em?

pior que não estou amando essas aulas!

## For Each

O uso do **for / each** está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção.

```java

//ExemploForEach.java
public class ExemploForEach{
    public static void main(String[] args){
        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada
        for(String aluno : alunos){
            System.out.println(alunos);
        }
    }
}

```

Fim da aula.

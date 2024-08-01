# Condicional Ternária 

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/


## Condição Ternária

Como vimos em operadores, podemos abreviar nosso algoritmo condicional refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso: 

```java

// Cenário 1
public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado!":"Reprovado!";
        System.out.println(resultado);
    }
}

```

```java

//Cenário 2
public class ResultadoEscolar {
    public static void main(String[] args){
        int nota = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual a nota? ");
            nota = scanner.nextInt(); //dessa forma posso testar as condições sem alterar o código.
        }

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao":"Reprovado";
        System.out.println(resultado);
    }
}

```

Práticados os códigos acima no arquivo ResultadoEscolar.java.

Fim da aula

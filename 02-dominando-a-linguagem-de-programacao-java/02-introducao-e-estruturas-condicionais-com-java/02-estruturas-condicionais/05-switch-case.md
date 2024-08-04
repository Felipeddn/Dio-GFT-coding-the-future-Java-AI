# Switch case

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/


## Switch Case

A estrutura **switch** compara o valor de cada caso com o da variável sequencialmente, e sempre que encontra um valor correspondente, executa o código associado ao acaso. Para evitar que as comparações continuem a ser executadas após um caso correspondente ter siod encontrado, acrescentamos o comando **break** no final de cada bloco de códigos. O comando **break**, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisaremos imprimir uma medida com base em mapa de valores, exemplo:

| Sigla | Tamanho |
|-------|---------|
| P     | PEQUENO |
| M     | MÉDIO   |
| G     | GRANDE  |

```java

// SistemaMedida.java 

// Modo condicional if/else
public class SistemaMedida {
    public static void main(String[] args){
        String sigla = "M";

        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MÉDIO");
        else if(sigla == "G");
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");
    }
}

```

```java

public class SistemaMedida {
    public static void main(String[] args){
        String sigla = "M";

        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default {
                System.out.println("INDETERMINADO");
            }
        }
    }
}
```
Observe que a nível de sintaxe não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma preocupação em informar a palavra break em cada alternativa.

Porém um cenário que poderíamos adequar o uso de switch/case para melhorar nosso algoritmo seria conforme a ilustração abaixo: 

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

* O sistema terá 03 planos: BASIC, MIDIA, TURBO
* BASIC: 100 minutos de ligação
* MIDIA: 100 minutos de ligação + whats e instagram grátis
* TURBO: 100 minutos de ligação + whats e instagram grátis + 5GB Youtube.

```java

//modo condicional convencional
public class PlanoOperadora {
    public static void main(String[] args){
        String plano ="M"; //M /T

        if(escolha == "B"){
            System.out.println("100 minutos de ligação");
        } else if(escolha == "M"){
            System.out.println("100 minutos de ligação");
            System.out.println("whats app e instagram grátis");
        } else if(escolha == "T"){
            System.out.println("100 minutos de ligação");
            System.out.println("whats app e instagram grátis");
            System.out.println("5GB de Youtube");
        }
    }
}

```

Refatorando o código para ganho de performance

```java

// Modo condicional switch/case
public class PlanoOperadora {
    public static void main(String[] args){
        String plano = "M"

        switch (plano){
            case "T": {
                System.out.println("5GB Youtube.");
            }
            case "M":{
                System.out.println("Whats e instagram.");
            }
            case "B": {
                System.out.println("100 minutos de ligação.")
            }
        }
    }
}
```

Se optarem por usar **switch/case**, estudem um pouco mais sobre os conceitos de **continue**, **break** e **default**.

Fim da aula.

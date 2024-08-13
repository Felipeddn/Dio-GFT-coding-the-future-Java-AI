# Hierarquia das exceções e exceções customizadas
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Hierarquia das exceções 

A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou *Exceções Checadas e Não Checadas*.

O que determina uma exceção ser classificado como **checada** ou **não checada**?
É o risco dela ser disparada logo você precisa tratá-la, exemplo: 

Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto contém Alfanuméricos.

```java

public class ExemploExcecao{
    public static void main(String[] args){
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");

        System.out.println(valor);
    }
}
```

As linhas 3 e 5 do código acima apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma exceção checada, logo nós programadores que iremos usar este método teremos que tratá-la explicitamente com **try \ catch**.

As checkeds exception são exceções que nos são informadas mesmo antes da execução de código exigindo a atenção do programador para trata-las com **try/catch** , ja as unchecked são exceções que não são consideradas tão comum pelos próprios desenvolvedores da linguagem e eles aceitam acontecer sem nos avisar da possibilidade do erro, elas normalmente ocorrem durante a execução do programa.

## Exceções customizadas

Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

* Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.

* Primeiro criamos nossa exceção:

```java

public class CepInvalidoException extends Exception {}
```

* Em seguida criamos nosso método de formatação de cep

```java

static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() !=8)
    throw new CepInvalidoException();

    //simulando um cep formatado
    return "23.765-064";
}
```

Fim da aula.

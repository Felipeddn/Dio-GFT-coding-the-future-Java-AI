# Estruturas excepcionais
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Exceções

Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitas pelo programador, erros devido a entrada errada ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançara uma **exceção** (jogará um erro).

De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e os demais não são erros mas sim fluxos não previstos pela aplicação.

É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de **tratamento de exceções** 

## Mão na massa

Vamos trazer o cenário que estudamos na aula sobre <span style="color:blue">Terminal e Argumentos</span> onde via terminal informamos alguns dados pessoais.

```java

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
       //criando o objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome:");
       String nome = scanner.next();

       System.out.println("Digite seu sobrenome:")
       String sobrenome = scanner.next();

       System.out.println("Digite sua idade:");
       int idade = scanner.nextInt();

       System.out.println("Digite sua altura");
       double altura = scanner.nextDouble();

       //imprimindo os dados obtidos pelo usuario
       System.out.println("Ola me chamo" + nome.toUpperCase() + sobrenome.toUpperCase());
       System.out.println("Tenho "+ idade+ " anos.");
       System.out.println("Minha altura é "+ altura + " centímetros.");
    }
}

```

Aparentemente é um programa simples, mas vamos listar algumas possíveis exceções que podem acontecer.

* Não informar o nome e sobrenome
* O valor da idade ter um caractere NÃO numérico
* O valor da altura ter uma vírgula ao invés de ser um ponto **(conforme padrão americano)**

Executando o nosso programa com os valores abaixo, vamos entender qual exceção acontecerá:

|Entrada | valor | exceção | causa|
|--------|-------|---------|------|
|Digite seu nome | Marcelo |  |   | 
|Digite seu sobrenome | Azevedo | |  |
|Digite sua idade| quinze (15) | java.util.inputMismatchException | foi informado um caractere e não um número|
|Digite sua altura: | 1,65| java.util.inputMismatchException | o formato informado da altura não segue o padrão americano estabelecido no locale|

A melhor forma de prever que pode ocorrer uma exceção, é pensar que ela pode ocorrer. **Lei de Murphy**

## Conhecendo algumas exceções já mapeadas

A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

| Nome | Causa |
|------| ------|
|java.lang.NullPointerException| Quando tentamos obter alguma informação de uma variável nula.|
|java.lang.ArithmeticException | Quando tentamos dividir um valor por zero.|
|java.sql.SQLException| Quando existe algum erro relacionado a interação com banco de dados.|
|java.io.FileNotFoundException | Quanto tentamos ler ou escrever em um arquivo que não existe.|

## Tratamentos de exceções

E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução **try** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

A instrução **catch** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

A instrução **finally** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares:

Estrutura de um bloco com try e catch.

```java 

try{
    //bloco de código conforme esperado
}
catch(Exception e){
    //precisamos saber qual exceção
    //bloco de código que captura as exceções que podem acontecer
    // em  caso de um fluxo não previsto
}

```

O bloco **try / catch** pode conter um conjunto de **catchs** correspondentes a cada exceção **prevista** em uma funcionalidade do programa.

Fim da aula.

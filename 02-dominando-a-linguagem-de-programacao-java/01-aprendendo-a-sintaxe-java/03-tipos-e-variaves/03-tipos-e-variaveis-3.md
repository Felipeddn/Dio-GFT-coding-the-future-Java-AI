# Tipos e variáveis - 3
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Tipos de dados

No Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types).

Os oitos tipos primitivos em Java são: 

**int**, **byte**, **short**, **long**, **float**, **double**, **boolean**, **char** - esses tipos não são considerados objetos e, portanto representam valores brutos. Eles sao armazenados direto na pilha de memória (memory stack).

## Tabela de tipos primitivos e seus valores: 

|Tipo | Memória | Valores mínimos | Valores Máximo  
|-----|---------|--------------|---------------|
|byte | 1 byte | -128 | 127 
|short | 2 bytes | -32.768 | 32.767 
|int | 4 bytes | -2.147.483.648 | 2.147.483.647 
|long|  8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.808 

[link utilizado para saber fazer a tabela em markdown](https://www.ecovida.org.br/docs/manual_site/markdown/table/) 

Os tipos primitivos que podem conter partes fracionárias podem ser representados por dois tipos:

|Tipo | Memória | Valores mínimos | Valores Máximo  
|-----|---------|-----------------|----------------
|float | 4 bytes | -3,4028E + 38 | 3,4028E + 38 
|double | 8 bytes | -1,7976E + 308 | 1,7976E + 308

Em relação aos dois tipos de pontos flutuantes apresentados, o tipo **double** são mais utilizados, pela garantia da precisado mesmo.

Apesar de o tipo **float** ocupar metade da memória consumida do que o tipo double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.

atualmente, com os computadores modernos, se tornou desnecessário utilizar os tipos **short** e **byte**, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo **long**, pois não é tão comum trabalharmos com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes utilizamos o tipo **int** para representar números inteiros ou **double** para representar números fracionados.

O ponto mais relevante em compreender a definição dos tipos de dados é o momento da definição do tipo para uma variável. **Qual tipo de dados eu utilizaria para determinar a idade de uma pessoa ou salário de um funcionário?**

para a **idade** uma variável do tipo **short** daria conta e dependendo do escopo da idade até uma variável do tipo **byte** atenderia, mas é comum usarem variáveis do tipo **int**.

Para uma variável representar um salário definir ela do tipo **float** ja serviria porém é comum usarem variáveis do tipo **double** para valores com casas decimais

## Declaração de Variável 

Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + Valor atribuído.

A estrutura padrão para se declarar uma variável sempre é:

Tipo nomeVariavel atribuiçãoDeValorOpcional 

Exemplos abaixo: 

```java
int idade; // Tipo "int", nome "idade", com nenhum valor atríbuido
int anoFabricacao = 2021 // tipo "int", nome "anoFabricado", com valor 2021
double salarioMinimo = 2.500; // tipo "double", nome "salarioMinimo" com o valor 2.500
```
A presença do ponto na variável salarioMinimo não significa que o número é 2500 mas sim que é uma casa decimal, no padrão imperial de decimais, usado pelos estados unidos o ponto ao invés da vírgula é usada como separador de casa decimais.

quando criamos uma variável e não informamos seu valor, ele recebe um valor padrão, tipos númericos recebem o valor 0, caractere vai receber um valor e lógico recebe false.

Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

```java
public class TipoDados {
    public static void main (String [] args) {
        byte idade = 123;
        shot ano = 2021;
        int cep = 21070333; //se começar com, talvez ele ignore o zero e o valor se perde, a solução para isso é usar o tipo String para armazenar cep 
        long cpf = 98765432109L; //se começar com zero, também é necessário fazer ele ser do outro tipo, String por exemplo.
        float pi = 3.14F; //o tipo float precisa terminar com a letra F senão será confundido com o tipo double;
        double salario = 1275.33;
    }
}
```

Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia podem estimular uma alteração de tipos de dados convencional.

Muitas das vezes criamos uma variável, definimos um valor correspondente, manipulamos esta variável e temos consciência de seu valor na aplicação. Mas cuidado!!

Java é fortemente "tipado"
 
Veja o cenário abaixo: 

```java
//TiposeVariaveis.java

short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = numeroNormal;
```

Fim da aula

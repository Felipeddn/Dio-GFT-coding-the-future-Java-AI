# Operadores - 2
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Operadores 

Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações.

Geralmente as primeiras palavras que ouvimos em um curso de programação são: um programa é um conjunto de instruções lógicas que, quando 
executadas, produzem algum resultado. Com isso em mente, ao comecar a criar as primeiras linhas de código, logo você notará que é comum receber dados do usuário, prover alguma lógica para processa-los e então apresentar o resultado desse processamento.

| operador | comparação     | 
|----------|----------------| 
|   ==     | igual          | 
|   !=     | diferente      | 
|   <      | menor          | 
|   >      | maior          | 
|   <=     | menor ou igual | 
|   >=     | maior ou igual | 

## Classificação dos operadores 

### Atribuição 

representado pelo simbolo de igualdade 🟰.

O operador de atribuição é utilizado para definir o valor inicial ou sobre escrever o valor de uma variável em Java definimos um tipo, nome e opcionalmente atribuímos um valor à variável através do operador de atribuição. Exemplos abaixo

```java
//Classe operadores.java

String nome = "Felipe";
int idade = 22;
double peso = 75.0;
// coloquei virgula para representar as casas decimais, lembrar que é ponto **(.)** .
char sexo = 'M';
// cometibo erro de usar aspas duplas para caractere
boolean doadorDeOrgao = false;
Date dataDeNascimento = new Date();
```

# Aritméticos

O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores são: + (adição), - (subtração), * (multiplicação) e / (divisão).

```java
//classe operadores.java

double soma = 10.5 + 15.7;
int subtracao = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3;
double resultado = (10 * 7) + (20 / 4);
```

ATENÇÃO! o operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".

```java
// classe operadores.java
String nomeCompleto = "LINGUAGEM " + "JAVA";
```

// qual o resultado das expressões abaixo?
String concatenacao = "?";

concatenacao = 1+1+1+"1";

concatenacao = 1+"1"+1+1;

concatenacao = 1+"1"+1+"1";

concatenacao = "1"+1+1+1;

concatenacao = "1"+(1+1+1);

Para controlar a execução das atribuições acimas fizemos o uso do Debug que é a definição de um ponto de interrupção onde o programa para de executar automáticamente e podemos controlar a execução linha a linha usando o comando **contornar** no VS Code.

O resultado para as operações acima demonstra que a partir do momento que o Java identifica um caractere ele passa a realizar concatenação e para de realizar operações aritméticas.

Na opção com uso do parenteses ele trabalhou a expressão dentro do parenteses e concatenou o resultado desses parenteses com o caractere isso é uma situação bem interessante.

Fim da aula.

# Tipos e variáveis - 4
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

No contexto de variáveis podemos atribuir ou não um valor e essa variável ao longo do programa pode alterar seu valor, agora imagina criar uma variável onde a proposta é que seu valor não se altere durante a execução do programa, será que isso é possível?

## Variáveis e Constantes

Uma **variável** é uma area de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. **Java** é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da variável não é obrigatório.

No Java utilizamos identificadores que representam uma referência (ponteiro) a um valor em memória, e esta referência pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "variável", pois o valor pode variar.

Já as **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada **final**, seguida do tipo.

Por convenção, **Constantes** são sempre escritas em CAIXA ALTA.

Abaixo temos um exemplo explicativo sobre uso de variáveis e constantes:

```java
public class ExemploVariavel{
    public static void main(String[] args){
        /*
        * esta linha é considerada como declaração de variável
        * variavel numero com valor 5, regra: tipo + nome + valor opcional
        */
        int numero = 5;
        System.out.println(numero);

       /*
       * na linha abaixo iremos alterar o valor da variável
       * não é mais necessário, pois a variável já foi
       */
       
       numero = 10;

       System.out.println(numero);

       /*
       * ao usar a palavra reservada final, você determina
       * esta variavel poderá obter outro valor;
       * logo haverá um erro de compilação ao tentar definir outro valor para uma constante
       * isso é considerado uma CONSTANTE na linguagem Java
       */
      final double VALOR_DE_PI = 3.14;

      // o que determina que a variável é uma constante é a palavra reservada final e não escrever a palavra em CAIXA ALTA
    }
}
```

Compreendemos que para declarar uma variável como uma constante, utilizamos a palavra **final**, mas por convenção, esta variavel deverá ser escrita em caixa alta.

O que é um match de conceitos? o que significa a palavra match?

O instrutor recomendou a gente estudar:

* tipos primitivos  
* a classe String que representa texto na aplicação 

Fim da aula 

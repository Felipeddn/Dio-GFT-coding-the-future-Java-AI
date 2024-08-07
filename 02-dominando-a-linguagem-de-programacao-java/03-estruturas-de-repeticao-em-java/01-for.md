# For
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Estruturas de repetição 

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes. 

https://diegomariano.com/lacos-de-repeticao-2/

Laços ou repetições são representados pelas seguintes estruturas:

* **For** (para)
* **While** (enquanto)
* **Do While** (faça enquanto)

## For 

O comando **for** (na tradução literal para língua portuguesa "para") permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição e o valor de incrementação.

A estrutura de sintaxe do controle de repetição **for** é exibida abaixo:

```java

//estrutura de controle de fluxo for
for (bloco de inicialização; expressão booleana de validação; bloco de atualização){
    //comando que será executado até que a expressão de 
    //validação torne-se falsa
}

```

Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos para pegar no sono:

```java

// ExemploFor.java
public class ExemploFor{
    public static void main(String[] args){
        for(int carneirinho; carneirinho <=20; carneirinho++){
            System.out.println(carneirinhos + " - carneirinhos")
        }
        System.out.println("Joazinho dormiu!")
    }
}

```
Fim da aula.

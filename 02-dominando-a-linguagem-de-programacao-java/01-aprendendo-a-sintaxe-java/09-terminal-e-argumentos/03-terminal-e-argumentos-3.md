# Terminal e argumentos - 3 
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Argumentos 

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array[] de argumentos do tipo String. Logo podemos após a definição da classe a ser executada informar estes parâmetros, exemplo:

java MinhaClasse argumentoUm argumentoDois

Exemplo:

```java

public class AboutMe {
    public static void main(String[] args){
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        //vamos falar sobre
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + " centímetros.");
    }
}
``` 

Está cada vez pior essa aula, simplesmente a classe não aparece na pasta bin e ele não explicou como compilar, está se tornando horrível essa experiência de aprendizado.

Enfim, não sei o que houve, porém iniciei um novo diretório com um novo projeto Java, consegui localizar o arquivo e executei o comando no terminal como o Gleyson fez, e deu certo como no dele, mas fica a dúvida do porque o VS Code não criou um arquivo class no diretório bin antes.

Agora que deu certo foi muito agradavel fazer isso.

Fim da aula.


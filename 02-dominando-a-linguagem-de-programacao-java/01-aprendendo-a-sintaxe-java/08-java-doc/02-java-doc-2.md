# Java Doc - 2 
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Documentação 

Uma das maiores características da linguagem Java é que desde suas primeiras versões tínhamos em nossas mãos uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar todos os recursos organizados por pacotes e classes bem específicas sem nem mesmo escrever uma linha de código.

Hoje costuma-se afirmar que para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

Aqui temos o link da documentação de uma das principais classes da linguagem Java.

https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

## Tags

Mas e quais as informações que obtemos através de classes documentadas na linguagem? Java documentation é composto por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag | Descrição|
|-----|----------|
|@autor|Autor/Criador|
|@version|Versão do recurso disponibilizado|
|since|Versão/ Data de início de disponibilidade do recurso|
|@return|Definição do tipo de retorno de um método|
|throws|Se o método lança alguma exceção|

Abaixo iremos ilustrar a classe Calculadora com um exemplo de documentação destacando as **tags** mais utilizadas.

```java
/**
* <h1>Calculadora</h1>
* A calculadora realiza operações matemáticas entre números
* <p>
* <b>Note:</b> Leia atentamente a documentação desta Classe
* para desfrutar dos recursos oferecidos pelo autor
* @autor Gleyson Sampaio
* @version 1.0
* @since 01/01/2022
*/

public class Calculadora{
    /**
    * Este método é utilizado para somar dois números inteiros
    * @param numeroUM este é o primeiro parâmetro do método 
    * @param numeroDois este é o segundo parâmetro do método
    * @return int o resultado deste método é a soma dos dois números
    */
    public int somar (int numeroUm, int numeroDois){
        return numeroUm + numeroDois;
    }
}
```

## Tipos de comentários

```java

// Uma linha

//Olá, eu sou um comentário em uma única linha

//Multiplas linhas
/* Olá,
 * Eu sou um comentário
 * que posso ser mais detalhado
 * quando necessário
 */

//Documentação
/**
 * Estas duas estrelinhas acima
 * é para identificar que você 
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que incrível !!!
 */

```

Um comentário não possui finalidade de **amenizar** um algoritmo não estruturado conforme as convenções da linguagem.

## Javadoc

**Javadoc** é um gerador de documentação criado pela <span style="color blue">Sun Microsystems</span> para documentar <span style="color blue">API</span> dos programas em <span style="color blue">Java</span>, a partir do <span style="color blue">código-fonte</span>. O resultado é expresso em <span style="color blue">HTML</span>. É constituído, basicamente, por algumas marcações muito simples inseridas nos comentários do programa.

Este sistema é o padrão de documentação de classes em Java, e muitas <span style="color blue">IDEs</span> desta linguagem irão automáticamente gerar um Javadoc em <span style="color blue">HTML</span>.

Criando nossa documentação no formato html para disponibilizar via web.

No **terminal** execute o comando abaixo dentro do diretório do projeto.

javadoc -encoding UTF -8 -docencoding ISO-8859-1 -d ..//docs src/*.java

Esse comando acima é incrivel simplesmente amei!

Fim da aula

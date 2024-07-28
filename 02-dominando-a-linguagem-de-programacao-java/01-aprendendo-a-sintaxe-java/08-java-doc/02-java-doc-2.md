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
/*
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
    * Este método 
}
```


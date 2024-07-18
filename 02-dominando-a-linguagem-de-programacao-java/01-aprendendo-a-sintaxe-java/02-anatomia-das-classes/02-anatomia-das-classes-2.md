# Anatomia das classes - 2  

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em: 

https://glysns.gitbook.io/java-basico/ 

Todas as linguagens tem convenções de escrita.

## Padrão de nomeclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita. Esses padrões estão expressos nos itens abaixo:

* **Arquivo.java**: Todo arquivo .java deve começar com letra  MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo:
 Calculadora.java, CalculadoraCientifica.java

* **Nome da classe no arquivo**: A classe deve possuir mesmo nome do arquivo.java, exemplo:

````java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {

}
````

* **Nome de variável**: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser MAIÚSCULA, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

Existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que uma variável de nome **br** sempre apresentará "**Brasil**" e nunca mudará seu valor, logo, determinamos como escrita o código abaixo:

````java
String BR = "Brasil"
double PI = 3.14
int ESTADOS_BRASILEIRO = 27
int ANO_2000 = 2000
````

Eu como programador ao ver essa convenção de variável nomeada com letras maiúsculas deveria interpretar que o conteúdo dessa variável não deve ser modificada, porém para o caso de por algum desconhecimento ou outras intenções, falta de atenção, etc. devo utilizar a palavra reservada **final**. exemplo:

````java
//uma variável definida como constante, é um equivoco tentar mudar o valor dessa variável após esse valor ter sido determinado em sua inicialização
final String BR = "Brasil"

//Essa variável já pode ter seu valor mudado
int ano = 2024

ano = 2025

````

Quando uma variável apresenta a escrita toda em maiúscula compreendemos que se trata de uma constante, seu valor não deve ser modificado.

Recomendações: Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas dessas regras da linguagem.

* Deve conter apenas letras, _(underline), $ ou os números de 0 a 9.  
* Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número.  
* Deve iniciar com uma letra minúscula (boa prática - ver abaixo).  
* Não pode conter espaços.  
* Não podemos usar palavras-chaves da linguagem.  
* O nome deve ser único dentro de um escopo.  

````java
// Declaração inválida de variáveis

int numero&um = 1;  
//Os únicos símbolos permitidos são _ e $

int 1numero = 1;
//Uma variável não pode começar com números

int numero um = 1; 
//Não pode ter espaço no nome da variável

int long = 1; 
//long faz parte das palavras reservadas da linguagem

//Declaração válida de variáveis
int numero$um = 1;
int numero1 = 1;
int numeroum = 1;
int longo = 1;
````

Fim da aula

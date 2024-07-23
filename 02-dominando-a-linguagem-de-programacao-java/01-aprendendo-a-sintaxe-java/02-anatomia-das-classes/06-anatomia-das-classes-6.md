# Anatomia das classes - 6  

Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Java Beans  

Uma das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu time ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

### Variáveis

Mais cedo já aprendemos algumas regras de declaração de variáveis, mas agora iremos conhecer algumas sugestões de nomenclatura:

* Uma variável deve ser clara, sem abreviações ou definição sem sentido; 

* Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção**.

* Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

Não recomendado

```java
double salMedio = 1500.23 //variável abreviada, o que dificulta a compreensão  
String emails = "aluno@escola.com" //confuso se a variável seria um array ou único e-mail  
String myName = "JOSEPH" //se foi definido no projeto o idioma pt-BR, o valor pode ser de outro idioma mas o nome da variável não deve ser em um idioma diferente do idioma definido pelo projeto
```

Tenha consciência que alguns projetos exigem o uso do idioma inglês.

Recomendado

```java
double salarioMedio = 1500.23; 
String email ="aluno@escola.com";
String [] emails = {"aluno@escola.com";"professor@escola.com"}
String meuNome = "JOSEPH"
```

### Métodos 

Os métodos deverão ser nomeado como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.

Exemplos sugeridos para nomenclatura de métodos:

```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento() {}

findByID(int id){} //não se assuste, você verá muito métodos em inglês na sua jornada

calcularImprimir(){} //há algo de errado nesse método, ele deveria ter uma única finalidade, o método deve assumir apenas uma tarefa específica, esse método precisa ser desmenbrado em dois métodos para poder ficar ok e não gerar dúvida quanto seu funcionamento.
```

Fim da aula

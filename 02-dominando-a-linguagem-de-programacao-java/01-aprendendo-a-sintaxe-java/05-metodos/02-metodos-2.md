# Métodos - 2
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/

## Métodos

<span style="color:gray">Todas as ações das aplicações são consideradas métodos</span>

[aprendi a mudar a cor da fonte neste link](https://stackoverflow.com/questions/35465557/how-to-apply-color-on-text-in-markdown)

Uma classe é definida por atributos e métodos. Já vimos que atributos são, em sua grande maioria, variáveis de diferentes tipos e valores. Os métodos, por sua vez, correspondem a **funções** ou **sub-rotina** disponíveis dentro de nossas classes.

## Critérios de nomeação de métodos 

Esses critérios não são obrigatórios, mas é recomendável que seja seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

* Deve ser nomeado como verbo
* Seguir o padrão camelCase (todas as letras minúsculas com exceção da primeira letra de cada palavra que surgir depois da primeira palavra).

Exemplos sugeridos para nomenclatura de métodos:

```java
somar(int n1, int n2){}

abrirConexao(){}

concluirProcessamento(){}

findById(int id){}

calcularImprimir(){}
//gostei demais da forma como o Gleydson explicou: existe um conflito de responsabilidade do método, esse método tem que ser desmenbrado em dois para poder funcionar de forma mais precisa
```

ATENÇÃO! não existe em **Java** o conceito de **métodos** globais. Todos os **métodos** devem SEMPRE ser definidos dentro de uma classe.

## Critérios de definições de métodos 

Mas, como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar a essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

1. **Qual a proposta principal do método?** Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

2. **Qual o tipo de retorno esperado após executar o método?** Você deve analisar se o método sera responsável por retornar algum valor ou não.

Caso o método nao retorne nenhum valor, ele será representado pela palavra chave **void**.

1. **Quais os métodos serão necessários para a execução do método?** Os métodos as vezes precisarão de argumentos como critérios para a execução.

2.  **O método possui risco de apresentar alguma exceção?** Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

3.  **Qual a visibilidade do método?** Será necessário que o método seja visível a toda aplicação, somente em mesmo pacotes, através de herança ou somente a nível da própria classe.

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:

```java

public class myClass {

  public double somar(int num1, int num2){
    //LÓGICA - FINALIDADE DO MÉTODO
    return...;
  }

  public void imprimir(String texto){
    //LÓGICA - FINALIDADE DO MÉTODO
    //AQUI NÃO PRECISA DO RETURN
    //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO 
  }
  //throws Exception : indica que o método ao ser utilizado poderá gerar uma exceção
  public double dividir(int dividendo, int divisor) throws Exceptions{}

  //Esse método nao pode ser visto por outras classes no programa
  private void metodoPrivado(){}

  //alguns equívocos estruturais
  public void validar(){
    //este método deveria retornar algum valor
    //no caso boolean (true ou false)
  }

  public void calcularEnviar(){
    //um método deve representar uma única responsabilidade 
  }

  public void gravarCliente(String nome, String cpf, Integer idade){
    //este método tem a finalidade de gravar informações de um cliente, por que não um objeto cliente e passar como parâmetro, veja abaixo 
  }

  public void gravarCliente(Cliente cliente){}

}

```

Fim da aula

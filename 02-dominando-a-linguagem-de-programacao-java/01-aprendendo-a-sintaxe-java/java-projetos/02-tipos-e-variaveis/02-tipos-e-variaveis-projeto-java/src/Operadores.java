public class Operadores {
  public static void main (String[] args){
    // aula operadores - 2
    /*
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    
    System.out.println(nomeCompleto);

    

    String concatenacao = "?";
    //qual o resultado das expressões abaixo?
    
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    //"31"
    
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    //"1111"

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);
    //"1111"

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);
    //"1111"

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
    //"13"
    */

    // aula operadores 3
    /*
    int numero = 5;

    System.out.println(-numero);

    System.out.println(numero);

    numero = -numero;
    System.out.println(numero);

    //deu errado porque somente um muda com negativo, bastava usar o negativo novamente, isso se trata de um conceito de matemática.
    numero = +numero;    
    System.out.println(numero);

    
    numero = -numero;
    System.out.println(numero);
    //aqui deu certo, ele voltou a ser positivo

    numero = numero * -1;
    */

    //aula operadores 4

    //repetição
    /*
    int numero = 5;

    numero = numero + 2;
    System.out.println(numero);

    //acima foi a tentativa de incremento mas sua ocorrência foi apenas uma vez

    numero = numero + 1;
    System.out.println(numero);

    //o operador de atribuição realiza essa soma de uma unidade

    numero++;
    //o comando acima é o mesmo que fazer numero = numero + 1; porém a escrita é muito mais reduzida.

    System.out.println(numero);

    System.out.println(numero++);
    // acima ele não realizou o incremente, porque colocar o sinal após a variável passa o entendimento de que desejamos realizar o incremento após o valor da variável ser impresso no dispositivo de saída. Podemos chamar essa operação de pós-incremento

    //aqui sim ele demonstra o incremento
    System.out.println(numero);

    System.out.println(++numero);
    // já aqui ele realiza primeiro o incremento e depois ele imprime o resultado em um dispositivo de saída permitindo assim consultarmos o valor já acrescido do incremento. Podemos chamar essa operação de pré-incremento

    // O mesmo vale para quando eu quiser decrementar
    System.out.println(numero--);

    //booleanos
    boolean variavel = true;

    //A exclamação nega o valor da variável
    System.out.println(!variavel);
    //isso foi uma operação que não mudou o valor da variável, para que ocorra uma mudança na variável esse valor tem que ser atribuido à variável.

    System.out.println(variavel);

    variavel = !variavel;

    System.out.println(variavel);
     */

    // aula 5 operadores ternario
    /*
    int a, b;

    a = 5;
    b = 6;
    */
    /*
    String resultado = "";

    // EXEMPLO CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    
    if(a==b)
      resultado = "verdadeiro";
    else
      resultado = "falso";
     */

    /*
    String resultado = a==b? "verdadeiro":"falso";

    System.out.println(resultado);
    */
    /*
    a = 6;    

    String resultado = a==b? "verdadeiro":"falso";

    System.out.println(resultado);
    */

    // aula 6 operadores relacionais
    /*
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    System.out.println("numero1 é igual a numero2? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numero1 é diferente de numero2? " + simNao);

    simNao = numero1 < numero2;

    System.out.println("numero1 é maior que numero2? " + simNao);

    if (numero1 < numero2){
      System.out.println("A nossa condição é verdadeira!");
    }

    if (numero1 == numero2){
      System.out.println("A nossa condição é verdadeira!");
    } else {
      System.out.println("a nossa condição não é verdadeira!");
    }

    String nomeUm = "Gleyson";
    String nomeDois = "Gleyson";

    System.out.println(nomeUm == nomeDois);

    String nomeTres = new String("Gleyson");

    System.out.println(nomeUm == nomeTres);

    */    

    //os objetos não foram iguais por conta de um conceito de Java que diferencia steak do rip

    /*
     * uma variável feita através da classe String é armazenada na memória, porém um objeto feito através classe tem um comportamento um pouco diferente.
     */

     //Um método que pode fazer uma comparação melhor é o método .equals(), então para comparar conteúdo de objetos o mais adequado é usar o método .equals().

     //System.out.println(nomeUm.equals(nomeTres));

     //Aula 7 operadores lógicos

    boolean condicao1 = true;
    boolean condicao2 = false;

    /*
    if (condicao1 && condicao2){
      System.out.println("As duas condições são verdadeiras");
    }
    System.out.println("Fim");
    */

    if (condicao1 || condicao2){
      System.out.println("Uma das condições condições é verdadeiras");
    }

    condicao2 = true;

    if (condicao1 && condicao2){
      System.out.println("As duas condições são verdadeiras");
    }

    if (condicao1 && (7 > 4)){
      System.out.println("As duas condições são verdadeiras");
    }

  }
}

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
  }
}

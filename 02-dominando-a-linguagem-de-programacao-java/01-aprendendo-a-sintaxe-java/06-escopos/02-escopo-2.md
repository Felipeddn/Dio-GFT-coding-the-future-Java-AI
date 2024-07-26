# Escopo - 2 
Instrutor: Gleydson Sampaio

Todo o conteúdo do curso pode ser acessado em:

https://glysns.gitbook.io/java-basico/


## Escopo 

O escopo pode ser entendido como o ambiente onde uma variável pode ser acessada. Em Java, o escopo de variáveis **vai de acordo com o bloco onde ela foi declarada**.

A variável é criada no primeiro acesso à ela, se tornando inacessível após o interpretador sair do bloco de execução ao qual ela pertence. Portanto, esta variável não pode ser lida ou manipulada por rotinas e códigos que estão fora do seu bloco de declaração, ou seja, fora do escopo da variável.

Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, sendo portanto acessível por todos os métodos. 

Caso você declare uma variável **DENTRO DE UM MÉTODO**, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

Uma parte fundamental na elaboração de algoritmos simples ou complexos é determinar a localização do código em questão. Sem um domínio sobre escopo de códigos seu projeto tende a conter falhas estruturais e comprometer a proposta principal da aplicação.

```java
public class Conta {
    double saldo = 10.0;
    //double chequeEspecial = 0;
    // se a variável é de classe ela fica visível para todos os métodos da classe

    public void sacar(Double valor){
        //variável local de método
        //if(valor <= saldo){
            // Se a variável for do método ela não fica visivel para os outros métodos da classe
            double novoSaldo = saldo - valor;
            //saldo = saldo - valor;
        /*    
        }
        else{
            System.out.println("você não pode sacar esse valor, porque não tem limite!");
        }
        */
        //return saldo;
    }
    public void imprimirSaldo(){
        //disponível em toda classe 
        System.out.println(saldo);
        //somente o método sacar conhece esta variável
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial(){
        //variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0;
        //começando a variável 
        for(int x=1; x<=5; x++){
            //variável de escopo de 
            //esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMotante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarão disponível 
    }
}
```
Fim da aula

public class TiposeVariaveis {
    public static void main(String[] args) throws Exception {
        // forma de escrever 2500 reais em java
        double salarioMinimo = 2500;
        double salarioMinimoDecimal = 2500.33;
        System.out.println(salarioMinimo > salarioMinimoDecimal);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        
        // O Java não aceita armazenar um valor de um tipo com menor capacidade dentro de uma variável com maior capacidade.
        //short numeroCurto2 = numeroNormal;

        //a solução para isso é usar um recurso chamado casting
        short numeroCurto2 = (short) numeroNormal;

        //exemplo do comportamento da variável e sua capacidade de assumir diferentes valores 
        int numero = 1;
        System.out.println(numero);

        numero = 2;
        System.out.println(numero);

        int numeroNovamente = 5;
        System.out.println(numeroNovamente);
       
       numeroNovamente = 10;

       System.out.println(numeroNovamente); 

        // valor_nunca_podera_mudar

        final double  VALOR_DE_PI = 3.14;

        System.out.println(VALOR_DE_PI); 

        //VALOR_DE_PI = 10.75;

        System.out.println(VALOR_DE_PI); 

        // o que determina que a variável é uma constante é a palavra reservada final e não escrever a palavra em CAIXA ALTA

        //a partir do momento que a palavra final é utilizado o IDE passa a apontar um problema.

        String meuNome = "Felipe Dantas";
        System.out.println(meuNome); 
    }


}

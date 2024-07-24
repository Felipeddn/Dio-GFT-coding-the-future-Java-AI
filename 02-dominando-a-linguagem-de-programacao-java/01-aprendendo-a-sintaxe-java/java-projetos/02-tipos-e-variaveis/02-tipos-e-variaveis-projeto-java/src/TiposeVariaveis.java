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

    }
}

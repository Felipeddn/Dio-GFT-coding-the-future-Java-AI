public class MinhaClasse {
   //bloco de código
    public static void main(String [] args){
        //System.out.print("Primeira aula sobre anatomia das classes.");

       //sobre variáveis 
       /*
       String meuNome = "Felipe";

       int anoFabricacao = 2022;

       boolean verdadeira = true;
       */

       //podemos manipular o valor de uma variável após uma valor ser atribuido a mesma;
       //anoFabricacao = 2018;

       //sobre métodos
       String primeiroNome = "Felipe";
       String segundoNome = "Dantas"

       String nomeCompleto = nomeCompleto (primeiroNome, segundoNome)

      System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
   return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}

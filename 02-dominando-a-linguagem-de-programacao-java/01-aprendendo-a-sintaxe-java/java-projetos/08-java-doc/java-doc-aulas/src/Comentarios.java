public class Comentarios {
    /**
     * Este método foi elaborado as pressas
    * por isso eu abreviei o nome das variáveis 
    * mas olha, ele tem a finalidade de somar ou multiplicar dois números
    */

    /*
    * Exemplo do que não fazer ao usar comentários
    */

    public int somaMultiplica (int n, int x,    String m){
        int r = 0; //r é igual ao resultado
        if (m == "M"){
            //M = multiplicação
            r = n * x;
        } else {
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }   
}

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            //String cepFormatado = formatarCep("23765064");
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.out.println("Cep não corresponde á um cep valido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();
        /*
        System.out.println("TV ligada: " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);
        */
        smarTv.ligar();

        //System.out.println("Novo status - TV ligada: " + smarTv.ligada);

        smarTv.desligar();

        smarTv.ligar();

        //System.out.println("Novo status - TV ligada: " + smarTv.ligada);

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();

        //System.out.println("Volume atual: " + smarTv.volume);

        smarTv.aumentarVolume();

        //System.out.println("Volume atual: " + smarTv.volume);

        //System.out.println("Canal atual: " + smarTv.canal);

        smarTv.mudarDeCanal(13);

        //System.out.println("Canal atual: " + smarTv.canal);        

        smarTv.aumentarCanal();

        smarTv.diminuirCanal();
        smarTv.diminuirCanal();
        smarTv.diminuirCanal();

        smarTv.mudarDeCanal(97);

        smarTv.aumentarCanal();
        smarTv.aumentarCanal();

    }
}

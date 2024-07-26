public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Ligando...");
        System.out.println("canal: " + canal);
        System.out.println("volume: " + volume);
    }

    public void desligar(){
        System.out.println("Desligando...");
        ligada = false;
        canal = 1;
        volume = 25;
    }

    
    public void aumentarVolume(){
        if (ligada) {
            volume++;    
            System.out.println("Aumentando o volume para: " + volume);
        }
        else {
            System.out.println("A tv precisa estar ligada");
        }
        
        
    }

    public void diminuirVolume(){
        if (ligada) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        }
        else{
            System.out.println("A tv precisa estar ligada");
        }
        
    }

    public void mudarDeCanal(int novoCanal){
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal atual:" + canal);
        }
        else{
            System.out.println("A tv precisa estar ligada");
        }
    }

    public void diminuirCanal(){
        if (ligada) {
            canal--;
            System.out.println("Canal atual: " + canal);
        }
        else{
            System.out.println("A tv precisa estar ligada");
        }
    }

    public void aumentarCanal(){
        if (ligada) {
            canal++;
            System.out.println("Canal atual: " + canal);
        }
        else{
            System.out.println("A tv precisa estar ligada");
        }
    }
}

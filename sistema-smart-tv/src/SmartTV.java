public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirrCanal(){
        canal--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume); 
    }

    public void dimunuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}

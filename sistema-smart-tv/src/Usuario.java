public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.dimunuirVolume();
        smartTV.dimunuirVolume();
        smartTV.dimunuirVolume();
        smartTV.aumentarVolume();
      
        System.out.println("Canal atual? " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual? " + smartTV.canal);

        System.out.println("Volume atual " + smartTV.volume);

        System.out.println("TV ligada? " + smartTV.ligada);
        
  
  
        smartTV.ligar();
      System.out.println("Novo status -> TV ligada?" + smartTV.ligada);

      smartTV.desligar();
      System.out.println("Novo status -> TV ligada?" + smartTV.ligada);
    }
}

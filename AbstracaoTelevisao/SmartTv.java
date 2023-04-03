// Abstração de uma televisão 

public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;

        public void mudarCanal (int novoCanal){
            canal = novoCanal;
            System.out.println("O canal atual é " + canal);
        }

        public void aumentarCanal(){
            canal++;
            System.out.println("O canal atual é " + canal);
        }

        public void diminuirCanal(){
            canal--;
            System.out.println("O canal atual é " + canal);
        }
        
        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando o volume para " + volume);
        }

        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo o volume para " + volume);
        }

        public void ligar(){
            ligada = true;
            System.out.println("A Tv está ligada? " + ligada);
        }

        public void desligar(){
            ligada = false;
            System.out.println("A Tv está ligada? " + ligada);
        }
  
    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Televisão está ligada? " + smartTv.ligada);
        System.out.println("O canal atual é o... " + smartTv.canal);
        System.out.println("O volume da Tv é... " + smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(11);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.desligar();
    }

}

package Usuario.Usuario.src;
public class SmartTv {
    public boolean ligada=false;
    public int canal=6;
    public int volume = 20;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
    }

    public void ligar (){
        ligada=true;
    }
    
    public void desligar (){
        ligada=false;
    }
}
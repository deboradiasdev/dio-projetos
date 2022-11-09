import Usuario.Usuario.src.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual :" + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual :" + smartTv.canal);

        System.out.println("Volume atual :" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -TV Ligada ?" + smartTv.ligada);
    }
}
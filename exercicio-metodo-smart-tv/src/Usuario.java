import javax.xml.crypto.dsig.CanonicalizationMethod;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        System.out.println("TV ligada? "+ smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("TV ligada? "+ smarTv.ligada);

        smarTv.desligar();
        System.out.println("Tv ligada? " + smarTv.ligada);

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.mudarDeCanal(200);
        System.out.println("Canal atual: " + smarTv.canal);

    }

}

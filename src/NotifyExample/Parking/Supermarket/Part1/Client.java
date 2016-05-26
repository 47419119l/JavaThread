import java.util.Random;

/**
 * Created by 47419119l on 30/11/2015.
 */
public class Client extends Thread {

    int numero = 0;
    int temps = 0;
    Cua cua = null;
    double tempsmig ;

    /**
     * Constructor de la clase Client.
     * @param n
     * @param cues
     */
    public Client(int numero, Cua cua) {
        this.numero = numero;
        this.cua = cua;
    }
    /**
     * Funci� que s'executara al iniciar el Thread.
     **/
    public void run(){
    	
        Random rd = new Random();
        this.temps = rd.nextInt(1500);
        
        try {
        	
            sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
         * Ens dona un numeor aleatori per veure a quina caixa ens colocarem
         */
        int tria_cua = rd.nextInt(cua.getNumCaixes());

        try {
        	
            cua.ocuparCua(tria_cua);
            sleep(temps/2); // L'hi diem que el temps a pagar �s la mitat del que tarda en en comprar.
            tempsmig =cua.tempsMig(temps+temps/2);
            cua.desocuparCua(tria_cua);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Soc el client: "+this.numero+" i he trigat a comprar "+temps+" He pagat en la caixa "+tria_cua+" temps mig de compra ha sigut de " +tempsmig);


    }
}

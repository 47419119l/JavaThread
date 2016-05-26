public class CreateThread extends Thread {

    public String mensaje ;

    /**
     * Creo el constructor de la classe.
     * @param mensaje
     */
    public CreateThread(String mensaje)
    {
        this.mensaje=mensaje;
    }
    /**
     * El run() que mostra el missatge mab el qual instranciem la classe i te un contador que va del 0 al 1
     **/
    public  void run()
    {

        for(int i =0;i<10;i++)
        {
            System.out.println(mensaje + i);
        }
        System.out.println(mensaje+": Aquest fil a acabat" );
    }

    /**
     * El main crea 5 fils (Thread)
     * @param args
     */
    public static void main(String[] args)
    {
        /*
        Instanciem els objectes CrearFils
         */
        CreateThread fil1 = new CreateThread("Fil 1 ");
        CreateThread fil2 = new CreateThread("Fil 2 ");
        CreateThread fil3 = new CreateThread("Fil 3 ");


        /*
        Executem el fil.
         */
        fil1.start();
        fil2.start();
        fil3.start();


    }
}
/**
 *
 * RESULTAT:
 * Que els fils es van intercalant entre ells.
 *
 **/

package CreateThread;

import java.util.Random;

public class CreateThread2 extends Thread
{

    int inici, fi; //inici i fin del Thread dintre l'array
    Array array;
    private final static Random generator = new Random();


    /**
     * Constructor de la clase CreateThread2
     * @param inici
     * @param fi
     * @param array
     */
    public CreateThread2(int inici, int fi, Array array) {

        this.inici = inici;
        this.fi = fi;
        this.array=array;
    }

    /**
     * Metode que s'inicia al executar el Thread
     */
    public void run() {
        for (int i=inici; i<fi; i++){
            /*
            Genera un numero aleatori i afaga el nom del fil per veure que o fa correctaament
             */
            array.ompliarArray(generator.nextInt(100),i);
        }

    }

}
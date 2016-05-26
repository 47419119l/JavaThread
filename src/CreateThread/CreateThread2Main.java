package CreateThread;

import CreateThread.CreateThread2;

/**
 * Created by 47419119l on 2015/11/3.
 */
public class CreateThread2Main {

    public static void main (String[]arg){

        CreateThread2 fil1,fil2,fil3,fil4,fil5,fil6,fil7,fil8,fil9,fil10;

        /*
        Instanciem a clase Array
         */
        Array array = new Array();
        /*
        Creem els fils
        L'hi diem de quina posició a quina posició del array han d'anar.
         */
        fil1 = new CreateThread2(  0,  99,array);
        fil2 = new CreateThread2(  100,  199,array);
        fil3 = new CreateThread2( 200,  299,array);
        fil4 = new CreateThread2( 300,  399,array);
        fil5 = new CreateThread2(  400,  499,array);
        fil6 = new CreateThread2(  500,  599,array);
        fil7 = new CreateThread2( 600,  699,array);
        fil8 = new CreateThread2(  700,  899,array);
        fil9 = new CreateThread2(  800,  899,array);
        fil10 = new CreateThread2( 900,  999,array);
        /*
        Executem els fils
         */
        fil1.start();
        fil2.start();
        fil3.start();
        fil4.start();
        fil5.start();
        fil6.start();
        fil7.start();
        fil8.start();
        fil9.start();
        fil10.start();
        /*
        Mostrem que l'array s'ha omplet adequadament.
         */
        array.mostrar();








    }
}
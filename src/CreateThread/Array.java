package CreateThread;

/**
 * Created by 47419119l on 2015/11/3.
 */
public class Array
{
    public int array [] ;

    /**
     * Constructor de la classe
     */
    public Array() {
        this.array = new int[1000];

    }

    /**
     * Omple la posicio donada amb la Strinng donada
     * @param i
     * @param pos
     */
    public void ompliarArray(int i,int pos) {
        array[pos] = i;
    }

    /**
     * Mostra el contringut de la Array
     */
    public void mostrar(){
        for(int i = 0; i <array.length; i++){
            System.out.println(array[i]);
        }
    }
}
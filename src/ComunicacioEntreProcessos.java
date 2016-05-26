import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author 47419119l
 *
 */
public class ComunicacioEntreProcessos {

    public static void main(String[] args)
    {

        String comande ="alea";
        ExecutaPrograma(comande);

    }

    /**
     *
     * @param comande
     *Aquesta Funció l'hi passem un String Comande ( que serà l'ubicació del programa alea)
     *i l'executa fins que escribim la paraula fi.
     *
     */
    public static void ExecutaPrograma(String comande )
    {

        String menu ="";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Per sortir del programa escriu fi");
        System.out.println();

        do {

            menu= teclado.next();

            if(!menu.equals("fi")) // Aquesta condició es perqué no ens retorni un valor quan escribim fi.
            {
                try
                {

                    java.lang.Process proceso = Runtime.getRuntime().exec(comande); //Executem el procès

                    BufferedReader bf = new BufferedReader(new InputStreamReader(proceso.getInputStream()));

                    System.out.println(homogenizarBuffer(bf));


                } catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }while(!menu.equals("fi")); // condició de sortida del bucle.
        teclado.close();
    }

    /**
     *
     * @param bf :
     * @return String : Depura el format del valor que retorna el BufferedReader
     *
     **/
    public static String homogenizarBuffer(BufferedReader bf)
    {
        String ex = "";
        try
        {
            ex= bf.readLine().toString().replace("value is ", ""); // Elimina el "value is"

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return ex;
    }

}

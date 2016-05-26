import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunTimeExample {


    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Calc... ");
        System.out.println();

        String comande ="C:\\Windows\\System32\\calc.exe";
        executeCmd(comande);

    }

    /**
     * Metode per executar comande.
     * @param comande Comanda a executar.
     */
    public static void executeCmd(String comande ){
        String sortida = null;

        try
        {
            java.lang.Process proceso = Runtime.getRuntime().exec(comande);
            InputStreamReader entrada = new InputStreamReader (proceso.getInputStream());
            BufferedReader br = new BufferedReader (entrada);

            if((sortida==br.readLine()))
            {
                System.out.println("Programa executat correctament");
            }else
                System.out.println("Programa no s'ha executat");


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

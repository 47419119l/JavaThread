package NotifyExample.Parking;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Coches extends Thread{
	
	int numeroCoches;
	Parking paking;
	static int placa;
	static String name ;
    static Parking parking;
        
    public Coches(Parking parking){
    
    	this.parking = parking;
    	name = getName();
    	
        
    }
    /**
     * Metode per agafar una pla�a.
     */
    public static void entrar() {
		for(int y =0; y < parking.parking.length;y++){
			if(!parking.parking[y]){
				parking.parking[y]=true;
				placa =y;
				System.out.println(name + "ha entrar a la pla�a" );
				break;
		
			}
		}
	}
    /**
     * Metode alliverar pla�a.
     */
    public static void sortir() {
		parking.parking[placa]=false;
		System.out.println(name + "ha sortit a la pla�a" );
		
	}
   
    public void run() {
    	
    	Semaphore semafor = new Semaphore(1);
        
    	Random rd = new Random();
    	int temps = rd.nextInt(15000);
    	
    	while(true){
    		try {
    			System.out.println(getName()+ "est� donanant voltes");
				Thread.sleep(temps);
				if(!parking.parkingPle()){
					
					entrar();
					parking.semafor.acquire();
					temps = rd.nextInt(15000);
					parking.semafor.release();
					sortir();
					
					if(!parking.parkingPle()){
						notify();
					}
				}else{
					
					while(parking.parkingPle()){
						System.out.println("Parking ple");
                        wait(); 
                    }
				}
			} catch (InterruptedException e) {
				System.out.println();
			}
    		
    	}
    	
    }
}

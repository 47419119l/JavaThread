package NotifyExample.Parking;

import java.util.concurrent.Semaphore;


/**
 * 
 * @author Sandra
 *
 */
public class Parking {
	
	int tamany;
	boolean[] parking ;
	Semaphore semafor ;
	public Parking(){
		
	}
		/**
		 * Constructor clase Parking
		 * @param tamany
		 */
	public Parking(int tamany) {
		this.tamany=tamany;
		this.parking = new boolean [tamany];
		 semafor = new Semaphore(tamany);
		
	}
	
	/**
	 * Metode per posar tot el parking Lliure.
	 */
	public  void parkingLliure(){
		for(int y =0; y < parking.length;y++){
			parking[y]=false;
		}
	}
	
	/**
	 * Metode per saber si el parking esta ple
	 * @return
	 */
	public boolean parkingPle(){
		boolean parkingPle =true;
		for(int y =0; y < parking.length;y++){
			if(parking[y]=false){
				parkingPle = false;
				break;
			}
		}
		return parkingPle;
	}
	
	
	
	
	
}

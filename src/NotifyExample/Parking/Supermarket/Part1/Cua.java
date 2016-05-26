
public class Cua {
	/* Aix� �s una prova */
	
	 private int numCaixes;
	 boolean [] caixes;
	 double tempsdecompramig;

	 
	 public Cua(int caixes){
		 numCaixes=caixes;
		 this.caixes=new boolean[numCaixes];
	 }
	 /**
	  * Metode per ocupar caixes
	  * @param tria_cua
	  */
	 public synchronized void ocuparCua(int tria_cua) {
		 
		if(!caixes[tria_cua]){
		 this.caixes[tria_cua]=true;// diem que la cua esta ocupada
		 
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 
	 }
	 /**
	  * Extreu el temps mig.
	  * @param temps
	  * @return
	  */
	 public int tempsMig(int temps){
		 
		 tempsdecompramig =+ (temps /2)/2;
		 return temps/2;
	 }
	 /**
	  * Metode per desocupar caixes.
	  * @param tria_cua
	  */
	 public synchronized void desocuparCua( int tria_cua ) {
		 this.caixes[tria_cua]=false; // diem que la cua esta desocupada
		 notify();// notifiquem del canvi.
	 }
	 /**
	  * Metode per extreure el numero de caixes.
	  * @return
	  */
	 public int getNumCaixes() {
		 return numCaixes;
	 }

}

package tp1_LosSherpas.main;



public abstract class LlenadorGeneral extends Thread {
	int tamanioMuestra;
	long tInicio;
	long tFinal;
	long tiempo;

	
	public LlenadorGeneral(int vTMuestra) {
		this.tamanioMuestra = vTMuestra;
	}
    
	@Override
	public void run() {}
	
	protected void Tiempo() {
		long millis = System.currentTimeMillis();
		 int hours   = (int) ((millis / (1000*60*60)) % 24);
		 int minutes = (int) ((millis / (1000*60)) % 60);
		 int seconds = (int) (millis / 1000) % 60 ;

		 System.out.println("Hora actual : " + hours + ":"+ minutes+":"+seconds);
	}
	
}

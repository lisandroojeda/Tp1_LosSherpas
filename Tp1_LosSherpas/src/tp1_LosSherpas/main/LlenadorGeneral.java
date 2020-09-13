package tp1_LosSherpas.main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;



public abstract class LlenadorGeneral extends Thread {
	int tamanioMuestra;
	long tInicio;
	long tFinal;
	long tiempo;
    JProgressBar progressbar;
    JLabel tiempoT;
    JLabel ciclos;
	
	public LlenadorGeneral(int vTMuestra,JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		this.tamanioMuestra = vTMuestra;
		this.progressbar = bar;
		this.tiempoT = tiempo;
		this.ciclos = ciclos;
		
	}
    
	@Override
	public void run() {}
	
	protected void Tiempo() {
		long millis = System.currentTimeMillis();
		 int hours   = (int) ((millis / (1000*60*60)) % 24);
		 int minutes = (int) ((millis / (1000*60)) % 60);
		 int seconds = (int) (millis / 1000) % 60 ;

		// System.out.println("Hora actual : " + hours + ":"+ minutes+":"+seconds);
	}
	
	protected String tiempoS(long tiempo) {
	//	long millis = System.currentTimeMillis();
		
		// int hours   = (int) ((tiempo / (1000*60*60)) % 24);
		// int minutes = (int) ((tiempo / (1000*60)) % 60);
		// int seconds = (int) (tiempo / 1000) % 60 ;
         int hours = (int) (tiempo/1000)%60;
		 return  hours + "seg";//+ //":"+ minutes+":"+seconds;
	}
	
	

	
}

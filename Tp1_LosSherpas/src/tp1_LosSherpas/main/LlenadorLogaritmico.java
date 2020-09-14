package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;
// ver----import com.google.common.base.Stopwatch;


public class LlenadorLogaritmico extends LlenadorGeneral  {
	
	public LlenadorLogaritmico(int vTMuestra,JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}
	
	
	@Override
	public void run() {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		progressbar.setMaximum(this.tamanioMuestra/2);
		for (int i= 1; i <= this.tamanioMuestra; i*= 2){
			count++;
			progressbar.setValue(i); //como avanza de dos en dos aumento en el progressbar de 2 en dos
			
			try {
				Thread.sleep(100);
				} catch (InterruptedException ex) {}
			
			
			ciclos.setText(count+"");
			ciclos.repaint();
			
			
			this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			this.tiempo = tFinal - tInicio;
			 

		    tiempoT.setText(nanoAhhmmss(this.tiempo));
			tiempoT.repaint();
			progressbar.repaint();
		}
	}
}

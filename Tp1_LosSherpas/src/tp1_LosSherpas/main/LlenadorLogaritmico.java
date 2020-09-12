package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;
// ver----import com.google.common.base.Stopwatch;


public class LlenadorLogaritmico extends LlenadorGeneral  {
	
	public LlenadorLogaritmico(int vTMuestra,JProgressBar bar,JLabel tiempo) {
		super (vTMuestra,bar,tiempo);
	}
	
	@Override
	public void run() {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		//progressbar.setMaximum(this.tamanioMuestra*this.tamanioMuestra);
		progressbar.setMaximum(this.tamanioMuestra/2);
		for (int i= 1; i <= this.tamanioMuestra; i*= 2){
			progressbar.setValue(i); //como avanza de dos en dos aumento en el progressbar de 2 en dos
			try {
				Thread.sleep(10);
				} catch (InterruptedException ex) {}
			this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			this.tiempo = tFinal - tInicio;
			tiempoT.setText("Crear cronometro");
			tiempoT.repaint();
			//count = count *count ;
			
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p1 logaritmica " + tiempo);
		System.out.println("Cantidad de apariciones p1 logaritmica = "+ count);
	}
}

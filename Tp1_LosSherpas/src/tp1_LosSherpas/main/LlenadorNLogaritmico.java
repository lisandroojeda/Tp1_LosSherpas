package tp1_LosSherpas.main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;



public class LlenadorNLogaritmico extends LlenadorGeneral  {
		
	public LlenadorNLogaritmico(int vTMuestra,JProgressBar bar,JLabel tiempo) {
		super (vTMuestra,bar,tiempo);
	}
	
	@Override
	public void run() {
		int count = 1;
		int cont2 = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		progressbar.setMaximum(this.tamanioMuestra*2);
		for (int i =1; i <=this.tamanioMuestra; i ++) {
		      for(int j = 1; j <= this.tamanioMuestra; j *= 2) 
				{
		    	  count++;	
					this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
					this.tiempo = tFinal - tInicio;
					tiempoT.setText("Crear cronometro");
					tiempoT.repaint();
				  try {
						Thread.sleep(10);
						} catch (InterruptedException ex) {}
				}
		      progressbar.setValue(cont2);
              cont2 = cont2 +3;

				progressbar.repaint();
			}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p3 n log n " + tiempo);
		System.out.println("Cantidad de apariciones p3 n log n = "+ count);
	}
}

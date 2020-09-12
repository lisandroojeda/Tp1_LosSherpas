package tp1_LosSherpas.main;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class LlenadorCuadratico extends LlenadorGeneral {

	public LlenadorCuadratico(int vTMuestra,JProgressBar bar,JLabel tiempo) {
		super (vTMuestra,bar,tiempo);
	}

	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		progressbar.setMaximum(this.tamanioMuestra);
		for(int i = 1; i <=this.tamanioMuestra; i++) { 
		      for(int j = 1; j <= this.tamanioMuestra; j++) 
				{
		    	  count++;
		    	  super.Tiempo();
		    		try {
						Thread.sleep(10);
						} catch (InterruptedException ex) {}
					this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
					this.tiempo = tFinal - tInicio;
					tiempoT.setText("Crear cronometro");
					tiempoT.repaint();
				}
		      progressbar.setValue(i);
			  progressbar.repaint();
		      super.Tiempo();
		      count++;
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p4 Cuadratica " + tiempo);
		System.out.println("Cantidad de apariciones p4 Cuadratica = "+ count);
	}
}

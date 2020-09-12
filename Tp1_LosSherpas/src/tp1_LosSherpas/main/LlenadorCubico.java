package tp1_LosSherpas.main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class LlenadorCubico extends LlenadorGeneral  {

	public LlenadorCubico(int vTMuestra, JProgressBar bar,JLabel tiempo) {
		super (vTMuestra,bar,tiempo);
	}
	
	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		progressbar.setMaximum(this.tamanioMuestra);
		for (int i= 1; i<=this.tamanioMuestra; i++) { 	
			for (int j= 1; j<=this.tamanioMuestra; j++) { 
		            for (int k=1; k<=this.tamanioMuestra; k++) 
					  {  
					    super.Tiempo();
					    try {
							Thread.sleep(5);
							} catch (InterruptedException ex) {}
			            super.Tiempo();
			    	   }
					this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
					this.tiempo = tFinal - tInicio;
					tiempoT.setText("Crear cronometro");
					tiempoT.repaint();
				}
			  progressbar.setValue(i); 
			  progressbar.repaint(); 
		      super.Tiempo();
		count ++;
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p5 Cubica " + tiempo);
		System.out.println("Cantidad de apariciones p5 Cubica= "+ count);
	}

}

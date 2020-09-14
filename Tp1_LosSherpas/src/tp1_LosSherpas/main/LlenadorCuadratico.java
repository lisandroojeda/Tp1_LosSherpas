package tp1_LosSherpas.main;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class LlenadorCuadratico extends LlenadorGeneral {

	public LlenadorCuadratico(int vTMuestra,JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}

	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); 
		progressbar.setMaximum(this.tamanioMuestra*this.tamanioMuestra);
		for(int i = 1; i <=this.tamanioMuestra; i++) { 
		      for(int j = 1; j <= this.tamanioMuestra; j++) 
				{
		    		try {
						Thread.sleep(100);
						} catch (InterruptedException ex) {}
		    		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
					this.tiempo = tFinal - tInicio;

   				  tiempoT.setText(nanoAhhmmss(this.tiempo));
				  tiempoT.repaint();
		    	  progressbar.setValue(count);
		    	  progressbar.repaint();
		    	  count++;
				}	    	 
	    	 // progressbar.setValue(i);	
	    		
	    		      
			  ciclos.setText(count+"");
			  ciclos.repaint();
							
			  
			  count++;
		}
	}
}

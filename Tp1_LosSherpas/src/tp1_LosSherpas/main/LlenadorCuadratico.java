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
		progressbar.setMaximum(this.tamanioMuestra);
		for(int i = 1; i <=this.tamanioMuestra; i++) { 
		      for(int j = 1; j <= this.tamanioMuestra; j++) 
				{
		    		
		    		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
					this.tiempo = tFinal - tInicio;

   				  tiempoT.setText(nanoAhhmmss(this.tiempo));
				  tiempoT.repaint();
		    	//  progressbar.setValue(i);
		    	//  progressbar.repaint();
		    	  count++;
				}
		      try {
					Thread.sleep(200);
					} catch (InterruptedException ex) {}
	    	  progressbar.setValue(i);	
	    	  progressbar.repaint();	
	    		      
			  ciclos.setText(count+"");
			  ciclos.repaint();
							
			  
			  count++;
		}
	}
}

package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class LlenadorCubico extends LlenadorGeneral  {

	public LlenadorCubico(int vTMuestra, JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}
	
	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); 
		progressbar.setMaximum(this.tamanioMuestra*this.tamanioMuestra*this.tamanioMuestra);
		for (int i= 1; i<=this.tamanioMuestra; i++) { 	
			for (int j= 1; j<=this.tamanioMuestra; j++) { 
		            for (int k=1; k<=this.tamanioMuestra; k++) 
					  {  
		            	progressbar.setValue(count);
		            	progressbar.repaint();
		            	count++;
				      	try {
				      		 Thread.sleep(10);
									} catch (InterruptedException ex) {}   
			    	   }
		            count++; 
				}
			  count++;

			  //progressbar.setValue(i); 

			  
			  ciclos.setText(count+"");
			  ciclos.repaint();
							
			  this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			  this.tiempo = tFinal - tInicio;
			  tiempoT.setText(this.tiempo+"");
			  tiempoT.repaint();
		      //progressbar.repaint();
			  count++;

		}
	}

}

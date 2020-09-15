package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;



public class LlenadorNLogaritmico extends LlenadorGeneral  {
		
	public LlenadorNLogaritmico(int vTMuestra,JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}
	
	@Override
	public void run() {
		int count = 1;

		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		progressbar.setMaximum(this.tamanioMuestra);
		for (int i =1; i <=this.tamanioMuestra; i ++) {
		      for(int j = 1; j <= this.tamanioMuestra; j *= 2) 
				{
		    	  count++;	
				}
		      try {
					Thread.sleep(100);
					} catch (InterruptedException ex) {}
		      progressbar.setValue(i);//cont2
          
  			  ciclos.setText(count+"");
			  ciclos.repaint();
							
			  this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			  this.tiempo = tFinal - tInicio;
			  tiempoT.setText(nanoAhhmmss(this.tiempo));
			  tiempoT.repaint();
		      progressbar.repaint();
				count++;
			}
	}
}

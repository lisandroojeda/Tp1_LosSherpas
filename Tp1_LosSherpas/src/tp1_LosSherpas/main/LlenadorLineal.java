package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class LlenadorLineal extends LlenadorGeneral  {
		
		public LlenadorLineal(int vTMuestra,JProgressBar progressBar,JLabel tiempo,JLabel ciclos) {
			super (vTMuestra,progressBar,tiempo,ciclos);
		}
		 
		@Override
		public void run() {
			int count = 1;
			this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
			progressbar.setMaximum(this.tamanioMuestra);
			for(int i=1; i<=this.tamanioMuestra; i++) {
				progressbar.setValue(i);
				
				try {
					Thread.sleep(50);
					} catch (InterruptedException ex) {}
				
				
				ciclos.setText(count+"");
				ciclos.repaint();
				
				
				this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
				this.tiempo = tFinal - tInicio;
			//	tiempoT.setText(this.tiempo+"");
			    tiempoT.setText(nanoAhhmmss(this.tiempo));
				tiempoT.repaint();
				progressbar.repaint();
				count++;
			}
		}
}

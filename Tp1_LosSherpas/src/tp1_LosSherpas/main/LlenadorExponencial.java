package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class LlenadorExponencial extends LlenadorGeneral {

	public LlenadorExponencial(int vTMuestra, JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}

	@Override
	public void run() {
		int valor;
		this.tInicio = System.nanoTime();
		int tamanio = (int)Math.pow(this.tamanioMuestra, this.tamanioMuestra);
		JOptionPane.showMessageDialog(null,tamanio, "Error", JOptionPane.INFORMATION_MESSAGE);

		progressbar.setMaximum(tamanio);
		valor = exponencial(this.tamanioMuestra);
	
		
	}
	
	private int  exponencial(int muestra) {
      int resultado;
      int count=1;
		if (muestra == 1) {
			resultado =1;
		}
		else {
			 try {
	      		 Thread.sleep(100);
						} catch (InterruptedException ex) {}   
			 progressbar.setValue(count);
			 progressbar.repaint();
			 this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			 this.tiempo = tFinal - tInicio;
			 tiempoT.setText(this.tiempo+"");
			 tiempoT.repaint();

			 count++;	
			 resultado= exponencial(muestra-1)+exponencial(muestra-1);
			 ciclos.setText(count+"");
    		 ciclos.repaint();
			 // JOptionPane.showMessageDialog(null,count, "Error", JOptionPane.INFORMATION_MESSAGE);
						
		}
	 return resultado;	
	}
}

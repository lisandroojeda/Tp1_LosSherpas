package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class LlenadorExponencial extends LlenadorGeneral {

	public LlenadorExponencial(int vTMuestra, JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		
		this.tInicio = System.nanoTime();
		int tamanio = (int)Math.pow(3, this.tamanioMuestra);
		//JOptionPane.showMessageDialog(null,tamanio, "Error", JOptionPane.INFORMATION_MESSAGE);


		int i=1;
		progressbar.setMaximum(tamanio);
		exponencial(i, tamanio);

		
		
	}
	
	private void exponencial(int i, int tamanio) {
    
		if (i < tamanio ) {
			 try {
	      		 Thread.sleep(50);
						} catch (InterruptedException ex) {}   
			
			 this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			 this.tiempo = tFinal - tInicio;
			 tiempoT.setText(nanoAhhmmss(this.tiempo));
			 tiempoT.repaint();
			 
    		 i++;
			int p=(int)Math.floorDiv(i*100, tamanio);
			 progressbar.setValue(p);
			 progressbar.repaint();
			 ciclos.setText(i+"");
    		 ciclos.repaint();
			exponencial(i,tamanio);
			exponencial(i,tamanio);
			 try {
	      		 Thread.sleep(10000);
						} catch (InterruptedException ex) {}   
			
			 // JOptionPane.showMessageDialog(null,count, "Error", JOptionPane.INFORMATION_MESSAGE);
						
		}
    	  
    	  }
		
	}
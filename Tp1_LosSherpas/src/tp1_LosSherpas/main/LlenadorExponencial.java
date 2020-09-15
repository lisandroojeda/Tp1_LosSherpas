package tp1_LosSherpas.main;


import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class LlenadorExponencial extends LlenadorGeneral {
	public LlenadorExponencial(int vTMuestra, JProgressBar bar,JLabel tiempo,JLabel ciclos) {
		super (vTMuestra,bar,tiempo,ciclos);
	}
	int contador = 1;

	@Override
	public void run() {
		
		this.tInicio = System.nanoTime();
		int tamanio = (int)Math.pow(2, this.tamanioMuestra);
		//JOptionPane.showMessageDialog(null,tamanio, "Error", JOptionPane.INFORMATION_MESSAGE);



		progressbar.setMaximum(tamanio);
		tamanio = this.tamanioMuestra;
		Hanoi(tamanio,1,2,3);
		
		
		
	}
	
	 public void Hanoi(int n, int origen,  int auxiliar, int destino){
		  if(n==1) {
			progressbar.setValue(contador);  
		  }
		  else{
			  try {
		      		 Thread.sleep(50);
							} catch (InterruptedException ex) {}  
			  this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			  	this.tiempo = tFinal - tInicio;
			    tiempoT.setText(nanoAhhmmss(this.tiempo));
			  	tiempoT.repaint(); 
			 ciclos.setText(contador+"");
			 ciclos.repaint();
			 contador++;
		     Hanoi(n-1, origen, destino, auxiliar);
		     this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			  	this.tiempo = tFinal - tInicio;
			    tiempoT.setText(nanoAhhmmss(this.tiempo));
			  	tiempoT.repaint();
		     contador++;
		   		     Hanoi(n-1, auxiliar, origen, destino);
		   }
		 }
		
	}
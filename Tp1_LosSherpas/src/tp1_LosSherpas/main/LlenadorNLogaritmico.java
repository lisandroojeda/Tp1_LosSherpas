package tp1_LosSherpas.main;

import javax.swing.JFrame;



public class LlenadorNLogaritmico extends LlenadorGeneral  {
		
	public LlenadorNLogaritmico(int vTMuestra,JFrame vInterfaz) {
		super (vTMuestra,vInterfaz);
	}
	
	@Override
	public void run() {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		for (int i = 2*this.tamanioMuestra; i >= 0; i -= 3) {
		      for(int j = 1; j <= this.tamanioMuestra*this.tamanioMuestra*this.tamanioMuestra; j *= 2) 
				{
		    	  count++;
				}
			}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p3 n log n " + tiempo);
		System.out.println("Cantidad de apariciones p3 n log n = "+ count);
	}
}

package tp1_LosSherpas.main;

import javax.swing.JFrame;

public class LlenadorExponencial extends LlenadorGeneral {

	public LlenadorExponencial(int vTMuestra,JFrame vInterfaz) {
		super (vTMuestra,vInterfaz);
	}

	@Override
	public void run() {
		int count;
		this.tInicio = System.nanoTime();
		count = exponencial(this.tamanioMuestra);
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p6 Exponencial " + tiempo);
		System.out.println("Cantidad de apariciones p6 Exponencial = "+ count);
				
		
	}
	
	private int  exponencial(int muestra) {
		int count =0;
		if (muestra == 1) {
			count = 1; //dibujar una linea del vaso
	        return count;
		}
		else {
			  count = count + exponencial(muestra -1); 
			  return count;
		}
	}
}

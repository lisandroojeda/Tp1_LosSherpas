package tp1_LosSherpas.main;

import javax.swing.JFrame;



public class LlenadorLogaritmico extends LlenadorGeneral  {
	
	public LlenadorLogaritmico(int vTMuestra,JFrame vInterfaz) {
		super (vTMuestra,vInterfaz);
	}
	
	@Override
	public void run() {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		for (int i= 1; i <= this.tamanioMuestra; i*= 2){
			//System.out.println("Proceso2");
			count= i;
			super.Tiempo();
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p1 logaritmica " + tiempo);
		System.out.println("Cantidad de apariciones p1 logaritmica = "+ count);
	}
}

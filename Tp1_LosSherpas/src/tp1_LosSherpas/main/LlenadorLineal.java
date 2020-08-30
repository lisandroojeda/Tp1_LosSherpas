package tp1_LosSherpas.main;

import javax.swing.JFrame;

public class LlenadorLineal extends LlenadorGeneral  {
		
		public LlenadorLineal(int vTMuestra) {
			super (vTMuestra);
		}
		 
		@Override
		public void run() {
			int count = 1;
			this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
			for(int i=0; i<=this.tamanioMuestra; i++) {
				count++;
				super.Tiempo();
				//System.out.println("Proceso1");
			//	try { //detiene el hilo por 50 milisegundos
			//		Thread.sleep(50);
			//	}catch(Exception e) {}
			}
			this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
			this.tiempo = tFinal - tInicio;
			System.out.println("Tiempo de ejecución en milisegundos: p2 Lineal " + tiempo);
			System.out.println("Cantidad de apariciones p2 Lineal= "+ count);
		}
}

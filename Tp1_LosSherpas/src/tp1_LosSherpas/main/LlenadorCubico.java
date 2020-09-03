package tp1_LosSherpas.main;

import javax.swing.JFrame;

public class LlenadorCubico extends LlenadorGeneral  {

	public LlenadorCubico(int vTMuestra,JFrame vInterfaz) {
		super (vTMuestra,vInterfaz);
	}
	
	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		for (int i= 1; i<=this.tamanioMuestra; i++) { 
		      for (int j= this.tamanioMuestra; j>=1; j--) {
		            for (int k=0; k<this.tamanioMuestra; k++) 
					  {  
		            	//System.out.println("Proceso4");
			    	    count++;
			    	    super.Tiempo();
			    	   }
		            super.Tiempo();
		          count++;  
				}
		      super.Tiempo();
		count ++;
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p5 Cubica " + tiempo);
		System.out.println("Cantidad de apariciones p5 Cubica= "+ count);
	}

}

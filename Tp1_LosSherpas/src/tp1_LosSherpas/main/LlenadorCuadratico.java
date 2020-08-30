package tp1_LosSherpas.main;

public class LlenadorCuadratico extends LlenadorGeneral {

	public LlenadorCuadratico(int vTMuestra) {
		super (vTMuestra);
	}

	@Override
	public void run () {
		int count = 1;
		this.tInicio = System.nanoTime(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
		for(int i = this.tamanioMuestra/2; i <=this.tamanioMuestra; i++) { 
		      for(int j = 1; j <= this.tamanioMuestra/3; j+=2) 
				{
		    	   //System.out.println("Proceso3");
		    	  count++;
		    	  super.Tiempo();
				}
		      super.Tiempo();
		      count++;
		}
		this.tFinal = System.nanoTime(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
		this.tiempo = tFinal - tInicio;
		System.out.println("Tiempo de ejecución en milisegundos: p4 Cuadratica " + tiempo);
		System.out.println("Cantidad de apariciones p4 Cuadratica = "+ count);
	}
}

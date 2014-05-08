package prop.domini;

import prop.domini.Llibre;

public class Assignacio {

	 private Llibre llibre;
	 private nodo nodo;
	 
	 /**Constructora per defecte**/
	 
	 public Assignacio(Llibre llibre, nodo nodo) {
			
			this.llibre = llibre;
			this.nodo = nodo;
	}
	 
	 
	 /**Consultora del node llibre
	    *
	    * @return el valor de llibre
	    */
	 public Llibre getLlibre() {
		return llibre;
	}
	 /**Modificadora del Llibre llibre
	    *
	    * @param llibre
	    */
	public void setLlibre(Llibre llibre) {
		this.llibre = llibre;
	}
	
	/**Consultora del node nodo
    *
    * @return el valor de nodo
    */
	public nodo getNodo() {
		return nodo;
	}
	
	/**Modificadora del node nodo
    *
    * @param nodo
    */
	public void setNodo(nodo nodo) {
		this.nodo = nodo;
	}

	

	
}

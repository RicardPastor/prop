package prop.domini;

public class Llibreria extends ConjuntoNodos {
	protected int prestatges;
	protected int ubicacions;
	
	/**Constructora por defecto
    *
    * @param prestatges N�mero de prestatges de la llibreria. 
    * @param ubicacions  N�mero d'ubicacions de la llibreria.
    */
	
	public Llibreria(int prestatges, int ubicacions)  {
		super();
		this.prestatges = prestatges;
		this.ubicacions = ubicacions;
		
	}
	
	 /**Consultora del par�metre prestatges.
    *
    * @return  els prestatges que t� la llibreria.

    */
	
	public int getPrestatges(){
		return prestatges;
	}
	
	 /**Consultora del par�metre ubicacions.
    *
    * @return  les ubicacions que cont� la llibreria.

    */
	
	public int getUbicacions(){
		return ubicacions;
	}
	
	/**Modificadora del par�metre prestatges de la llibreria
	    * 
	    * @param prestatges   nou n�mero de prestatges.
	    */
		
	public void setPrestatges(int prestatges){
		this.prestatges = prestatges;
	}
	
	/**Modificadora del par�metre ubicacions de la llibreria
	    * 
	    * @param ubicacions   nou n�mero d'ubicacions. 
	    */

	public void setUbicacions(int ubicacions){
		this.ubicacions = ubicacions;
	}
	
	
	
}

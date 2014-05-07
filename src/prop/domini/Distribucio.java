package prop.domini;
import prop.domini.Llibre;



public class Distribucio {
	private int num;
	private Llibre[][] distribucio;
	
	
	
	/**Constructora por defecto
    *
    * @param num Indica el numero de distribucio. 
    * @param n  Numero d'ubicacions de la distribucio.
    * @param np Numero de prestatges de la distribucio.
    */
	
	public Distribucio(int num, int n, int np) {
		this.setNum(num);
		this.distribucio = new Llibre[np][n/np];
		
	}
	
	
	/**Afegeix una assignaci� a la distribuci�
	    * 
	    * @param as Assignaci� que s'afegeix a la distribuci�. 
	    */
	public void AfegirAssignacio(Assignacio as){
		
	}
	
	/**Mostra la Distribuci� de les assignacions
    * 
    * 
    */
	
	public void mostrarDistribucio() {
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				System.out.println(distribucio[i][j]+" "+i+" "+j);
			}
		}
	}
	

	
	
	
	/**Edita la distribuci�, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editarAssignacions(Assignacio as1, Assignacio as2)  {
		
	}
	
	 /**Consultora del par�metre num.
    *
    * @return    el valor que t� num.

    */

	public int getNum() {
		return num;
	}

	/**Modificadora del par�metre num de la distribuci�
	    * 
	    * @param num  el nou n�mero de la distribuci�
	    */
	public void setNum(int num) {
		this.num = num;
	}
	
}

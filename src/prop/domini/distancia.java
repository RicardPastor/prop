package prop.domini;

public class distancia extends distanciaCluster {
	private double[][] matriuDistancia;
	
	public distancia(int n) {
		matriuDistancia = new double[n][n];
	}
	
	public void setDistancia(int i, int j, double dis) {
		matriuDistancia[i][j] = dis;
	}
	
	public double 
}
package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.CtrlDistribucions;
import prop.domini.Assignacio;
import prop.domini.Distribucio;
import prop.domini.Llibre;
import prop.domini.nodo;

public class DriverCtrlDistribucions {
	private static void menu() {
		System.out.println("Escull una opci�:");
        System.out.println(" 1) Afegir Distribuci� ");
        System.out.println(" 2) Consulta Distribuci� ");
        System.out.println(" 3) Esborra Distribuci� ");
        System.out.println(" 4) Modifica Distribuci� ");

        System.out.println(" 5) Sortir ");
	}
	
	
	public static void main (String[] args) {
		
		System.out.println("Driver CtrlDistribucio");
		CtrlDistribucions ctrldis = new CtrlDistribucions();
		ctrldis.inicialitzarDistribucions();		
		System.out.println("Introdueix el n�mero d'ubicacions que hi ha i el n�mero de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		int numllibres = in.nextInt();
		Distribucio dis = new Distribucio(0, numllibres, in.nextInt());
		for(int i = 0; i < numllibres; ++i) {
			System.out.println("Introdueix les dades de la seguent ubicacio");
		System.out.println("Afegeix la ubicacio(x, y):");
		nodo no = new nodo(in.nextInt(), in.nextInt());
		
		System.out.print("Introdueix una ISBN(int): ");
		int id = in.nextInt();
		in.nextLine();
		System.out.print("Introdueix Titol (String): ");
		String titol = in.nextLine();
		System.out.print("Introdueix Autor (String): ");
		String autor = in.nextLine();
		System.out.print("Introdueix Editorial (String): ");
		String edi = in.nextLine();
		System.out.print("Introdueix Any (int): ");
		int any = in.nextInt();
		in.nextLine();
		System.out.print("Introdueix Categoria (String): ");
		String cat = in.nextLine();
		Llibre lli = new Llibre(id, titol, autor, edi, any, cat);
		Assignacio ass = new Assignacio(lli, no);
		dis.afegirAssignacio(ass);
		
		}
		ctrldis.afegirDistribucio(dis);
		
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println("Introdueix  el n�mero d'ubicacions que hi ha i el n�mero de prestatges de la llibreria)");
					 numllibres = in.nextInt();
					dis = new Distribucio(0, numllibres, in.nextInt());
				
					for(int i = 0; i < numllibres; ++i) {
						System.out.println("Introdueix les dades de la seguent ubicacio");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no1 = new nodo(in.nextInt(), in.nextInt());
					System.out.print("Introdueix una ISBN(int): ");
					int id = in.nextInt();
					in.nextLine();
					System.out.print("Introdueix Titol (String): ");
					String titol = in.nextLine();
					System.out.print("Introdueix Autor (String): ");
					String autor = in.nextLine();
					System.out.print("Introdueix Editorial (String): ");
					String edi = in.nextLine();
					System.out.print("Introdueix Any (int): ");
					int any = in.nextInt();
					in.nextLine();
					System.out.print("Introdueix Categoria (String): ");
					String cat = in.nextLine();
					Llibre lli1 = new Llibre(id, titol, autor, edi, any, cat);
					Assignacio ass1 = new Assignacio(lli1, no1);
					dis.afegirAssignacio(ass1);
					
					}
					ctrldis.afegirDistribucio(dis);
					
					break;
			
				case 2: 
					
					System.out.print("Introdueix el num de la distribucio:");
					ctrldis.consultarDistribucio(in.nextInt());
					
					
					
					break;	
					
					
				case 3:
					
					System.out.print("Introdueix el num de la distribucio a eliminar:");
					ctrldis.deleteDistribucio(in.nextInt());
					
					break;
				case 4: 
					/*System.out.println("edita assignacions");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no2 = new nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre(ISBN, Titol, Autor, Editorial, Any, Categoria :");
					Llibre lli2 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass2 = new Assignacio(lli2, no2);
					System.out.println("Afegeix la ubicacio de la 2(x, y):");
					nodo no3 = new nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre 2(ISBN, Titol, Autor, Editorial, Any, Categoria :");

					Llibre lli3 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass3 = new Assignacio(lli3, no3);
					dis.afegirAssignacio(ass2);
					dis.afegirAssignacio(ass3);
					ctrldis.add(dis);
					dis.editarAssignacions(ass2, ass3);*/
					System.out.print("Introdueix numero (int): ");
					int numero = in.nextInt();
					System.out.print("Introdueix isbn llibre1 (int): ");
					int isbn1 = in.nextInt();
					System.out.print("Introdueix isbn llibre2 (int): ");
					int isbn2 = in.nextInt();
					ctrldis.modificarDistribucio(numero, isbn1, isbn2);
					
					break;
				
					
	
					
				
					
				case 5: 
					surt = true;
					break;
			}			
		}
	       
	     
		in.close();
	
	}
	}
	


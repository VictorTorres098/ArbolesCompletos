package abPackage;

public class Main {

	public static void main(String[] args) {
		
		AB<Integer> arbol = new AB<Integer>();
		
		System.out.println(arbol.cantNodos());
		
		arbol.agregar(1);
		arbol.agregar(2);
		arbol.agregar(3);
		arbol.agregar(4);
		arbol.agregar(5);
		
		System.out.println(arbol.cantNodos());
		
		System.out.println(arbol.cantHojas());
		
		System.out.println(arbol.balanceado());
		
		
		
		
		

	}

}

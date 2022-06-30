package abPackage;

public class AB<T> {
	protected Nodo<T> raiz;
	
	public AB() {
		
	}
	public void agregar(T elem) {
		Nodo<T> nuevo = new Nodo<T>(elem);
		if(raiz == null)
			raiz = nuevo;
		else
			agregar(raiz, nuevo);
	}
	private void agregar(Nodo<T> actual, Nodo<T> nuevo) {
		if(actual.getIzq() == null)
			actual.setIzq(nuevo);
		else if(actual.getDer() == null)
			actual.setDer(nuevo);
		else
			agregar(actual.getDer(), nuevo); //el arbol se genera a la der
	}
	
	public boolean pertenece(T elem) {
		return pertenece(raiz, elem);
	}
	private boolean pertenece(Nodo<T> nodo, T elem) {
		if(nodo == null) //caso base
			return false;
		else if(nodo.getInfo().equals(elem))
			return true;
		else
			return pertenece(nodo.getIzq(), elem) || pertenece(nodo.getDer(), elem);
	}
	
	public int altura() {
		return altura(raiz);
	}
	
	private int altura(Nodo<T> nodo) {
		if(nodo == null)
			return 0;
		else
			return 1 + Math.max(altura(nodo.getIzq()), altura(nodo.getDer())); 
	}
	
	public int cantNodos() {
		return cantNodos(raiz);
	}
	
	private int cantNodos(Nodo<T> nodo) {
		if(nodo == null)
			return 0;
		else
			return 1 + (cantNodos(nodo.getIzq()) + cantNodos(nodo.getDer()) );
	}
	
	public int cantHojas() {
		return canthojas(raiz);
	}
	private int canthojas(Nodo<T> nodo) {
		if(nodo == null)
			return 0;
		else if(nodo.getDer() == null && nodo.getIzq() == null)
			return 1;
		else
			return canthojas(nodo.getDer()) + canthojas(nodo.getIzq());  
	}
	//la complejidad de balanceado es O(n2)
	public boolean balanceado() {
		if(raiz == null)
			return true;
		else
			return balanceado(raiz);
	}
	private boolean balanceado(Nodo<T> nodo) {
		boolean ret = true;
		int altIzq = 0;
		int altDer = 0;
		
		if(nodo.getIzq() != null) {
			altIzq = altura(nodo.getIzq());
			ret = ret && balanceado(nodo.getIzq());
		}
			
		if(nodo.getDer() != null) {
			altDer = altura(nodo.getDer());
			ret = ret && balanceado(nodo.getDer());
		
		}	
		ret = ret && Math.abs(altIzq - altDer) <= 1;
		
		return ret;
	}
	
	
}

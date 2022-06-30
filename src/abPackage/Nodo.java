package abPackage;

public class Nodo<T>{
	private T info; //info del nodo 
	private Nodo<T> izq, der; //sus hijos izq y der
	
	public Nodo(T elem) {
		info = elem;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T newInfo) {
		this.info = newInfo;
	}
	public Nodo<T> getIzq(){
		return izq;
	}
	public void setIzq(Nodo<T> izq){
		this.izq = izq;
	}
	public Nodo<T> getDer(){
		return der;
	}
	public void setDer(Nodo<T> der) {
		this.der = der;
	}
	

}

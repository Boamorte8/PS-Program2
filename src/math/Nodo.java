package math;

public class Nodo {
	private float dato1;
	private float dato2;
	private Nodo siguiente;
	
	@SuppressWarnings("null")
	public Nodo(){
//		dato1 = (Float) null;
//		dato2 = (Float) null;
		siguiente = null;
	}
	
	public Nodo(float dato1, float dato2){
		this.dato1 = dato1;
		this.dato2 = dato2;
		siguiente = null;
	}
	
	public float getDato1() {
		return dato1;
	}

	public void setDato1(float dato1) {
		this.dato1 = dato1;
	}

	public float getDato2() {
		return dato2;
	}

	public void setDato2(float dato2) {
		this.dato2 = dato2;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}

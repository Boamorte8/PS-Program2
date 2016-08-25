package math;

public class LinkedList {
	private Nodo cabeza;
	private int listsize;
	
	public LinkedList(){
		cabeza = new Nodo();
		listsize = 0;
	}
	
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public int getListsize() {
		return listsize;
	}
	public void setListsize(int listsize) {
		this.listsize = listsize;
	}
	
	
}

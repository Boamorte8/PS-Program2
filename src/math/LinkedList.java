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
	
	public void addNodo(Nodo nodo)
	{
		Nodo actual=cabeza;		
		while(actual.getSiguiente()!=null)
		{
			actual=actual.getSiguiente();
		}	
		actual.setSiguiente(nodo);
		incrementListsize();
	}
	
	public Boolean delete(float dato1, float dato2){
		Nodo anterior;
		Nodo actual;
		if(cabeza.getSiguiente()==null)
		{
			return false;
		}	
		anterior=cabeza;
		actual=cabeza.getSiguiente();		
		do{
			if(actual.getDato1()==dato1 && actual.getDato2()==dato2)
			{
				if(actual.getSiguiente()==null)
				{
					anterior.setSiguiente(null);
				}
				else
				{
				anterior.setSiguiente(actual.getSiguiente());	
				anterior=actual;
				actual=actual.getSiguiente();
				}
				decrementListsize();
				return true;
			}
		} while(actual.getSiguiente()!=null);
		return false;
	}
	
	public int getListsize() {
		return listsize;
	}
	
	public void incrementListsize() {
		this.listsize++;
	}
	
	public void decrementListsize() {
		this.listsize--;
	}
	
}

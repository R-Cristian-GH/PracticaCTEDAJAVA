package TP2;
import java.util.LinkedList;

public class Cola<T>
{
	private LinkedList<T> datos = new LinkedList<T>();

	public void encolar(T elem) {
		this.datos.add(elem);
	}

	public T desencolar() {
		T temp =this.datos.get(0);
		this.datos.remove(0);
		return temp;
	}
	
	public T tope() {
		return this.datos.get(0); 
	}
	
	public Boolean esVacia() {
		return this.datos.size() == 0;
	}
}

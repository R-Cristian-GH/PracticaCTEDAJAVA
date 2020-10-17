package TP1;

import java.util.ArrayList;

public class Cola<T>
{

	
	private ArrayList<T> datos = new ArrayList<T>();

	public void encolar(T elem) {
		this.datos.add(elem);
	}

	public T desencolar() {
		T temp = this.datos.get(0);
		this.datos.remove(0);
		return temp;
	}
	
	public T tope() {
		return this.datos.get(0); 
	}
	
		public boolean esVacia() {
			return this.datos.size() == 0;
		}
	}
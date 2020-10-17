package TP1;

import java.util.ArrayList;

public class NodoGeneral<T>
{
	private T dato;
	private ArrayList<NodoGeneral<T>> hijos;
	
	public NodoGeneral(T dato){		
		this.dato = dato;
		this.hijos = new ArrayList<NodoGeneral<T>>();
	}

	public T getDato(){		
		return this.dato; 
	}
	
	public ArrayList<NodoGeneral<T>> getHijos(){		
		return this.hijos;
	}

	public void setDato(T dato){		
		this.dato = dato;
	}
	
	public void setHijos(ArrayList<NodoGeneral<T>> hijos){		
		this.hijos = hijos;
	}

}

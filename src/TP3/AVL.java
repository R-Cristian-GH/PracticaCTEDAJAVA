package TP3;
import java.util.Comparator;

public class AVL implements Comparable<AVL>{
	
	private Comparable dato;
	private AVL hijoIzquierdo;
	private AVL hijoDerecho;
	private int altura;
	
	public AVL(Comparable dato){
		this.dato = dato;
	}
	
	public Comparable getDatoRaiz(){
		return this.dato;
	}
	
	public AVL getHijoIzquierdo(){
		return this.hijoIzquierdo;
	}
	
	public AVL getHijoDerecho(){
		return this.hijoDerecho;
	}

	public void agregarHijoIzquierdo(AVL hijo){
		this.hijoIzquierdo=hijo;
	}

	public void agregarHijoDerecho(AVL hijo){
		this.hijoDerecho=hijo;
	}
	
	public void eliminarHijoIzquierdo(){
		this.hijoIzquierdo=null;
	}
	
	public void eliminarHijoDerecho(){
		this.hijoDerecho=null;
	}
	
	public void agregar(Comparable elem) 
	{
		switch(elem.compareTo(this.getDatoRaiz())) 
		{
		case 1:
			
			break;
		case 0:
			break;
		case -1:
			break;
		}
	}
	

	public void rotacionSimpleDerecha() 
	{
		
	}
	
	public void rotacionSimpleIzquierda() {
	
	}
	
	public void rotacionDobleDerecha() {
	
	}
	
			
	public void rotacionDobleIzquierda() {
	
	}

	@Override
	public int compareTo(AVL arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

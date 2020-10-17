package TP3;
import java.util.Comparator;

public class ArbolBinarioBusqueda implements Comparable<ArbolBinarioBusqueda> 
{
	
	private Comparable dato;
	private Comparable raiz;
	private ArbolBinarioBusqueda hijoIzquierdo;
	private ArbolBinarioBusqueda hijoDerecho;
    

    public ArbolBinarioBusqueda(Comparable dato){
		this.dato = dato;
		//this.raiz = this.dato;
	}
	
	
	public Comparable getDatoRaiz(){
		return this.dato;
	}
	
	public ArbolBinarioBusqueda getHijoIzquierdo(){
		return this.hijoIzquierdo;
	}
	
	public ArbolBinarioBusqueda getHijoDerecho(){
		return this.hijoDerecho;
	}
	
	public void agregarHijoIzquierdo(ArbolBinarioBusqueda hijo){
		this.hijoIzquierdo=hijo;
	}

	public void agregarHijoDerecho(ArbolBinarioBusqueda hijo){
		this.hijoDerecho=hijo;
	}
	
	public void eliminarHijoIzquierdo(){
		this.hijoIzquierdo=null;
	}
	
	public void eliminarHijoDerecho(){
		this.hijoDerecho=null;
	}

	public boolean esVacio()
	{
		return this.raiz == null;
	}

	public boolean esHoja()
	{
		return this.raiz != null && this.getHijoIzquierdo()==null && this.getHijoDerecho()==null;
	}

	public void agregar(Comparable elem)
	{
        switch (elem.toString().compareTo(this.getDatoRaiz().toString()))//comparo el elemto a agregar(elemto B) con el elemento raiz(elemento A)
        {                                          //el CompareTo me devuelve mayor a cero en caso de que el elemento B sea mayor
			                                       //menor a cero en caso de que sea menor, cero en caso de que sea igual a el elemento A
			case 1:       //en caso de que el elemto a agregar sea mayor a la raiz
                if (hijoDerecho==null)
				{
					agregarHijoDerecho(new ArbolBinarioBusqueda(elem));
					System.out.println("padre: " + this.getDatoRaiz().toString() + " ; hijo derecho: " + getHijoDerecho().getDatoRaiz().toString());
				}
                else
                {
					hijoDerecho.agregar(elem);
                }
				
				break;
			case -1:      //en caso de que el elemento a agregar sea menor a la raiz
				if (hijoIzquierdo == null)
				{
					agregarHijoIzquierdo(new ArbolBinarioBusqueda(elem));
					System.out.println("padre: " + this.getDatoRaiz().toString() + " ; hijo izquierdo: " + getHijoIzquierdo().getDatoRaiz().toString());
				}
				else
				{
					hijoIzquierdo.agregar(elem);
				}
				break;
			default:
					break;
		}
	}
	
	public boolean incluye(Comparable elem)
	{
		boolean resul = false;
		switch (elem.toString().compareTo(this.getDatoRaiz().toString()))//comparo el elemto a agregar(elemto B) con el elemento raiz(elemento A)
		{                                          //el CompareTo me devuelve mayor a cero en caso de que el elemento B sea mayor
												   //menor a cero en caso de que sea menor, cero en caso de que sea igual a el elemento A
			case 1:
				{
					hijoDerecho.incluye(elem);
					break;
				}
			case -1:
                {
					hijoIzquierdo.incluye(elem);
					break;
                }
			case 0:       //en caso de que el elemto a agregar ya este en el arbol
				{
					System.out.println("el elemento: "+ elem.toString()+ ", elemento ya se encuentra en el arbol");
					System.out.println("por favor ingrese otro elemento");
					resul = true;
					break;
				}

			default:    
				break;
		}
		return resul;
	}


	public void preorden() 
	{
        if (this!=null)
        {
        	System.out.println(this.getDatoRaiz().toString());
			if(this.getHijoIzquierdo()!=null)
				this.getHijoIzquierdo().preorden();
			if(this.getHijoDerecho()!=null)
				this.getHijoDerecho().preorden();
        }
	}
	
	public void inorden() 
	{
		if (this != null)
		{
			if (this.getHijoIzquierdo() != null) 
				this.getHijoIzquierdo().preorden();
			
			System.out.println(this.getDatoRaiz().toString());
			
			if (this.getHijoDerecho() != null)
				this.getHijoDerecho().preorden();
		}
	}
	
	public void postorden() {
		//llamada recursiva en hijo izquierdo
		if (!this.getHijoIzquierdo().esVacio())
			this.getHijoIzquierdo().postorden();
		{

		}
		//llamada recursiva en hijo derecho
		if (!this.getHijoDerecho().esVacio())
		{
			this.getHijoDerecho().postorden();
		}
		//por ultimo procesamos la raiz
		System.out.println(this.getDatoRaiz());
	}


	@Override
	public int compareTo(ArbolBinarioBusqueda arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
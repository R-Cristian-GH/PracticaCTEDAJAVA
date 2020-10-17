package TP1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolGeneral<T>
{
	
	private NodoGeneral<T> raiz;

	public ArbolGeneral(T dato) {
		this.raiz = new NodoGeneral<T>(dato);
	}

	private ArbolGeneral(NodoGeneral<T> nodo) {
		this.raiz = nodo;
	}

	private NodoGeneral<T> getRaiz() {
		return raiz;
	}

	public T getDatoRaiz() {
		return this.getRaiz().getDato();
	}

	public ArrayList<ArbolGeneral<T>> getHijos() {
		ArrayList<ArbolGeneral<T>> temp= new ArrayList<ArbolGeneral<T>>();
		for(var element : this.raiz.getHijos()) {
			temp.add(new ArbolGeneral<T>(element));
		}
		return temp;
	}

	public void agregarHijo(ArbolGeneral<T> hijo) {
		this.raiz.getHijos().add(hijo.getRaiz());
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		this.raiz.getHijos().remove(hijo.getRaiz());
	}

	public boolean esVacio() {
		return this.raiz == null;
	}

	public boolean esHoja() {
		return this.raiz != null && this.getHijos().size() == 0;
	}

	public void preorden()
    {
		System.out.println(this.getDatoRaiz().toString()+" ; ");
        for(ArbolGeneral<T> hijo : this.getHijos())
		{
			hijo.preorden();
        }			
    }

	public void inOrden()
    {
		for(ArbolGeneral<T> arbolAux : this.getHijos())
        {
			arbolAux.inOrden();
            if (arbolAux.getHijos()==null)
            {
				System.out.println(arbolAux.getDatoRaiz().toString()+" ; ");
				this.inOrden();
            }

        }

    }

	public void postOrden()
    {
		for(ArbolGeneral<T> arbolAux : this.getHijos())
		{
			arbolAux.postOrden();
		}
		System.out.println(this.getDatoRaiz().toString() + " ; ");
	}

	public void porNiveles()
    {
		Cola<ArbolGeneral<T>> cola = new Cola<ArbolGeneral<T>>(); //
		ArbolGeneral<T> arbolA;

		cola.encolar(this);

        while (!cola.esVacia())
        {
			arbolA = cola.desencolar();
			System.out.println(arbolA.getDatoRaiz());
            if (!arbolA.esHoja())
            {
				cola.encolar(arbolA);
            }
        }
    }
//EJERCICIO 4A	
	public int altura()
	{
		int contA=-1;//contador de altura

		/* PRUEBA
		int dato =1;
		if (this.getDatoRaiz().Equals(dato))
        {
			Console.WriteLine(dato);
        }*/
		if (this.esHoja()==true)
		{
			return contA + 1;
			}
		else
		{
			for(var element : this.getHijos())
			{
				if (element.altura()>contA)
				{
					contA = element.altura();
				}
				element.altura();
				
			}
			contA++;             
		}
		return contA++;
	}

//EJERCICIO 4B	
	
	public int nivel(int i) 
	{
		int a = -1;	
		if (this.getDatoRaiz().equals(i))
		{
			return a+1;
		}
		else
		{
			for(var element : this.getHijos()) 
			{
				a=element.nivel(i);
			}
			a++;
			}
		return a;
		}

//EJERCICIO 4C	
	public int ancho()
	{
        //Cola<ArbolGeneral<T>> c = new Cola<ArbolGeneral<T>>(); //instanciamos cola

        if (this.esHoja())
        {
			return 1; // si es hoja, ancho = 1
        }

		Queue<ArbolGeneral<T>> cola = new LinkedList<ArbolGeneral<T>>();
		cola.add(this); //encolamos arbol
		int maxCantidadNivel = 0;
        while (cola.size() != 0) //mientras la cola no este vacia
        {
			int cantidadNiveles = cola.size();
			if(cantidadNiveles > maxCantidadNivel)
            {
				maxCantidadNivel = cantidadNiveles;
            }
            while (cantidadNiveles-- >0)
            {
				ArbolGeneral<T> arbol = cola.poll();
                for(ArbolGeneral<T> hijo : arbol.getHijos())
                {
					cola.offer(hijo);
                }
            }
		}
		
		return maxCantidadNivel;
	}

//EJERCICIO 5
}
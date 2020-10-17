package TP2;

public class Program {

	public static <T> void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArbolBinario<T> arbolA=new ArbolBinario(50);
		ArbolBinario<T> arbolB=new ArbolBinario(56);
		ArbolBinario<T> arbolC=new ArbolBinario(1);
		ArbolBinario<T> arbolD=new ArbolBinario(25);
		ArbolBinario<T> arbolE=new ArbolBinario(17);
		ArbolBinario<T> arbolF=new ArbolBinario(46);
		ArbolBinario<T> arbolG=new ArbolBinario(35);
		
		arbolA.agregarHijoIzquierdo(arbolB);
		arbolA.agregarHijoDerecho(arbolC);
		arbolB.agregarHijoIzquierdo(arbolD);
		arbolB.agregarHijoDerecho(arbolE);
		arbolC.agregarHijoIzquierdo(arbolF);
		arbolC.agregarHijoDerecho(arbolG);
		System.out.println("Recorrido PreOrden ");
		arbolA.preorden();
		System.out.println("Recorrido Inorden");
		arbolA.inorden();
		System.out.println("Recorrido PostOrden");
		arbolA.postorden();
		System.out.println("fin del programa...");

	}

}

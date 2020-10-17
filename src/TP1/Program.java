package TP1;

public class Program {

	public static <T> void main(String[] args) {
		ArbolGeneral<T> arbolA = new ArbolGeneral(10);
		ArbolGeneral<T> arbolB = new ArbolGeneral(20);
		ArbolGeneral<T> arbolC = new ArbolGeneral(30);
		ArbolGeneral<T> arbolD = new ArbolGeneral(40);
		ArbolGeneral<T> arbolE = new ArbolGeneral(50);
		ArbolGeneral<T> arbolF = new ArbolGeneral(60);
		ArbolGeneral<T> arbolG = new ArbolGeneral(14);
		ArbolGeneral<T> arbolH = new ArbolGeneral(25);
		ArbolGeneral<T> arbolI = new ArbolGeneral(1);
		ArbolGeneral<T> arbolJ = new ArbolGeneral(6);
		ArbolGeneral<T> arbolK = new ArbolGeneral(45);
		
		arbolA.agregarHijo(arbolB);
		arbolA.agregarHijo(arbolC);
		arbolA.agregarHijo(arbolK);
		arbolB.agregarHijo(arbolJ);
		arbolB.agregarHijo(arbolF);
		arbolB.agregarHijo(arbolD);
		arbolC.agregarHijo(arbolI);
		arbolC.agregarHijo(arbolH);
		arbolD.agregarHijo(arbolG);
		arbolD.agregarHijo(arbolE);
		
		System.out.println("la altura del arbol General es: "+ arbolA.altura());
		//System.out.println("el nivel en el que se encuentra el arbol "+arbolB.getDatoRaiz().toString()+ " es: "+ arbolA.nivel(6));
		System.out.println("el ancho del arbol es: " + arbolA.ancho());
		arbolA.nivel(20);
		/*System.out.println("Recorrido por niveles: ");
		arbolA.porNiveles();
		System.out.println("Recorrido Pre-orden:");
		arbolA.preorden();
		System.out.println("Recorrido In-orden");
		arbolA.inOrden();
		System.out.println("Recorrido Pos-torden");
		arbolA.postOrden();*/
		// TODO Auto-generated method stub

	}

}

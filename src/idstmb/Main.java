package idstmb;
import java.math.*;
/*
Universidad Autónoma de Baja California Sur 
Departamento Académico de Sistemas Computacionales
Ingieneria en Desarrollo de Software
Fabian Lombardo Green Vizcarra
4rto Semestre
Métodos Numéricos IDS 2026-I IDS TM 2026-I
 */

public class Main {

	//funcion f(x) 
	public static double f(double x) {
		//variables para el metodo de biseccion
		double g=9.81;
		double m=68.1;
		int t=10;
		int v=40;
		double resultado=0.0;
		int i=0;
		
		resultado=((m * g) / x) * (1 - Math.pow(Math.E,(-((x / m) * t)) )) - v;
		
		return resultado;
	}
	//formula para calcular el xr en un metodo aparte para evitar la redundancia entre formulas
	public static double xr(double xl, double xu) {
		return (xl+xu)/2;
	}
	//formula para calcular el Ea% en un metodo aparte para evitar la redundancia entre formulas
	public static double ea(double xr, double xrAnterior) {
		
		double ea=((xr-xrAnterior)/xr)*100;
		if(ea<0) {
			ea=(ea*-1);
		}
		return ea;
	}
	
	//Aqui se ejecutaran los metodos anteriores en conjunto para crear la tabla
	public static void tablaMetodoBiseccion(double xl, double xu) {

		//declaracion de variables
		double xr=0.0;
		double ea=100.0;
		double fxl=0.0;
		double fxu=0.0;
		double fxr=0.0;
		double xrAnterior=0.0;
		int i=1;
		
		//formulas en la primera iteracion ejecutandose...
		System.out.println("|    i    |    xl      |    xu      |    xr      |           f(xl)         |         f(xu)           |         f(xr)             |    Ea%    |");
		fxl=f(xl);
		fxu=f(xu);
		xr=xr(xl,xu);
		fxr=f(xr);
		xrAnterior=xr;
		System.out.println("|    "+i+"    |"+"    "+xl+"     |"+"    "+xu+"    |"+"    "+xr+"    |"+"    "+fxl+"    |"+"    "+fxu+"    |"+"    "+fxr+"    |"+"    "+ea+"%    |");
		
		//ciclo que se ejecuta hasta que ea sea menor 1
		do {
			i++;
			xrAnterior=xr;
			//sentencia que evalua de que lado se situa la raiz
			if((f(xl)*f(xr))<0) {
				xu=xr;
				fxu=fxr;
				xr=xr(xl,xu);
				fxr=f(xr);
				ea=ea(xr,xrAnterior);
			}else {
				xl=xr;
				fxl=fxr;
				xr=xr(xl,xu);
				fxr=f(xr);
				ea=ea(xr,xrAnterior);
			}
			System.out.println("|    "+i+"    |"+"    "+xl+"    |"+"    "+xu+"    |"+"    "+xr+"    |"+"    "+fxl+"    |"+"    "+fxu+"    |"+"    "+fxr+"    |"+"    "+ea+"%    |");
		}while(ea>1.0);
		System.out.println();
		System.out.println("Fabian Lombardo Green Vizcarra");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valores iniciales
		double xl=4;
		double xu=20;

		tablaMetodoBiseccion(xl,xu);
		
	}
	
}

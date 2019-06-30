package EjercicioFiguras;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Figuras> figuras = new ArrayList<Figuras>();
    static Scanner entrada = new Scanner(System.in);
	
    public static void main(String[] args) {
                llenarFiguras();
                mostrarResultados();
	
	}
	public static void llenarFiguras() {
		int opcion;	
		char respuesta;
		do {
			do {
				System.out.println("\tMENU");
			    System.out.println("Digite que figura desea: ");
			    System.out.println("1. Triángulo escaleno");
			    System.out.println("2. Cuadrado");
			    System.out.println("3. Circulo");
			    System.out.println("Opción: ");
			    opcion=entrada.nextInt();
			}while(opcion<1 || opcion>3);
		switch(opcion) {
		case 1:llenarTriangulo() ;
			break;
		case 2:llenarCuadrado();
			break;
		case 3:llenarCirculo();
			break;
		}
		System.out.println("\nDesea ingresar otra Figura [S(si)-N(no)]?: ");
		respuesta=entrada.next().charAt(0);
		System.out.println();
		} while(respuesta=='s' || respuesta=='S');
    }
	
	public static void llenarTriangulo() {
		double lado1,lado2,lado3;
		System.out.print("\nIngrese el lado 1 del triangulo: ");
		lado1= entrada.nextDouble();
		System.out.print("Ingrese el lado 2 del triangulo: ");
		lado2= entrada.nextDouble();
		System.out.print("Digite el lado 3 del triangulo: ");
		lado3= entrada.nextDouble();
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		figuras.add(triangulo);
	}
	
	public static void llenarCuadrado() {
		double lado1;
		System.out.print("\nDigite un lado del cuadrado: ");
		lado1= entrada.nextDouble();
		Cuadrado cuadrado = new Cuadrado(lado1);
		figuras.add(cuadrado);
	}
	
	public static void llenarCirculo() {
		double lado1;
		System.out.print("\nDigite el diámetro del circulo: ");
		lado1= entrada.nextDouble();
		Circulo circulo = new Circulo(lado1);
		figuras.add(circulo);
		
	}
	public static void mostrarResultados() {
		for(Figuras figu: figuras) {
		System.out.print("\n ");
		System.out.print(figu.toString());
		System.out.print("\nArea: "+figu.area());
		System.out.print("\n ");
	}
	}
	
	}

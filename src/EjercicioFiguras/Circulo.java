package EjercicioFiguras;

public class Circulo extends Figuras {
	private double lado1;

	public Circulo(double lado1) {
		super(1);
		this.lado1 = lado1;
	}

	public double getLado1() {
		return lado1;
	}

	@Override
	
	public String toString() {
		return "Circulo: \n" + super.toString() + "\nlado1= " + lado1;
	}

	@Override
	
	public double area() {
		double p = lado1 / 2;
		return (p * p) * 3.14;
	}

}

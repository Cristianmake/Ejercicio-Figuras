package EjercicioFiguras;

public abstract class Figuras {
	protected int numeroLados;

	public Figuras(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	
	public String toString() {
		return "Numero Lados= " + numeroLados;
	}
    
	public abstract double area(); // Declaramos el método área como abstracto

}

package EjercicioFiguras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PruebasTest {

	@Test
	public void testAreaTriangulo() {
		Triangulo triangulo = new Triangulo(1.22, 1.01, 0.66);
		assertEquals(0.3331997289539715,triangulo.area());
	}
	@Test
	public void testAreaCuadrado() {
		Cuadrado cuadrado = new Cuadrado(4.5);
		assertEquals(20.25, cuadrado.area());
	}
	@Test
	public void testAreaCirculo() {
		Circulo circulo = new Circulo(5.67);
		assertEquals(25.2368865, circulo.area());
	}
	@Test
	public void MostrarDatosCirculo() {
		Circulo circulo = new Circulo(5.67);
		assertEquals(3,circulo.getNumeroLados());
	}
}

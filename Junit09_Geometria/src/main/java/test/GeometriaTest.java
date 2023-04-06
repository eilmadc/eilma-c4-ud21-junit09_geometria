/**
 * C4-UD21-Elena López
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * @author elena-01
 *
 */
class GeometriaTest {

	
	Geometria geo;
	/*
	 * @BeforeAll public static void testbeforeGeometria{
	 * System.out.println("beforeClass"); }
	 */
	
	
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
		geo = new Geometria();
	}
	
	
	//CUADRADO
	@Test
	public void testareaCuadrado() {
		System.out.println("testareaCuadrado()");
		int result = geo.areacuadrado(7);
		int esperado = 49;
		assertEquals(esperado, result);
	}
	
	//CIRCULO
	@Test
	public void testareaCirculo() {
		System.out.println("testareaCirculo()");
		double result = geo.areaCirculo(7);
		double esperado = 153.9384;
		assertEquals(esperado, result, 0.0010);
	}
	
	//TRIANGULO
	@Test
	public void testareaTriangulo() {
		System.out.println("testareatriangulo()");
		int result = Math.round(geo.areatriangulo(7, 5));
		int esperado = 17;
		assertEquals(esperado, result);
	}
	

	//RECTANGULO
	@Test
	public void testareaRectangulo() {
		System.out.println("testareaRectangulo()");
		int result = geo.arearectangulo(7,5);
		int esperado = 35;
		assertEquals(esperado, result);
	}
	
	
	//PENTAGONO
	@Test
	public void testareaPentagono() {
		System.out.println("testareaPentagono()");
		int result = Math.round(geo.areapentagono(7,5));
		int esperado = 17;
		assertEquals(esperado, result);
	}
	
	
	@Test
	public void testareaRombo() {
		System.out.println("testareaRombo()");
		int result = Math.round(geo.arearombo(7,5));
		int esperado = 17;
		assertEquals(esperado, result);
	}
	
	@Test
	public void testareaRomboide() {
		System.out.println("testareaRomboide()");
		int result = geo.arearomboide(7,5);
		int esperado = 35;
		assertEquals(esperado, result);
	}
	
	@Test
	public void testareaTrapecio() {
		System.out.println("testareaTrapecio()");
		int result = Math.round(geo.areatrapecio(7,5,3));
		int esperado = 18;
		assertEquals(esperado, result);
	}
	
	
	@AfterEach
	public void after() {
		System.out.println("after()");
		//geo.clear();
	}
	
	
	
	/*
	 * @AfterAll public static void afterClass{ System.out.println("afterClass"); }
	 */
	
	
	

}
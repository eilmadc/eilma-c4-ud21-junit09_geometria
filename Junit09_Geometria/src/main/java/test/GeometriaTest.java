/**
 * C4-UD21-Elena López
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import JUnit.Junit09_Geometria.dto.Geometria;

/**
 * @author elena-01
 *
 */

@TestInstance(Lifecycle.PER_METHOD)
class GeometriaTest {

	static Geometria geo;
	
	
	  @BeforeAll
	  public static void testbeforeGeometria(){
	  System.out.println("beforeClass"); }
	 

	@BeforeEach
	public void before() {
		System.out.println("Before");
		geo = new Geometria();
	}

	@Test
	public void testGeometria1() {
		System.out.println("Constructor con id: 1");
		geo = new Geometria(1);
		assertEquals(1,geo.getId() );
	}
	
	
	@Test
	public void testGeometria2() {
		System.out.println("Constructor con id: 2");
		geo = new Geometria(2);
		assertEquals(2,geo.getId() );
	}
	
	@Test
	public void testGeometria3() {
		System.out.println("Constructor con id: 3");
		geo = new Geometria(3);
		assertEquals(3,geo.getId() );
	}
	
	@Test
	public void testGeometria4() {
		System.out.println("Constructor con id: 4");
		geo = new Geometria(4);
		assertEquals(4,geo.getId() );
	}
	
	@Test
	public void testGeometria5() {
		System.out.println("Constructor con id: 5");
		geo = new Geometria(5);
		assertEquals(5,geo.getId() );
	}
	
	@Test
	public void testGeometria6() {
		System.out.println("Constructor con id: 6");
		geo = new Geometria(6);
		assertEquals(6,geo.getId() );
	}
	
	@Test
	public void testGeometria7() {
		System.out.println("Constructor con id: 7");
		geo = new Geometria(7);
		assertEquals(7,geo.getId() );
	}
	
	@Test
	public void testGeometria8() {
		System.out.println("Constructor con id: 8");
		geo = new Geometria(8);
		assertEquals(8,geo.getId() );
	}
	
	@Test
	public void testGeometria9() {
		System.out.println("Constructor con id: 9 fuera de case");
		geo = new Geometria(9);
		assertEquals(9,geo.getId() );
	}
	
	
	// CUADRADO
	@Test
	public void testareaCuadrado() {
		System.out.println("testareaCuadrado()");
		int result = geo.areacuadrado(7);
		int esperado = 49;
		assertEquals(esperado, result);
	}

	// CIRCULO
	@Test
	public void testareaCirculo() {
		System.out.println("testareaCirculo()");
		double result = geo.areaCirculo(7);
		double esperado = 153.9384;
		assertEquals(esperado, result, 0.0010);
	}

	// TRIANGULO
	@Test
	public void testareaTriangulo() {
		System.out.println("testareatriangulo()");
		int result = Math.round(geo.areatriangulo(7, 5));
		int esperado = 17;
		assertEquals(esperado, result);
	}

	// RECTANGULO
	@Test
	public void testareaRectangulo() {
		System.out.println("testareaRectangulo()");
		int result = geo.arearectangulo(7, 5);
		int esperado = 35;
		assertEquals(esperado, result);
	}

	// PENTAGONO
	@Test
	public void testareaPentagono() {
		System.out.println("testareaPentagono()");
		int result = Math.round(geo.areapentagono(7, 5));
		int esperado = 17;
		assertEquals(esperado, result);
	}

	@Test
	public void testareaRombo() {
		System.out.println("testareaRombo()");
		int result = Math.round(geo.arearombo(7, 5));
		int esperado = 17;
		assertEquals(esperado, result);
	}

	@Test
	public void testareaRomboide() {
		System.out.println("testareaRomboide()");
		int result = geo.arearomboide(7, 5);
		int esperado = 35;
		assertEquals(esperado, result);
	}

	@Test
	public void testareaTrapecio() {
		System.out.println("testareaTrapecio()");
		int result = Math.round(geo.areatrapecio(7, 5, 3));
		int esperado = 18;
		assertEquals(esperado, result);
	}

	
	  @Test 
	  public void testSetId() { 
		  geo.setId(2);
		  assertEquals(2,geo.getId()); }
	 
	
	@Test
	public void testGetNom() {
		geo.setNom("Circulo");
		assertEquals("Circulo", geo.getNom() );
	}
	
	@Test
	public void testGetArea() {
		geo.setArea(3);
		assertEquals(3 , geo.getArea(), 0.0001 );
	}
	
	
	@Test
	public void testToString() {
		geo.areacuadrado(2);
		String esperado= "Geometria [id=9, nom=Default, area=0.0]";
		String respuesta = geo.toString();
		System.out.println(respuesta);
		System.out.println("toString ()");
		assertEquals(esperado,respuesta);
	}
	
	
	  @AfterEach public void after() 
	  { System.out.println("after()"); 
	  //geo.clear();
	  }
	 


	@AfterAll
	  public static void afterClass()
	{
		System.out.println("afterClass");
	}

}
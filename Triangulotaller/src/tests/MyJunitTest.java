package tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import taller1.TallerIS;

public class MyJunitTest {
	@Test
	public void myFirstTest() {
		System.out.println("My first Test");
	}
	
	@Test
	public void esEquilatero() {
		 assertEquals("Equilateral",TallerIS.TriangleType(3, 3, 3));
	}
	
	@Test
	public void esIsoceles() {
		 assertEquals("Isoceles",TallerIS.TriangleType(5, 5, 7));
	}
	
	@Test
	public void fueraDeRangoInferior() {
		 assertFalse(TallerIS.cehckRanges(0, 0, 0));
	}
		
	
	@Test
	public void rangoSuperior() {
		 assertTrue(TallerIS.cehckRanges(200, 200, 200));
	}
	

	@Test
	public void fueraDeRangoSuperior() {
		 assertFalse(TallerIS.cehckRanges(200, 0, 4));
	}
	
	
	
	@Test
	public void esTrianguloNegativo() {
		 assertEquals("Isoceles",TallerIS.TriangleType(-2, -2, -2));
	}
	
//	@Test
//	public void caracterInvalido() {
	//	try {
		//	assertEquals("Input inv�lido",TallerIS.TriangleType(4,5,=));
		//}catch{
		//	System.out.println("Input inv�lido")
		//}
		
	//}
	
	@Test
	public void NoEsTriangulo() {
		assertEquals("Not a Triangle",TallerIS.TriangleType(200,1,1));
	}
	
	@Test
	public void EsEscaleno() {
		assertEquals("Scalene",TallerIS.TriangleType(2,3,4));
	}
	
	
}

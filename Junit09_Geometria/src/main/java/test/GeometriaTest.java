package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	Geometria geo;
	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
	}
	@Test
	public void testAreacuadrado() {
		int ac = geo.areacuadrado(3);
		int res = 9;
		assertEquals(ac,res);
	}
	@Test
	void testGeometria() {
		geo = new Geometria();
		int id = geo.getId();
		String nom = geo.getNom();
		assertEquals(id,9);
		assertEquals(nom,"Default");
		//fail("Not yet implemented");
	}
	@Test
	void testGeometriaInt() {
		geo = new Geometria(2);
		int id = geo.getId();
		String nom = geo.getNom();
		assertEquals(id,2);
		assertEquals(nom,"Circulo");
	}
	@Test
	void testAreaCirculo() {
		double ac =geo.areaCirculo(5);
		double tac = Math.PI * Math.pow(5, 2);
		double delta = 0.001;
		assertEquals(ac,tac,delta);
	}

	@Test
	void testAreatriangulo() {
		double at = geo.areatriangulo(2, 3);
		double tat = (2*3)/2;
		assertEquals(at,tat);
	}

	@Test
	void testArearectangulo() {
		double ar = geo.arearectangulo(2, 3);
		double tar = 2*3;
		assertEquals(ar,tar);
	}

	@Test
	void testAreapentagono() {
		double ap = geo.areapentagono(2, 3);
		double tap = (2*3)/2;
		assertEquals(ap,tap);
	}

	@Test
	void testArearombo() {
		double ar = geo.arearombo(2, 3);
		double tar = (2*3)/2;
		assertEquals(ar,tar);
	}

	@Test
	void testArearomboide() {
		double ar = geo.arearomboide(2, 3);
		double tar = 2*3;
		assertEquals(ar,tar);
	}

	@Test
	void testAreatrapecio() {
		double at = geo.areatrapecio(2, 3, 4);
		double tat = ((2+3)/2)*4;
		assertEquals(at,tat);
	}

	@Test
	void testFigura() {
		String fig = geo.figura(1);
		assertEquals(fig,"cuadrado");
		fig = geo.figura(2);
		assertEquals(fig,"Circulo");
		fig = geo.figura(3);
		assertEquals(fig,"Triangulo");
		fig = geo.figura(4);
		assertEquals(fig,"Rectangulo");
		fig = geo.figura(5);
		assertEquals(fig,"Pentagono");
		fig = geo.figura(6);
		assertEquals(fig,"Rombo");
		fig = geo.figura(7);
		assertEquals(fig,"Romboide");
		fig = geo.figura(8);
		assertEquals(fig,"Trapecio");
		fig = geo.figura(0);
		assertEquals(fig,"Default");
		
		
	}

	@Test
	void testGetId() {
		int id = geo.getId();
		int tid = 9;
		assertEquals(id,tid);
	}

	@Test
	void testSetId() {
		geo.setId(6);
		int id = geo.getId();
		int tid = 6;
		assertEquals(id,tid);
	}

	@Test
	void testGetNom() {
		String nom = geo.getNom();
		String tnom = "Default";
		assertEquals(nom,tnom);
	}

	@Test
	void testSetNom() {
		geo.setNom("Triangulo");
		String nom = geo.getNom();
		String tnom = "Triangulo";
		assertEquals(nom,tnom);
	}

	@Test
	void testGetArea() {
		geo.setArea(2);
		double a = geo.getArea();
		double ta = 2;
		assertEquals(a,ta);
	}

	@Test
	void testSetArea() {
		geo.setArea(2);
		double a = geo.getArea();
		double ta = 2;
		assertEquals(a,ta);
	}

	@Test
	void testToString() {
		geo.setArea(1);
		String st = geo.toString();
		String tst = "Geometria [id=" + 9 + ", nom=" + "Default" + ", area=" + 1.0 + "]";
		assertEquals(st,tst);
	}
	

}

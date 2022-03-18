package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {

	AutoGuma ag;

	@BeforeEach
	void setUp() throws Exception {
		ag = new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		ag = null;
	}

	@Test
	void testAutoGuma() {
		assertEquals(null, ag.getMarkaModel());
		assertEquals(ag.getPrecnik(), -1);
		assertEquals(ag.getSirina(), -1);
		assertEquals(ag.getVisina(), -1);
	}

	@Test
	@DisplayName("testiranje konstruktora sa cetiri parametra")
	void testAutoGumaStringIntIntInt() {
		ag = new AutoGuma("Marka", 16, 188, 30);

		assertEquals("Marka", ag.getMarkaModel());
		assertEquals(ag.getPrecnik(), 16);
		assertEquals(ag.getSirina(), 188);
		assertEquals(ag.getVisina(), 30);
	}

	@Test
	void testSetMarkaModel() {
		ag.setMarkaModel("Model1");
		assertEquals("Model1", ag.getMarkaModel());
	}

	@Test
	void testSetMarkaModelJeNull() {
		assertThrows(java.lang.NullPointerException.class, () -> ag.setMarkaModel(null));
	}

	@Test
	void testSetMarkaModelDuzinaManjaOdDozvoljenog() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setMarkaModel("Mo"));
	}

	@Test
	void testSetPrecnik() {
		ag.setPrecnik(21);
		assertEquals(21, ag.getPrecnik());
	}

	@Test
	void testSetPrecnikVeciOdDozvoljenog() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setPrecnik(290000));
	}

	@Test
	void testSetPrecnikManjiOdDozvoljenog() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setPrecnik(2));
	}

	@Test
	void testSetSirina() {
		ag.setSirina(147);
		assertEquals(147, ag.getSirina());
	}

	@Test
	void testSetSirinaManjaOdDozvoljene() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setSirina(1));
	}

	@Test
	void testSetSirinaVecaOdDozvoljene() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setSirina(333333));
	}

	@Test
	void testSetVisina() {
		ag.setVisina(33);
		assertEquals(33, ag.getVisina());
	}

	@Test
	void testSetVisinaVecaOdDozvoljene() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setVisina(999));
	}

	@Test
	void testSetVisinaManjaOdDozvoljene() {
		assertThrows(java.lang.IllegalArgumentException.class, () -> ag.setVisina(7));
	}

	@Test
	void testToString() {
		ag.setMarkaModel("Marka");
		ag.setPrecnik(19);
		ag.setSirina(177);
		ag.setVisina(55);

		String s = ag.toString();

		assertTrue(s.contains("Marka"));
		assertTrue(s.contains("19"));
		assertTrue(s.contains("177"));
		assertTrue(s.contains("55"));
	}

	@ParameterizedTest
	@CsvSource({ 
		"Model1,20,140,70,Model1,20,140,70,true", 		"Model1,20,140,70,Model1,20,140,80,false",
		"Model1,20,140,70,Model1,20,150,70,false", 		"Model1,20,140,70,Model1,21,140,70,false",
		"Model1,20,140,70,Model2,20,140,70,false",
		"Model1,20,140,70,Model1,20,141,71,false",
		"Model1,20,140,70,Model1,21,140,71,false",
		"Model1,20,140,70,Model2,20,140,71,false",
		"Model1,20,140,70,Model1,21,141,70,false",
		"Model1,20,140,70,Model2,20,141,70,false",
		"Model1,20,140,70,Model2,21,140,70,false",
		"Model1,20,140,70,Model1,21,141,71,false",
		"Model1,20,140,70,Model2,20,141,71,false",
		"Model1,20,140,70,Model2,21,141,70,false",
		"Model1,20,140,70,Model2,21,141,71,false",
		
	})
	void testEqualsObject(String markaModel1, int precnik1, int sirina1, int visina1, String markaModel2, int precnik2,
			int sirina2, int visina2, boolean equals) {

		ag.setMarkaModel(markaModel1);
		ag.setPrecnik(precnik1);
		ag.setSirina(sirina1);
		ag.setVisina(visina1);
		
		AutoGuma ag2=new AutoGuma();
		ag2.setMarkaModel(markaModel2);
		ag2.setPrecnik(precnik2);
		ag2.setSirina(sirina2);
		ag2.setVisina(visina2);
		
		assertEquals(equals,ag.equals(ag2));
		
	}

}

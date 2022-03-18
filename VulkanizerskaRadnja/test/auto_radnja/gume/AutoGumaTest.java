package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AutoGumaTest {

	AutoGuma ag;
	@BeforeEach
	void setUp() throws Exception {
		ag=new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		ag=null;
	}

	
	
	@Test
	void testAutoGuma() {
		assertEquals(null, ag.getMarkaModel());
		assertEquals(ag.getPrecnik(), -1);
		assertEquals(ag.getSirina(),-1);
		assertEquals(ag.getVisina(), -1);
	}

	@Test
	@DisplayName("testiranje konstruktora sa cetiri parametra")
	void testAutoGumaStringIntIntInt() {
		ag=new AutoGuma("Marka",13,20,30);
		
		assertEquals("Marka", ag.getMarkaModel());
		assertEquals(ag.getPrecnik(),10);
		assertEquals(ag.getSirina(),20);
		assertEquals(ag.getVisina(), 30);
	}

	@Test
	void testSetMarkaModel() {
		ag.setMarkaModel("Model1");
		assertEquals("Model1", ag.getMarkaModel());
	}
	
	@Test
	void testSetMarkaModelJeNull() {
		assertThrows(java.lang.NullPointerException.class,()->ag.setMarkaModel(null));
	}
	
	@Test
	void testSetMarkaModelDuzinaManjaOd3() {
		assertThrows(java.lang.IllegalArgumentException.class, ()->ag.setMarkaModel("Mo"));
	}

	@Test
	void testSetPrecnik() {
		ag.setPrecnik(21);
		assertEquals(21, ag.getPrecnik());
	}
	
	@Test
	void testSetPrecnikVanOpsegaSaGreskom() {
		assertThrows(java.lang.IllegalArgumentException.class,()->ag.setPrecnik(290000));
	}
	

	@Test
	void testSetSirina() {
		fail("Not yet implemented");
	}

	@Test
	void testSetVisina() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

}

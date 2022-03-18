package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest {

	protected Radnja radnja;
	
	@Test
	void testDodajGumu() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		radnja.dodajGumu(ag);
		
		assertEquals(1, radnja.vratiSveGume());
		assertEquals(ag, radnja.vratiSveGume().get(0));
	}

	@Test
	void testPronadjiGumu() {
		fail("Not yet implemented");
	}

	@Test
	void testVratiSveGume() {
		fail("Not yet implemented");
	}

}

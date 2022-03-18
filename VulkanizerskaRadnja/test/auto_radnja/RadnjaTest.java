package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

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
		
		assertEquals(1, radnja.vratiSveGume().size());
		assertEquals(ag, radnja.vratiSveGume().get(0));
	}
	
	@Test
	void testDodajViseGuma() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		AutoGuma ag1=new AutoGuma();
		ag1.setMarkaModel("Marka");
		ag1.setPrecnik(15);
		ag1.setSirina(190);
		ag1.setVisina(49);
		
		radnja.dodajGumu(ag);
		radnja.dodajGumu(ag1);
	
		assertEquals(2, radnja.vratiSveGume().size());
		assertTrue(radnja.vratiSveGume().contains(ag1));
		assertTrue(radnja.vratiSveGume().contains(ag));
	}
	
	@Test
	void testDodajGumuDuplikat() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		AutoGuma ag1=new AutoGuma();
		ag1.setMarkaModel("Marka");
		ag1.setPrecnik(14);
		ag1.setSirina(189);
		ag1.setVisina(46);
		
		radnja.dodajGumu(ag);
	
		Exception e = assertThrows(java.lang.RuntimeException.class,
				()->radnja.dodajGumu(ag1) );
		assertEquals(e.getMessage(), "Guma vec postoji");
	}
	
	
	
	@Test
	void testNullGumu() {
		assertThrows(java.lang.NullPointerException.class,
				() -> radnja.dodajGumu(null) );
	}
	
	

	@Test
	void testPronadjiGumu() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		radnja.dodajGumu(ag);
		List<AutoGuma> pronadjene=new LinkedList<AutoGuma>();
		pronadjene=radnja.pronadjiGumu("Marka");
		assertEquals(ag, pronadjene.get(0));
	}
	
	@Test
	void testPronadjiGumuMarkaJeNull() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		radnja.dodajGumu(ag);
		List<AutoGuma> pronadjene=new LinkedList<AutoGuma>();
		pronadjene=radnja.pronadjiGumu(null);
		assertEquals(null, pronadjene);
	}

	@Test
	void testVratiSveGume() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("Marka");
		ag.setPrecnik(14);
		ag.setSirina(189);
		ag.setVisina(46);
		
		radnja.dodajGumu(ag);
		assertEquals(1, radnja.vratiSveGume().size());
		assertTrue(radnja.vratiSveGume().contains(ag));
	}

}

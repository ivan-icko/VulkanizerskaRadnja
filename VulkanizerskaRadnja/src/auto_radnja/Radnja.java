package auto_radnja;

import java.util.List;
import auto_radnja.gume.AutoGuma;


/**
 * Interfejs Radnja
 * Sadrzi metode dodajGumu(), pronadjiGumu() i vratiSveGume()
 * @author Ivan
 * @version 1.0
 *
 */
public interface Radnja {
	
	/**
	 * Dodaje novu gumu unetu kao parametar metode
	 * @param a AutoGuma
	 */
	void dodajGumu(AutoGuma a);

	
	/**
	 * Pretrazuje AutoGume prema markaModelui vraca listu objekata klase AutoGuma
	 * @param markaModel AutoGume
	 * @throws java.lang.NullPointerException ako je uneta guma null
	 * @throws java.lang.RuntimeException ako guma vec postoji
	 * @return Listu AutoGuma lista
	 */
	List<AutoGuma> pronadjiGumu(String markaModel);

	/**
	 * Vraca listu svih AutoGuma
	 * @return Listu AutoGuma
	 */
	List<AutoGuma> vratiSveGume();
}
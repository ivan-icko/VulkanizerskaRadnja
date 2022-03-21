package auto_radnja;

import java.util.List;
import java.util.LinkedList;
import auto_radnja.gume.AutoGuma;


/**
 * Klasa VulkanizerskaRadnja
 * Sadrzi listu Auto guma i omogucava korisniku dodavanje, prnalazenje i vracanje svih AutoGuma.
 * @author Ivan
 * @version 1.0
 */
public class VulkanizerskaRadnja implements Radnja {
	
	/**
	 * Lista AutoGuma.
	 * Lista je privatna
	 * Implementirana kao LinkedListu AutoGuma
	 */
	private List<AutoGuma> gume = new LinkedList<AutoGuma>();

	@Override
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.add(0, a);
	}

	@Override
	public List<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		List<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

	@Override
	public List<AutoGuma> vratiSveGume() {
		return gume;
	}
}

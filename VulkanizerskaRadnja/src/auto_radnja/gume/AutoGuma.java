package auto_radnja.gume;


/**
 * Klasa AutoGuma
 * @author ivan-icko
 * @version 1.0
 *
 */
public class AutoGuma {
	
	/**
	 * Marka modela
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = -1;
	/**
	 * Sirina gume
	 */
	private int sirina = -1;
	/**
	 * Visina gume
	 */
	private int visina = -1;

	/**
	 * Podrazumevani konstruktor, bez dodatnih funkcija
	 */
	public AutoGuma() {
	}

	/**
	 * Postavlja markuModel, precnik, sirinu i visinu na unete vrednosti
	 * @param markaModel markaModel gume
	 * @param precnik gume
	 * @param sirina gume
	 * @param visina gume
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Vraca markaModel odredjene gume
	 * @return markaModel kao string
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za atribut markaModel
	 * @param markaModel
	 * @throws java.lang.NullPointerException ako je markaModel null
	 * @throws java.lang.IllegalArgumentException ako je duzina Stringa markaModel manja od 3
	 */
	
	/**
	 * Postavlja novu markuModel
	 * @param markaModel gume
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	
	/**
	 * Postavlja novu vrednost za atrubut precnik
	 * @param precnik nov precnik gume
	 * @throws java.lang.IllegalArgumentException ako je precnik manji od 13 ili ako je precnik veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new IllegalArgumentException("Precnik izvan opsega");
		this.precnik = precnik;
	}

	/**
	 * 
	 * Vraca sirinu gume
	 * @return sirina gume kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	
	/**
	 * Postavlja novu vrednost za atribut sirina
	 * @param sirina gume
	 * @throws java.lang.IllegalArgumentException ako je sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca visinu gume
	 * @return visina kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja visinu gume
	 * @param visina nova visina gume
	 * @throws java.lang.IllegalArgumentException ako je visina manja od 25, ili ako je visina veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Ispisuje informacije o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}
	
	/**
	 * Poredi dve gume prema atributima markaModel, precnik, sirina, visina
	 * @return
	 * <ul>
	 * <li>true - ako su i markaMode, precnik, sirina, visina isti kod obe gume</li>
	 * <li>false - ako to nije slucaj</li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}

package client;

public class Client {

	protected String numpermis;
	/**
	 * La plaque d'un Vehicule
	 */
	private String plaque = null;

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {

	}

	public Client(String nom, Sexe sexe, int age, String numpermis, String plaqueAuto) {

	}


	public void setPermis(String numpermis) {
		if (validePermis(numpermis))
			this.numpermis = numpermis;
	}

	public static boolean validePermis(String numpermis) {
		return false;
	}

	public String getPermis() {
		return numpermis;
	}

	@Override
	public String toString() {
		return "Client{" +
				super.toString() +", numpermis='" + numpermis + ", plaque Auto loue" + plaque+'}';
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}

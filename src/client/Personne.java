package client;

public class Personne {


	/**
	 * L'age minimum
	 */
	public final static int AGE_MIN = 21;

	/**
	 *  l'age maximum
	 */
	public final static int AGE_MAX = 90;


	protected String nom;
	protected Sexe sexe;
	protected int age;


	public Personne(){}
	public Personne(String nom,Sexe sexe, int age ){
		setNom(nom);
		setSexe(sexe);
		setAge(age);

	}
	
	public static boolean validerPersonne(String nom, Sexe sexe, int age){
		return validerNom(nom) && valideSexe(sexe) && validerAge(age) ;
	}

	/**
	 * Un nom par défaut
	 */
	public final static String NOM_PAR_DEFAUT = "NOM PAR DEFAUT";

	/**
	 * La longueur minimum du nom
	 */
	public final static int LONGUEUR_NOM_MIN = 4;

	/**
	 * Modifie le nom. Doit respecter ces criteres (non null, min de 2
 * caracteres)
	 *
	 * @param nom
	 *
	 */
	public void setNom(String nom)  {
		if (validerNom(nom))
			this.nom = nom;
	}

	/**
	 * Valider le nom de la personne
	 *
	 * @param pNom le nom de la personne a valider
	 *
	 * @return boolean, vrai si la valeur est valide
	 */
	public static boolean validerNom(String pNom)
	{
		return ((pNom != null)
				&& (pNom.length() >= Personne.LONGUEUR_NOM_MIN));
	}

	/**
	 * Modifie le sexe. Non null
	 * 
	 * @param sexe
	 *            Sexe de la client
	 */
	public void setSexe(Sexe sexe) {
		if (valideSexe(sexe))
			this.sexe = sexe;
	}

	public void setAge(int age){
		if (validerAge(age))
		this.age = age;
	}

	public static boolean validerAge(int pAge)
	{
		return (pAge>= Personne.AGE_MIN && pAge<= Personne.AGE_MAX );
	}



	public static boolean valideSexe(Sexe sexe) {
		return sexe != null;
	}

	public String getNom() {
		return nom;
	}

	public Sexe getSexe() {
		return sexe;
	}
	

	public int getAge(){
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (age != other.age)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
				if (sexe != other.sexe)
			return false;
		return true;
	}
}

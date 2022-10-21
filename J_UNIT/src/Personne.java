import java.text.Normalizer;

public class Personne{
	private String nom;
	private String prenom;
	private String login;
	
	public Personne(String unNom, String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = creerLogin();
	}
	
	private String creerLogin(){
		String res = "";
		char unRes = ' ';
		this.prenom = Normalizer.normalize(this.prenom, Normalizer.Form.NFD);
		this.nom = Normalizer.normalize(this.nom, Normalizer.Form.NFD);
		this.prenom = this.prenom.replaceAll("[^a-zA-Z0-9]", "");
		this.nom = this.nom.replaceAll("[^a-zA-Z0-9]", "");
		if (this.prenom.contains(" ")) {
			this.prenom = this.prenom.replaceAll(" ","");
		}
		if (this.nom.contains(" ")){
			this.nom = this.nom.replaceAll(" ", "");
		}
		if(this.nom.length() > 5)
		{
			this.nom = this.nom.substring(0,6);
		}
		unRes = this.prenom.charAt(0);
		res = unRes + this.nom;
		res = res.toLowerCase();
		return res;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public String toString(){
		return ("Nom : " + this.nom + " Prenom : " + this.prenom + " Login : " + this.login);
	}
}
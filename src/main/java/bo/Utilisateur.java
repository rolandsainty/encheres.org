package bo;



/**
 * Classe permettant l'instanciantion d'un Utilisateur 
 */	
public class Utilisateur {
 // TODO: creation de listes d'achats et de ventes pour les fonctions "afficher historique", pas de différence essentiel
//	entre un Utilisateur, un acheteur et un vendeur
	private int id;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	
	private int telephone;
	private int credit;
	private boolean admin;

	private String rue;
	private String codePostale;
	private String ville;
	


	public Utilisateur() {

	}

	


	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", login=" + login + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", credit=" + credit + ", admin=" + admin
				+ ", rue=" + rue + ", codePostale=" + codePostale + ", ville=" + ville + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudo() {
		return login;
	}

	public void setPseudo(String pseudo) {
		this.login = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}




	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}
	

}

package achProject.model;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private String codeEtu;

    public Etudiant(int id, String nom, String prenom, String codeEtu) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.codeEtu = codeEtu;
    }

    public Etudiant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCodeEtu() {
        return codeEtu;
    }

    public void setCodeEtu(String codeEtu) {
        this.codeEtu = codeEtu;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", codeEtu='" + codeEtu + '\'' +
                '}';
    }
}

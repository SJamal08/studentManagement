package achProject.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Etudiant implements Serializable {


    private int id;
    private String nom;
    private String prenom;
    private String codeEtu;
    private ArrayList<Cours> listCoursInscrits = new ArrayList<Cours>();

    public Etudiant( String nom, String prenom, String codeEtu) {
        this.nom = nom;
        this.prenom = prenom;
        this.codeEtu = codeEtu;
    }

    public Etudiant( String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.codeEtu = codeEtu;
    }

    public Etudiant(int id, String nom, String prenom) {
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

    public ArrayList<Cours> getListCoursInscrits() {
        return listCoursInscrits;
    }

    public void setListCoursInscrits(ArrayList<Cours> listCoursInscrits) {
        this.listCoursInscrits = listCoursInscrits;
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

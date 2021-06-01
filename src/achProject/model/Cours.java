package achProject.model;

import java.util.ArrayList;

public class Cours {

    private int id;
    private String sigle;
    private String titre;
    private int nbreMaxEtu;
    private ArrayList<Etudiant> etudiantList;
    private ArrayList<Cours> prerequis;

    public Cours() {
    }

    public Cours(int id, String sigle, String titre, int nbreMaxEtu) {
        this.id = id;
        this.sigle = sigle;
        this.titre = titre;
        this.nbreMaxEtu = nbreMaxEtu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbreMaxEtu() {
        return nbreMaxEtu;
    }

    public void setNbreMaxEtu(int nbreMaxEtu) {
        this.nbreMaxEtu = nbreMaxEtu;
    }

    public ArrayList<Etudiant> getEtudiantList() {
        return etudiantList;
    }

    public void setEtudiantList(ArrayList<Etudiant> etudiantList) {
        this.etudiantList = etudiantList;
    }

    public ArrayList<Cours> getPrerequis() {
        return prerequis;
    }

    public void setPrerequis(ArrayList<Cours> prerequis) {
        this.prerequis = prerequis;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", sigle='" + sigle + '\'' +
                ", titre='" + titre + '\'' +
                ", nbreMaxEtu=" + nbreMaxEtu +
                ", etudiantList=" + etudiantList +
                ", prerequis=" + prerequis +
                '}';
    }
}
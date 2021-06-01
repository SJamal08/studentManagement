package achProject.repository;

import achProject.model.Etudiant;

import java.util.ArrayList;

public class EtudiantRepository implements IRepository<Etudiant>{

    private static String EtudiantsFileUrl = "../../utils/dataFile/etudiants.txt";


    @Override
    public void create(Etudiant etudiant) {

    }

    @Override
    public ArrayList findAll() {
        return null;
    }

    @Override
    public Etudiant findOne(int id) {
        return null;
    }

    @Override
    public void update(Etudiant etudiant) {

    }

    @Override
    public void delete(int id) {

    }
}

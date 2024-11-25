import java.util.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    // Afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des employés et leurs départements :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
        System.out.println("Employé " + e + " supprimé de la collection.");
    }

    // Supprimer un employé dans un département donné
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println("Employé " + e + " travaillant dans " + d + " supprimé.");
        } else {
            System.out.println("Aucune correspondance trouvée pour l'employé " + e + " dans le département " + d);
        }
    }

    // Afficher la liste des employés
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Afficher la liste des départements
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : new HashSet<>(affectations.values())) {
            System.out.println(d);
        }
    }

    // Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Trier la collection par identifiant d'employé
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(Comparator.comparingInt(Employe::getId));
        sortedMap.putAll(affectations);
        return sortedMap;
    }
}

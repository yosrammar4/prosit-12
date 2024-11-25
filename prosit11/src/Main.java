public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectations = new AffectationHashMap();

        // Créer des employés et des départements
        Employe e1 = new Employe("Alice", 1);
        Employe e2 = new Employe("Bob", 2);
        Employe e3 = new Employe("Charlie", 3);

        Departement d1 = new Departement("Informatique");
        Departement d2 = new Departement("Marketing");

        // Ajouter des employés aux départements
        affectations.ajouterEmployeDepartement(e1, d1);
        affectations.ajouterEmployeDepartement(e2, d2);
        affectations.ajouterEmployeDepartement(e3, d1);

        // Afficher les employés et départements
        affectations.afficherEmployesEtDepartements();

        // Tester la suppression d'un employé
        affectations.supprimerEmploye(e2);
        affectations.afficherEmployesEtDepartements();

        // Tester la suppression d'un employé dans un département
        affectations.supprimerEmployeEtDepartement(e3, d1);
        affectations.afficherEmployesEtDepartements();

        // Afficher les employés et départements séparément
        affectations.afficherEmployes();
        affectations.afficherDepartements();

        // Rechercher un employé et un département
        System.out.println("Employé Alice existe ? " + affectations.rechercherEmploye(e1));
        System.out.println("Département Informatique existe ? " + affectations.rechercherDepartement(d1));

        // Trier la collection par identifiant d'employé
        System.out.println("Collection triée par identifiant :");
        TreeMap<Employe, Departement> triee = affectations.trierMap();
        for (Map.Entry<Employe, Departement> entry : triee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

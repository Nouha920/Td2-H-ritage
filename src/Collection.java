public class Collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];

        us[0] = new Assiette_Ronde(1930, 8.4);
        us[1] = new Cuieller(1940, 7.3);
        us[2] = new Assiette_Carree(1936, 5.5);
        us[3] = new Cuieller(1917, 8.8);

        int anneActuelle = 2024;

        affiche_Cuillere(us);
        affiche_surface(us);
        affiche_valeur(us);

        for (Ustensile u : us) {
            System.out.println("Valeur de l'ustensile : " + u.calcule_valeur());
        }
    }

    public static void affiche_Cuillere(Ustensile[] us) {
        int nbCuilleres = 0;
        for (Ustensile u : us) {
            if (u instanceof Cuieller) {
                nbCuilleres++;
            }
        }
        System.out.println("Il y a " + nbCuilleres + " cuillères.");
    }

    public static void affiche_surface(Ustensile[] us) {
        double somme = 0;
        for (Ustensile u : us) {
            if (u instanceof Assiette) {
                somme += ((Assiette) u).calcul_surface();
            }
        }
        System.out.println("Surface totale des assiettes : " + somme);
    }

    public static void affiche_valeur(Ustensile[] us) {
        double somme = 0;
        for (Ustensile u : us) {
            somme += u.calcule_valeur();
        }
        System.out.println("Valeur totale de la collection : " + somme);
    }
}

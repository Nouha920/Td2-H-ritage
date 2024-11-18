public class Collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new Assiette_Ronde(1930, 8.4);
        us[1] = new Cuieller(1940, 7.3);
        us[2] = new Assiette_Carree(1936, 5.5);
        us[3] = new Cuieller(1917, 8.8);

        affiche_Cuiller(us);
        affiche_surface(us);
        affiche_valeur(us);
    }

    public static void affiche_Cuiller(Ustensile[] us) {
        int nbCuilleres = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuieller) {
                nbCuilleres++;
            }
        }
        System.out.println("Il y a " + nbCuilleres + " cuillères.");
    }

    public static void affiche_surface(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Assiette) {
                somme += ((Assiette) us[i]).calcul_surface();
            }
        }
        System.out.println("Surface totale des assiettes : " + somme);
    }

    public static void affiche_valeur(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
            somme += us[i].calcule_valeur();
        }
        System.out.println("Valeur totale de la collection : " + somme);
    }
}
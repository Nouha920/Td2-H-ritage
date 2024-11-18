public class Cuieller extends Ustensile {
    private double longeur;
    public Cuieller(int anne_f,double longeur){
        super(anne_f);
        this.longeur=longeur;
    }
    public double calcule_valeur() {
        int anne=2024-getAnne_f();
        if (anne>50){
            return anne-50;
        }
        else {
            return 0;
        }
    }

}

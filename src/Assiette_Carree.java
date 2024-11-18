public class Assiette_Carree extends Assiette{
    private double cote;
    public Assiette_Carree(int anne_f,double cote){
        super(anne_f);
        this.cote=cote;
    }

    @Override
    public double calcul_surface() {
        return cote*cote;
    }
    public double calcule_valeur(){
        int anne=2024-getAnne_f();
        if (anne>50){
            return 5*(anne-50);
        }
        else {
            return 0;
        }
    }

}

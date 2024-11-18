public class Assiette_Ronde extends Assiette {
    private double rayon;
    public  Assiette_Ronde( int anne_f,double rayon ){
        super(anne_f);
        this.rayon=rayon;
    }
    public double calcul_surface(){
        return 3.14*rayon*rayon;
    }

    @Override
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

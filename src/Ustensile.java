abstract public class Ustensile {
    private int anne_f;

    public Ustensile(int anne_f) {
        this.anne_f = anne_f;
    }

    public int getAnne_f() {
        return anne_f;
    }

    public abstract double calcule_valeur();


    @Override
    public String toString() {
        return "Ustensile fabriqué en " + anne_f;
    }




}

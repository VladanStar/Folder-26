package apstraktneklase;

public class TajniRobot extends Robot {

    public TajniRobot() {
    }

    public TajniRobot(double tezinaKg, String ime, String lozinka) {
        super(tezinaKg, ime, lozinka);
    }

    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {

    }

    /*@Override
    public String getIme() {
        return "Ne mogu da ti kazem";
    }*/

    @Override
    public double getTezinaKg() {
        return 0.0;
    }

}

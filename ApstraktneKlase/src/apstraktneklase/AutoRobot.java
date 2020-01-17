package apstraktneklase;

public class AutoRobot extends Robot {

    private double brzinaKPH;

    public AutoRobot() {
    }

    public AutoRobot(double brzinaKPH) {
        this.brzinaKPH = brzinaKPH;
    }

    public AutoRobot(double tezinaKg, String ime, String lozinka, double brzinaKPH) {
        super(tezinaKg, ime, lozinka);
        this.brzinaKPH = brzinaKPH;
    }

    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {
        if (naredjenje.equals("POKRENI SE")){
            System.out.println("AutoRobot " +getIme() +" se pokrenuo");
        } else if (naredjenje.equals("ZAUSTAVI SE")) {
            System.out.println("AutoRobot "+getIme() +" se zaustavio");
        } else {
            System.out.println("AutoRobot " +getIme() +"ne poznaje naredjenje");

        }
    }

}

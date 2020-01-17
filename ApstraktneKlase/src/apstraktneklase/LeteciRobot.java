package apstraktneklase;

final public class LeteciRobot extends Robot {

    private double maksimalnaVisina;

    public LeteciRobot() {
    }

    public LeteciRobot(double maksimalnaVisina) {
        this.maksimalnaVisina = maksimalnaVisina;
    }

    public LeteciRobot( double tezinaKg, String ime, String lozinka,double maksimalnaVisina) {
        super(tezinaKg, ime, lozinka);
        this.maksimalnaVisina = maksimalnaVisina;
    }

    public double getMaksimalnaVisina() {
        return maksimalnaVisina;
    }

    public void setMaksimalnaVisina(double maksimalnaVisina) {
        this.maksimalnaVisina = maksimalnaVisina;
    }

    @Override
    final public double getTezinaKg() {
        return super.getTezinaKg(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    protected void izvrsenjeNaredbe(String naredjenje) {
        if(naredjenje.equals("POLETI")){
            System.out.println("AUTOROBOT"+getIme() +" JE POLETEO");
        }
        else if(naredjenje.equals("SLETI")){
            System.out.println("AUTOROBOT "+getIme() +"JE SLETEO");
        }
        else{
            System.out.println("AUTOROBOT "+getIme() +"NE POZNAJE OVO NAREDJENJE");
        }
    }

}

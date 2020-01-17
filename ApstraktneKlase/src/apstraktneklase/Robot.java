package apstraktneklase;

public abstract class Robot {

    private double tezinaKg;
    private String ime;
    private String lozinka;

    public Robot() {
    }

    public Robot(double tezinaKg, String ime, String lozinka) {
        this.tezinaKg = tezinaKg;
        this.ime = ime;
        this.lozinka = lozinka;
    }

    public double getTezinaKg() {
        return tezinaKg;
    }

    public void setTezinaKg(double tezinaKg) {
        this.tezinaKg = tezinaKg;
    }

    final public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public void izvrsiNaredjenje(String lozinka, String naredjenje) {
        if (lozinka.equals(this.lozinka)) {
            izvrsenjeNaredbe(naredjenje);
        }
        else{
            System.out.println("Lozinka za robota " + ime +" nije ispravna");
        }

    }

    abstract protected void izvrsenjeNaredbe(String naredjenje);

}

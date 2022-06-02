package OOPAbstract;

public class PersoanaStudentAbstract extends PersoanaAbstract {

    private String nume;
    private String prenume;
    private String meserie;

    public PersoanaStudentAbstract(String nume, String prenume, String meserie) {
        this.nume = nume;
        this.prenume = prenume;
        this.meserie = meserie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getMeserie() {
        return meserie;
    }

    public void setMeserie(String meserie) {
        this.meserie = meserie;
    }

    @Override
    void Munceste() {

    }

    @Override
    void primesteSalar() {

    }

    @Override
    void Invata() {

    }

    @Override
    void primestebursa() {

    }

    @Override
    void Someaza() {

    }

    @Override
    void PrimesteAjutor() {

    }
}

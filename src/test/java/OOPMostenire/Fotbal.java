package OOPMostenire;

import java.util.List;

public class Fotbal extends Sport{

    public Boolean Capitan;
    public Integer nrEchipamente;
    public List<String> Reguli;


    public Fotbal(String nume, String denumire, Boolean esteEchipa, Integer membri,Boolean Capitan, Integer nrEchipamente,
                  List<String>Reguli) {
        super(nume, denumire, esteEchipa, membri);
        this.Capitan = Capitan;
        this.nrEchipamente = nrEchipamente;
        this.Reguli = Reguli;

    }

    public void InfoFotbal(){
        System.out.println("Informatiile despre fotbal sunt: ");
        InfoSport();
        System.out.println(Capitan);
        System.out.println(nrEchipamente);
        System.out.println(Reguli);
    }
}

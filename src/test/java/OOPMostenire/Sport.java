package OOPMostenire;

public class Sport {

    public String Nume;
    public String Denumire;
    public Boolean esteEchipa;
    public Integer Membri;

    public Sport(String nume, String denumire, Boolean esteEchipa, Integer membri) {

        Nume = nume;
        Denumire = denumire;
        this.esteEchipa = esteEchipa;
        Membri = membri;
    }

    //OOP Mostenire = principiul pe baza caruia clasa parinte poate sa fie mostenita de n clase copii.
    //Exemplu: casa bunicilor cu nepotii.
    //In Java putem mostenii o singura clasa.
    //In momentul in care clasa copil mosteneste clasa parinte trebuie sa apelam contructorul din clasa parinte.
    //super
    //extends
    //setter
    //getter
    //polimorfism static si dinamic

    public void InfoSport(){
        System.out.println(Nume);
        System.out.println(Denumire);
        System.out.println(esteEchipa);
        System.out.println(Membri);
    }

}

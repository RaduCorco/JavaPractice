package OOP_Incapsulare;


import java.util.List;

public class Audi extends Masina {
    public List<String> dotariInterioare;
    public List<String> dotariExterioare;


    public Audi(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }
    public void infoAudi(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getPret());
    }

    //Suprascriem o metoda din clasa parinte


    @Override
    public void CumparaMasina() {
        System.out.println("Vreau sa cumpar Audi!");
        super.CumparaMasina();
    }

    //Polimorfism static

    public void afiseazaMasini(){
        System.out.println("Nu avem masini");

    }
    public void afiseazaMasini(String brand){
        System.out.println("Nu avem masini");

    }
    public void afiseazaMasini(String brand,Integer an){
        System.out.println("Nu avem masini");

    }
    public void afiseazaMasini(Integer brand){
        System.out.println("Nu avem masini");

    }
//    Polimorfism static la metode cu return
//    Polimorfismul static se poate aplica doar la metodele cu return care au parametri
//    N are nicio importanta numarul sau tipul parametrilor

    public String getNume(){
        return "Nicu";
    }
    public String getNume(Integer parametri){
        return "Nicu";
    }
    public String getNume(String parametri){
        return "Nicu";
    }

}

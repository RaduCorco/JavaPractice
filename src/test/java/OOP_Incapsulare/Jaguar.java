package OOP_Incapsulare;

public class Jaguar extends Masina{

    public Jaguar(String brand, String model, Integer pret) {
        super(brand, model, pret);
    }
    @Override
    public void CumparaMasina(){
        System.out.println("Vreau sa cumpar masina J");
        super.CumparaMasina();


    }
}

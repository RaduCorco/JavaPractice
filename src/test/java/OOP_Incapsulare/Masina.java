package OOP_Incapsulare;

public class Masina {
    //Incapsulare = conceptul prin care tinem departe de exterior valorile variabilelor
    //private = acces control care blocheaza valorile variabilelor sa fie vazute inafara clasei care le-ai declarat
    //ca sa vedem/modificam valorile folosim conceptul de get si set
    //Polimorfism = Dinamic si Static
    //Polimorfismul dinamic =intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul static = mai multe metode cu acelasi nume se pot diferentia prin numarul de parametrii si tipul parametrilor
    //Polimorfismul dinamic =  override
    //Polimorfismul static = overload
    //Polimorfismul static nu se poate aplica la metodele cu "return"

    private String brand;
    private String model;
    private Integer pret;

    public Masina(String brand, String model, Integer pret) {
        this.brand = brand;
        this.model = model;
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getPret() {
        return pret;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    //Definim o metoda pe care o vom suprascrie

    public void CumparaMasina(){

        System.out.println("Vreau sa cumpar o masina");

    }
}

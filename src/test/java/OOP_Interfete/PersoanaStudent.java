package OOP_Interfete;

public class PersoanaStudent extends PersoanaInterfata implements Student {


    public PersoanaStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Invata() {
        System.out.println("Studentul" + getNume() +" "+ getPrenume()+ "invata");
    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Studentul" + getNume() +" "+ getPrenume()+ "primeste bursa");

    }
}

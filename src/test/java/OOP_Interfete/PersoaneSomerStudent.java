package OOP_Interfete;

public class PersoaneSomerStudent extends PersoanaInterfata implements Student,Somer{

    public PersoaneSomerStudent(String nume, String prenume, String meserie) {
        super(nume, prenume, meserie);
    }

    @Override
    public void Someaza() {
        System.out.println("Somero-student" + getNume() +" "+ getPrenume()+ "nu face nimic");

    }

    @Override
    public void PrimesteAjutor() {
        System.out.println("Somero-student" + getNume() +" "+ getPrenume()+ "primeste ajutor");

    }

    @Override
    public void Invata() {
        System.out.println("Somero-student" + getNume() +" "+ getPrenume()+ "invata");

    }

    @Override
    public void PrimesteBursa() {
        System.out.println("Somero-student" + getNume() +" "+ getPrenume()+ "primeste bursa");

    }
}

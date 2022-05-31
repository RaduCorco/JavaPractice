package OOP_Interfete;

import org.junit.Test;

public class InterfataTest {

    @Test
    public void metodaInterfata(){

        //Persoana angajat
        PersoanaAngajat persoanaAngajat = new PersoanaAngajat("Nume1", "Prenume1","Angajat");
        persoanaAngajat.Munceste();
        persoanaAngajat.PrimesteSalar();

        //Persoana student
        PersoanaStudent persoanaStudent = new PersoanaStudent("Nume2", "Prenume2", "Student");
        persoanaStudent.Invata();
        persoanaStudent.PrimesteBursa();

        //Persoana angajat-student
        PersoanaAngajatStudent persoanaAngajatStudent = new PersoanaAngajatStudent("Nume3",
                "Prenume3", "angajat-student");
        persoanaAngajatStudent.Invata();
        persoanaAngajatStudent.Munceste();
        persoanaAngajatStudent.PrimesteBursa();
        persoanaAngajatStudent.PrimesteSalar();
    }
}

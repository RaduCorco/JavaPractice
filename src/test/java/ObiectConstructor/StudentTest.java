package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    //Obiect = instanta unei clase
    //Obiectul este strict legat de constructor
    //Dintr-o clasa putem declara n obiecte
    //Obiectele se diferentiaza pe baza numele
    //Structura obiect : numeClasa+nume obiect = new numeClasa(valori parametri)
    //Recunoastem un obiect dupa cuvantul " new "


    @Test
    public void MetodaTest(){

        //Primul obiect

        List<Integer> noteRomanaRadu = new ArrayList<>();
        noteRomanaRadu.add(9);
        noteRomanaRadu.add(7);
        noteRomanaRadu.add(6);
        List<Integer> noteMatematicaRadu = new ArrayList<>();
        noteMatematicaRadu.add(5);
        noteMatematicaRadu.add(6);
        noteMatematicaRadu.add(4);

        Student Radu=new Student("Corcoveanu","Radu",29,1.75,'M',true,
                noteMatematicaRadu,noteRomanaRadu);

        Radu.InfoStudent();
        Radu.InfoNote("romana");
        Radu.InfoNote("matematica");
        Radu.Prenume="George";
        Radu.InfoStudent();


        List<Integer> noteRomanaAlex = new ArrayList<>();
        noteRomanaAlex.add(5);
        noteRomanaAlex.add(7);
        noteRomanaAlex.add(6);
        List<Integer> noteMatematicaAlex = new ArrayList<>();
        noteMatematicaAlex.add(5);
        noteMatematicaAlex.add(6);
        noteMatematicaAlex.add(4);

        Student Alex=new Student("Dorha","Alex",27,1.80,'M',true,noteMatematicaAlex,
        noteRomanaAlex);
        Alex.InfoStudent();
        Alex.InfoNote("matematica");


        //Declaram un obiect pntru al doilea constructor


        List<Integer> noteMatematicaCla = new ArrayList<>();
        noteMatematicaCla.add(5);
        noteMatematicaCla.add(6);
        noteMatematicaCla.add(4);

        Student PopCla=new Student("Pop","Claudiu",27,1.80,'M',true,noteMatematicaCla);
        PopCla.InfoStudent();
        PopCla.InfoNote("matematica");

        //Declaram un obiect pentru ai treilea constructor

        List<Integer> noteMatematicaJohn = new ArrayList<>();
        noteMatematicaJohn.add(5);
        noteMatematicaJohn.add(6);
        noteMatematicaJohn.add(4);
        List<Integer> noteRomanaJohn = new ArrayList<>();
        noteRomanaJohn.add(5);
        noteRomanaJohn.add(7);
        noteRomanaJohn.add(6);
        List<Integer> noteMaghiaraJohn = new ArrayList<>();
        noteMaghiaraJohn.add(5);
        noteMaghiaraJohn.add(6);
        noteMaghiaraJohn.add(7);

        Student John=new Student("Ionescu","John",27,1.80,'M',true,
                noteMatematicaJohn,noteMaghiaraJohn);
        John.InfoStudent();
        John.InfoNote("matematica");

        List<Integer> noteRomanaCristi = new ArrayList<>();
        noteRomanaCristi.add(9);
        noteRomanaCristi.add(9);
        List<Integer> noteMateCristi = new ArrayList<>();
        noteMateCristi.add(8);
        noteMateCristi.add(6);


        Student Cristi = new Student("Cristi","Domsa",27,1.87,'M', true,
                noteRomanaCristi,noteMateCristi);
        Cristi.InfoStudent();
        Cristi.InfoNote("romana");
        Cristi.InfoNote("matematica");
        Cristi.CalculMedie("romana");
        Cristi.CalculMedie("matematica");


    }




}

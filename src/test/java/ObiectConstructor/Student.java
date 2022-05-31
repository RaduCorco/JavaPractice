package ObiectConstructor;

import java.util.List;

public class Student {
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Double Inaltime;
    public Character Sex;
    public Boolean areBursa;
    public List<Integer> noteMatematica;
    public List<Integer> noteRomana;
    public List<Integer> noteMaghiara;

    //Obiect = instanta unei clase
    //Constructor = are ca rol sa initializeze variabilele unei clase
    //Tipuri contructor= cu parametri si fara parametri
    //By default avem un constructor fara parametri in orice clasa.
    //Intr-o clasa putem avea n constructori.
    //Structura constructor: public numele clasei(are sau nu parametri)
    //Nu exista constructor cu "return"

    public Student(String Nume,String Prenume,Integer Varsta,Double Inaltime,
                   Character Sex,Boolean areBursa,List<Integer> noteMatematica,List<Integer> noteRomana){
        this.Nume = Nume;
        this.Prenume=Prenume;
        this.Varsta=Varsta;
        this.Sex=Sex;
        this.Inaltime=Inaltime;
        this.areBursa=areBursa;
        this.noteMatematica=noteMatematica;
        this.noteRomana=noteRomana;
        this.noteMaghiara=noteMaghiara;

    }

    //Facem un alt constructor doar cu note Matematica


    public Student(String nume, String prenume, Integer varsta, Double inaltime, Character sex, Boolean areBursa, List<Integer> noteMatematica) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Inaltime = inaltime;
        Sex = sex;
        this.areBursa = areBursa;
        this.noteMatematica = noteMatematica;
    }

    public void InfoStudent(){
        System.out.println("Numele studentului este "+ Nume);
        System.out.println("Prenumele este "+ Prenume);
        System.out.println("Varsta studentului este "+Varsta);
        System.out.println("Sexul este "+ Sex);
        System.out.println("Are studentul bursa? "+areBursa);
        System.out.println("Inaltimea studentului e " + Inaltime);

    }
    public void InfoNote(String Materie) {
        if (Materie.equals("romana") || Materie.equals("Romana")) {
            System.out.println("Notele studentului la Romana sunt urmatoarele: ");
            PrintListNote(noteRomana);
        }
        if (Materie.equals("matematica") || Materie.equals("Matematica")) {
            System.out.println("Notele studentului la Matematica sunt urmatoarele: ");
            PrintListNote(noteMatematica);
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara")) {
            System.out.println("Notele studentului la Maghiara sunt urmatoarele: ");
            PrintListNote(noteMaghiara);
        }
    }

    public void PrintListNote(List<Integer> note){
        for (Integer index = 0; index < note.size(); index++) {
            System.out.println(note.get(index));

        }
    }

    public void CalculMedie(String Materie){

        if (Materie.equals("matematica") || Materie.equals("Matematica")) {
            System.out.println("Media studentului la Matematica sunt urmatoarele: ");
            PrintCalculMedie(noteMatematica);
        }
        if (Materie.equals("romana") || Materie.equals("Romana")) {
            System.out.println("Media studentului la romana sunt urmatoarele: ");
            PrintCalculMedie(noteRomana);
        }
        if (Materie.equals("maghiara") || Materie.equals("Maghiara")) {
            System.out.println("Media studentului la maghiara sunt urmatoarele: ");
            PrintCalculMedie(noteMaghiara);
        }
    }

    public void PrintCalculMedie(List<Integer> note){
        double suma = 0;
        Integer nrelement = note.size();

        for (Integer index = 0; index < note.size(); index++) {
            suma=suma+note.get(index);

        }

        double Media=suma/nrelement;
        System.out.println(Media);
    }

}

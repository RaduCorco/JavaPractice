package VariableMethod;

import com.google.errorprone.annotations.Var;
import org.junit.Test;

public class Cursant {

    //acesta e un comentariu
    /*acesta este un altfel de comentariu*/
    //Class = o colectie de variabile si metode
    //Intr-un fisier Java putem avea mai multe clase
    //Recunoastem o clasa dupa cuvantul cheie  "class"
    //Structura clasa = public class Nume {}
    //Orice structura invatam ,trebuie scrisa in interiorul unei clase(Java)
    //Variabila = atributul unei clase
    //O clasa poate avea n variabile / deloc
    //Tipuri variabile = globala si locala
    //O variabile trebuie sau nu sa primeasca o valoare
    //Structura variabila globala = public TipVariabila Nume
    //Dam o valoare unei variabile cu " = "
    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Ocupatie;
    public Character Sex;
    public Double Inaltime;
    public Boolean EsteAngajat;
    //Metoda = actiunea unei clase
    //O clasa poate sa contina n metode
    //Tipuri metode:VOID si RETURN
    //Structura metoda void = public void Nume() {}
    //Metodele pot sau nu sa contina parametri

    @Test
    public void AtribuireVariabile(){
        //Dam valori pentru variabilele de mai sus
        Nume="Radu";
        Prenume="Corcoveanu";
        Varsta=29;
        Ocupatie="Cursant";
        Sex='M';
        Inaltime=1.75;
        EsteAngajat= true;

        //Printam o valoare in consola
        System.out.print(Nume);
        System.out.print(' ');
        System.out.print(Prenume);
        System.out.print(' ');
        System.out.print(Varsta);
        System.out.print(' ');
        System.out.print(Ocupatie);
        System.out.print(' ');
        System.out.print(Sex);
        System.out.print(' ');
        System.out.print(Inaltime);
        System.out.print(' ');
        System.out.println(EsteAngajat);

        //Print vs Println
        //Print = printeaza si ramane pe randul curent
        //println = printeaza si sare la randul urmator

        printeazaNota();
        System.out.println();
        promovareCurs();

        System.out.println(getSalarV1());

        //variabile locale = tip


    }
    //variabile locale = tip variabila + nume
    public void  printeazaNota() {
        Integer notamanual = 10;
        Integer notaautomation = 10;
        System.out.print("Cursantul Radu a luat notele:"+notamanual+","+notaautomation);
    }

    public void promovareCurs(){
        Boolean promovare= true;
        System.out.println("A promovat cursantul: "+Nume+" "+Prenume+"?");
        System.out.println(promovare);

    }

    //Metoda return= exprimare care contine "returneaza"//
    //Structura metoda return =  public "tip de data" + Nume (){}
    //Exista o conventie in Java ca metodele cu return sa aiba in fata "get"
    //Returnam salariul dorit

    public String getSalarV2(){
        Integer salar = 35000;
        String s=salar+" Lei";
        return  s;

    }
    public Integer getSalarV1(){
        Integer salar=5000;
        return salar;

    }
}


// S
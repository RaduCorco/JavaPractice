package Tema;


import org.junit.Test;

public class TemaRadu {



    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String DataDeAstazi;
    public String Hello;
    public String Ziua;
    public String Ora;
    public Double Doi;
    public Double Trei;
    public Double Unu;


    @Test

    public void DespreMine() {

        Nume = " Corcoveanu ";
        Prenume = " Radu ";
        Varsta = 29;
        DataDeAstazi = " 13.01.2019";
        Hello = "Hello,world";
        Ziua = " vineri";
        Ora = " 18.30 PM";

        System.out.println(Hello);
        System.out.println("Numele meu este" + Nume + Prenume + " si am " + Varsta + " de ani. ");
        System.out.println("Astazi este" + Ziua + ", e ora" + Ora + " data de astazi fiind" + DataDeAstazi);


    }

    //public static void main(String args[])
    {

        double n1 = 1.3;
        double n2 = 2.7;
        double n3 = 1.5;
        double sum;
        sum=n1 + n2 + n3;
        System.out.println("The sum of number is:"+sum);


    }



    }












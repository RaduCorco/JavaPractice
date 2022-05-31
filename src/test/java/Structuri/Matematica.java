package Structuri;

import org.junit.Test;

public class Matematica {


    //Structuri = alternative si repetitive
    //Structuri alternative = if ... then ... else ... swith ... case

    @Test
    public void MatematicaTest() {

        NumarPar();
        numarMaiMareCa20();
        numarMaiMareCaUnNumar(60);
        numarMaiMareCaUnNumar(5);
        VerificParitateNumar(64);
        VerificParitateNumar(21);
        VerificImparDivizibilV2(5);
        VerificImparDivizibilV2(10);
        VerificImparDivizibilV2(9);
        VerificImparDivizibilV2(24);
        PrinteazaZi("Marti");
        PrinteazaZi("Sambata");
    }


    //Verificam daca un numar e mai mare ca 20
    public void numarMaiMareCa20() {
        if (38 > 20) {
            System.out.println("Numarul este mai mare ca 20");
        } else {
            System.out.println("Numarul 38 este mai mic decat 20");
        }

    }


    //Verificam daca un numar este par//
    public void NumarPar() {
        if (8 % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.print("Numarul 38 este mai mic decat 20");
        }
    }

    public void numarMaiMareCaUnNumar(Integer Numar) {

        if (Numar > 20) {
            System.out.println("Numarul " + Numar + " este mai mare ca 20");
        } else {
            System.out.println("Numarul " + Numar + " este mai mic decat 20");
        }

    }

    public void VerificParitateNumar(Integer Number) {
        if (Number % 2 == 0) {
            System.out.println(Number + " este par");
        } else {
            System.out.println(Number + " este impar");
        }


        //Verific daca un numar este impar si divizibil cu 5//

    }

    public void VerificImparDivizibilV1(Integer Numar) {

        if (Numar % 2 == 1 && Numar % 5 == 0) {
            System.out.println(Numar + " este impar si divizibil cu 5");
        } else {
            System.out.println(Numar + "nu este impar si nici divizibil cu 5");
        }
    }

    public void VerificImparDivizibilV2 (Integer Numar){
        if (Numar % 2 ==1){
            if (Numar % 5 == 0){
                System.out.println("Numarul " + Numar+" este impar si divizibil cu 5");
            }
            else {
                System.out.println("Numarul " + Numar+" este impar dar nu este divizibil cu 5");
            }
        }
        else {
            if (Numar % 5 == 0){
                System.out.println("Numarul " + Numar+" este par si divizibil cu 5");
            }
            else {
                System.out.println("Numarul " + Numar+" este par dar nu este divizibil cu 5");
            }
        }
    }


    //Swith case pe zilele saptamanii

    public void PrinteazaZi(String ZiCurenta){
            switch (ZiCurenta){
                case "Duminica":
                    System.out.println("Astazi este duminica");
                    break;
                case "Sambata":
                    System.out.println("Astazi este sambata");
                    break;
                case "Vineri":
                    System.out.println("Astazi este vineri");
                    break;
                case "Marti":
                    System.out.println("Astazi este marti");
                    break;

            }
    }
}


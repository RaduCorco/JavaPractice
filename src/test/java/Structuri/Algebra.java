package Structuri;

import org.junit.Test;

public class Algebra {

    @Test
    public void Algebratest(){
        PrinteazaNumere();
        PrinteazaNrWhile();
        PrinteazaNumerePare(88);


    }

    //Printam primele 50 de numere
    //For are finit nr de pasi
    //While are un nr infinit de pasi

    public void PrinteazaNumere(){

        for (Integer index=0;index<51;index++){
        System.out.println(index);
        }
    }
    public void PrinteazaNrWhile(){
        Integer index=0;
        while (index<51){
            System.out.println(index);
            index++;
        }


    }
    //Printeaza numerele pare de la 0 pana la un numar
    public void PrinteazaNumerePare(Integer capat){
        for (Integer index=0; index<capat+1;index++){
            if (index%2==0){
                System.out.println(index);
            }
        }
    }
}

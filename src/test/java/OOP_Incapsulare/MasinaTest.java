package OOP_Incapsulare;

import org.junit.Test;

public class MasinaTest {

    @Test
    public void capsulareTest(){
        Audi A6 = new Audi("Audi","A6",7000);
        System.out.println(A6.getPret());
        A6.setModel("A3");
        System.out.println(A6.getModel());
        A6.CumparaMasina();

        Jaguar jaguarNou= new Jaguar("Jaguar","XJ",8900);
        jaguarNou.CumparaMasina();



    }


}

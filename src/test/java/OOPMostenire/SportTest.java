package OOPMostenire;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SportTest {

    @Test
    public void mostenireTest(){
        //facem primul obiect(copil) pentru fotbal
        List<String> reguliFotbal = new ArrayList<>();
        reguliFotbal.add("Nu ai voie nu stiu ce");
        reguliFotbal.add("Nu ai voie sa faci fault");
        reguliFotbal.add("Nu ai voie part2");

        Fotbal fotbalSport=new Fotbal("Fotbal","Sport de echipa",true,11,true, 3,
                reguliFotbal);
        fotbalSport.InfoFotbal();
        fotbalSport.InfoFotbal();

    }
}

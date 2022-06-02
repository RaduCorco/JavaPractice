package OOPAbstract;

public abstract class PersoanaAbstract {

//    Abstractizare = conceptul pe baza caruia definim comportamentul unei clase
//    Recunoastem o clasa abstracta dupa cuvantul abstract
//    CLasa abstracta poate (sau nu) sa contina metode abstracte
//    O clasa poate extinde o clasa abstracta
//    O clasa abstracta poate sa implementeze o interfata
//    Poti sa mostenesti o singura clasa abstracta
//    Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
//    Clasa abstracta poate sa contina un constructor => nu poti crea obiecte

   abstract void Munceste();
   abstract void primesteSalar();
   abstract void Invata();
   abstract void primestebursa();
   abstract void Someaza();
   abstract void PrimesteAjutor();


   public void VerificaVarsta(Integer varsta){

       if (varsta>=18){
           System.out.println("Persoana e majora");
       }
       else {
           System.out.println("Persoana e minora");
       }
   }


}

package HomeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1;

import HomeWork_Restoran_Service_AbstactnaFabrica.Dumplings;
import HomeWork_Restoran_Service_AbstactnaFabrica.Macaroni;
import HomeWork_Restoran_Service_AbstactnaFabrica.Soup;

public interface Restoranizable  {

   public Macaroni prepareMacaroni();
   public Soup prepareSoup();
   public Dumplings prepareDumplings();

}

package HomeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1;

import HomeWork_Restoran_Service_AbstactnaFabrica.*;

public class ItalianKitchen implements Restoranizable {
    @Override
    public Macaroni prepareMacaroni() {
        return new ItalianMacaronu();
    }

    @Override
    public Soup prepareSoup() {
        return new ItalianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new ItalianDumplings();
    }
}

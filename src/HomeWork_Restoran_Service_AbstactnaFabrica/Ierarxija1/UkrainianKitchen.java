package HomeWork_Restoran_Service_AbstactnaFabrica.Ierarxija1;

import HomeWork_Restoran_Service_AbstactnaFabrica.*;

public class UkrainianKitchen implements Restoranizable {
    @Override
    public Macaroni prepareMacaroni() {
        return new UkrainianMacaronu();
    }

    @Override
    public Soup prepareSoup() {
        return new UkrainianSoup();
    }

    @Override
    public Dumplings prepareDumplings() {
        return new UkrainianDumplings();
    }
}

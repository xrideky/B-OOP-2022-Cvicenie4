package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Kontakt;

public class Main {
    public static void main(String[] args) {
        var peter=new Kontakt("Peter","Klemovic");
        var viliam=new Kontakt("Viliam Rideky");
        var kase=new Kontakt("Case", "Miro");

        var prednasajuci=new Kontakt("Gabriel","Juhas");

        var kontakty=new Kontakt[]{new Kontakt(peter),new Kontakt(viliam),new Kontakt(kase)};
        prednasajuci.pridajZnamych(kontakty);

        prednasajuci.vypisZnamych();
        peter.setMeno("Karim");
        prednasajuci.vypisZnamych();
    }
}

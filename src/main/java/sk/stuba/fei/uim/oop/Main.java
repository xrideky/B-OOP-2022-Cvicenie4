package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Absolvent;
import sk.stuba.fei.uim.oop.kontakty.Kontakt;

public class Main {
    public static void main(String[] args) {
        var student=new Kontakt("Karim","Belak");
        var absolvent=new Absolvent("Ing.","Janko","Hrasko");


        System.out.println(student.toString());
        System.out.println(absolvent.toString());

    }
}

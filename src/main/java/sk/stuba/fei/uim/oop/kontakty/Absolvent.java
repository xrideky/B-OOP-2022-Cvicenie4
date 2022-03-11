package sk.stuba.fei.uim.oop.kontakty;

//ked dedim od nejakej triedy zdedim od nej vsetky jej atributy,metody
//ale neodedim od nej konstruktory
public class Absolvent extends Kontakt{
    protected String titul;


    public Absolvent(String titul,String meno, String priezvisko) {
        super(meno, priezvisko); //musi sa vzdy volat na zaciatku toho konstruktora
        this.titul=titul;
    }

    //aby nam vypisalo aj titul musime overridnut metodu to string z triedy Kontakt
    @Override
    public String toString() {
        return this.titul + " " + super.toString();
    }
}

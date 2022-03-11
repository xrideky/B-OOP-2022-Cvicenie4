package sk.stuba.fei.uim.oop.zvierata;

public class Macka extends Zviera{

    public Macka(String meno) {
        this.meno=meno;
    }

    @Override
    public void zvukZvierata() {
        System.out.println("mnau mnau");
    }
}

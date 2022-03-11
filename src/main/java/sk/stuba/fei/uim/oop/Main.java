package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;

public class Main {
    public static void main(String[] args) {
        //nemozeme spravit napriklad var zviera=new Zviera(); pretoze to je abstraktna trieda
        var dunco=new Pes("Dunco");
        var garfield=new Macka("Garfield");

        dunco.pohladkat();
        garfield.pohladkat();

    }
}

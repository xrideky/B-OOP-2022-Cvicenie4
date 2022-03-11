package sk.stuba.fei.uim.oop;


import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //var list=new ArrayList<>();
        ArrayList<Pes> list = new ArrayList<Pes>();
        list.add(new Pes("dunco"));
        list.add(new Pes("luna"));
        System.out.println(list.size());
        /*list.remove(0);
        //list nie je prazdny ale ked dam este raz list.remove(0) tak uz prazdny bude
        System.out.println(list.isEmpty());*/


        ArrayList<Macka> listMaciek = new ArrayList<Macka>();
        listMaciek.add(new Macka("garfield"));
        listMaciek.add(new Macka("murko"));
        System.out.println(listMaciek.size());

        ArrayList<Zviera> listZveri = new ArrayList<>();
        listZveri.addAll(list);
        listZveri.addAll(listMaciek);
        System.out.println(listZveri.size());

        // "prekartanie veci"
        Collections.shuffle(listZveri);

        //listZveri.get(0).pohladkat();

        for (var i = 0; i < listZveri.size(); i++) {
            //pretypovanie ked si neurcim akeho typu je dany list
            ((Zviera)listZveri.get(i)).pohladkat();
        }

        for(var zver : listZveri){
            zver.pohladkat();
        }

        var iterator = listZveri.iterator();
        while(iterator.hasNext()){
            var prvok=iterator.next();
             prvok.zvukZvierata();
        }
    }
}

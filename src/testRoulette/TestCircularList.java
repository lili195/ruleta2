package testRoulette;

import com.uptc.prg3.roulette.server.circularList.SimpleCirularList;

import java.util.Comparator;

public class TestCircularList {
    public static void main(String[] args) {
        SimpleCirularList<String> sCirularList = new SimpleCirularList<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sCirularList.insert("lola")
                .insert("pepe")
                .insert("lili")
                .insert("lulu")
                .insert("lalo")
                .insert("lolo")
                .insert("lala");
        for (int i = 0; i < sCirularList.size(); i++) {
            System.out.println(i + ". " + sCirularList.nextAndGet());
        }
        sCirularList.delete("lili");
        System.out.println("==========");
        for (int i = 0; i < sCirularList.size(); i++) {
            System.out.println(i + ". " + sCirularList.nextAndGet());
        }
    }   
}

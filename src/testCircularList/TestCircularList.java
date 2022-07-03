package testCircularList;

import com.uptc.prg3.roulette.server.circularList.SimpleCirularList;

public class TestCircularList {
    public static void main(String[] args) {
        SimpleCirularList<String> sCirularList = new SimpleCirularList<>();
        sCirularList.insert("lola")
                .insert("pepe")
                .insert("lili")
                .insert("lulu")
                .insert("lalo")
                .insert("lolo")
                .insert("lala");
        for (int i = 0; i < 10; i++) {
            System.out.println(sCirularList.nextAndGet());
        }
    }   
}

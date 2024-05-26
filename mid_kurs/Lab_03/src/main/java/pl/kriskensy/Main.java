package pl.kriskensy;

import pl.kriskensy.cwiczeniowiec.ExampleOBJ;

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ExampleOBJ obj1 = new ExampleOBJ(99, "test1");
        ExampleOBJ obj3 = new ExampleOBJ(16, "test3");
        ExampleOBJ obj8 = new ExampleOBJ(46, "test5");

        Set<ExampleOBJ> hashSet = new HashSet<>();
        hashSet.add(obj1);
        hashSet.add(obj3);
        hashSet.add(obj8);

        System.out.println("all objects: ");
        for (ExampleOBJ obj : hashSet) {
            System.out.println(obj);
        }
    }


//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new DrawingApp().setVisible(true);
//            }
//        });
//    }
}
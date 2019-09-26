package chapter8;

import java.util.ArrayList;
import java.util.Scanner;




public class Test {

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);

        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        // The compiler autoboxed the parameters into a Double and two Integer objects,
        // and then tried to find a common supertype of these classes
        ArrayAlg.getMiddle(1.0, 2, 3);
        System.out.println("get  middle: " + ArrayAlg.<Double>getMiddle(1.0, 2.0, 3.0));
    }
}

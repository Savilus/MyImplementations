package MyImplementations;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> test = new HashMap<>();

        test.put(null,4);
        test.put(null,4);
        test.put(null,4);
        test.put(null,3);
        test.put("a",null);
        test.put("b", null);

        System.out.println(test);
    }
}

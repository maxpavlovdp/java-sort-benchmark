import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int size = 10_000_000;
        while (true) {
            init(size);
            size = size + 10_000_000;
        }
    }

    private static void init(int size) {

        System.out.print("Preparing Array List with size: " + size + "... ");
        List list = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.print("Sorting... ");
        long start = System.currentTimeMillis();
        Collections.sort(list);
        long stop = System.currentTimeMillis();

        System.out.println("Time is " + (stop - start) / 1000 + " sec");
    }
}

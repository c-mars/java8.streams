package c.mars;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
	    RS integers = new RS();
        integers.stream().limit(5).forEach(System.out::println);
    }

    static class RS implements Iterable<Integer>{
        public Stream<Integer>stream(){
            return StreamSupport.stream(this.spliterator(), false);
        }


        @Override
        public Iterator<Integer> iterator() {
            final Random r = new Random();
            return new Iterator<Integer>() {
                @Override
                public boolean hasNext() {
                    return true;
                }

                @Override
                public Integer next() {
                    return r.nextInt(100);
                }
            };
        }
    }
}

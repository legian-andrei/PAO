import task1.MyOptional;
import task2.MultiMapValue;

import java.io.Serializable;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testareTask2();
    }

    public static void testareTask1(){
        MyOptional<String> o1 = MyOptional.of(new String("asd"));
        System.out.println(o1.isPresent()); // true
        System.out.println(o1.get()); // "asd"

        MyOptional<Object> o2 = MyOptional.of(List.of("1", "2"));
        System.out.println(o2.isPresent()); // true
        System.out.println(o2.get()); // ["1", "2"]

        MyOptional<Serializable> o3 = MyOptional.of(null);
        System.out.println(o3.isPresent()); // false
        System.out.println(o3.get()); // NoSuchElementException

//        MyOptional<Integer> o4 = MyOptional.of("3"); // eroare de compilare
    }

    public static void testareTask2(){
        MultiMapValue<String, Integer> multiMap = new MultiMapValue<>();
        multiMap.add("a", 1);
        multiMap.add("a", 2);
        multiMap.add("b", 3);
        System.out.println(multiMap.getValues("a"));
        System.out.println(multiMap.getFirst("b"));
        System.out.println(multiMap.containsKey("c"));
        System.out.println(multiMap.isEmpty());
        System.out.println(multiMap.size());
        System.out.println(multiMap.remove("a"));
        System.out.println(multiMap.size());
    }
}
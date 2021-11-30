package top.anlythree.test;


import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> a = Stream.of("a", "b", "c");
        Stream<String> a1 = Stream.ofNullable("a");
        System.out.println("test");
    }


    public void testFunction(){
        // do somthing
    }

}

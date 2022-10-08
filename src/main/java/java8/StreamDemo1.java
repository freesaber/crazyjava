package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {
        List<String> players = Arrays.asList("kobe", "james", "curry", "cilla");

        List<String> sorted = players.stream()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);

        /**
         * 数组转换为流Stream.of()
         */
    }
}

package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "word");

        List<String[]> strings = words.stream()
                .map(w -> w.split(""))    //[[h,e,l,l,o],[w,o,r,l,d]]
                .collect(Collectors.toList());

        List<String> list = words.stream()
                .flatMap(w -> Arrays.stream(w.split(""))) // [h,e,l,l,o,w,o,r,l,d]
                .collect(Collectors.toList());
    }
}

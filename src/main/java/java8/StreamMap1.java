package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap1 {
    public static void main(String[] args) {
        List<String> alpha = Arrays.asList("Monkey", "Lion", "Giraffe", "Lemur");

        //不使用Stream管道流
        List<String> alphaUpper = new ArrayList<>();
        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(alphaUpper);

        //alphaUpper = alpha.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        // 方法引用，String::toUpperCase对每个元素进行处理
        alphaUpper = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(alphaUpper);
    }
}

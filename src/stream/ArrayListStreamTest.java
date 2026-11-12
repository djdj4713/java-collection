package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStreamTest {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tomas");
        list.add("Adward");
        list.add("Jack");
        // 전체 리스트를 출력
        list.stream().forEach(x -> System.out.print(x + "\t"));
        // 정렬 후 출력
        list.stream().sorted().forEach(x -> System.out.print(x + "\t"));
        // 각 요소의 문자열 길이 출력
        // 원본을 다른 현태의 데이터로 바꾸는 함수 : map()
        // ["Tomas", "Adward", "Jack"] -> [5, 6, 4] -> 출력
        list.stream()
                .map(s -> s.length())
                .forEach(s -> System.out.print(s + "\t"));
        System.out.println("======================");
        // 문자열의 길이가 5이상인 애들만(필터 : filter) 정렬(sorted)해서 출력
        // filter는 원보을 바꾸지 않는다.
        list.stream()
                .filter(x -> x.length() >= 5)
                .sorted()
                .forEach(x -> System.out.print(x + "\t"));

        System.out.println();
        System.out.println("=============");
        // 정수 배열 가공
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
       // intList의 합계를 계산
        int sum = intList.stream()
                .mapToInt(x -> x.intValue())
                .sum();
        System.out.println("리스트의 합 : " + sum);

    }
}

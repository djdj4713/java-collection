package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetName {
    static void main(String[] args) {
        // set은 중복을 허용하지 않는 자료구조이다.
        // set은 순서를 보장하지 않아요.
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana"));
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println("과일바구니 사이즈 : " + fruits.size());
        System.out.println("==================");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}

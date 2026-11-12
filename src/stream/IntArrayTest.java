package stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class IntArrayTest {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // 배열안의 값의 합계
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("arr 배열 합 : " + sum);
        System.out.println("=================");
        // 스트림으로 처리하기
        int sumValue = Arrays.stream(arr).sum();
        // ctrl + alt + v : 리턴결과에 따른 구조를 만들어주는 단축키
        OptionalDouble average = Arrays.stream(arr).average();
        System.out.println("스트림으로 합계 계산 : " + sumValue);
        System.out.println("스트림으로 평균 계산 : " + average);

        // 배열 리스트를 출력
        System.out.println("일반 for 구문으로 출력 : "  );
        for (int i : arr) {
            System.out.println(i);
        }
        // 스트림으로 출력하기 - foreach
        System.out.println("스트림으로 출력");
        Arrays.stream(arr).forEach(i -> System.out.print(i + "\t"));
    }
}

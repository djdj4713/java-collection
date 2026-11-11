package collectionTest;

import java.util.*;

public class CollectionMain {
    static void main(String[] args) {
        Dog dog1 = new Dog(1, 5, "푸들");
        Dog dog2 = new Dog(2, 8, "치와와");
        Dog dog3 = new Dog(3, 3, "말티즈");
        // 1. 리스트에 추가
        Dog[] dogs = new Dog[10];
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        System.out.println("== ArrayList 출력(일반 for loop) ==");
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }
        System.out.println("== ArrayList 출력(향상된 for loop) ==");
        for (Dog dog : dogList) {
            System.out.println(dog);
        }
        // 2. 셋에 추가
        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(dog3);
        dogSet.add(dog2);
        dogSet.add(dog1);
        dogSet.add(dog3); // 중복돼서 입력 x
        System.out.println("== Set 출력(향상된 for loop) ==");
        for (Dog dog : dogSet) {
            System.out.println(dog);
            // 3. 맵에 추가
            Map<Integer, Dog> dogMap = new HashMap<>();
            dogMap.put(dog1.getId(), dog1);
            dogMap.put(dog2.getId(), dog2);
            dogMap.put(dog3.getId(), dog3);
            System.out.println("=================");
            dogMap.forEach((key, value) ->
                    System.out.println(dogMap.get(key))
            );
        }
    }
}

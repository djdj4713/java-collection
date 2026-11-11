package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    static void main(String[] args) {
        // 이터레이터(Iterator) : 반복을 수행하는 기능
        // 레일처럼 돌리는 장비 : 회전할 때 삭제가능
        List<String> names = new ArrayList<>(Arrays.asList("홍길동", "장원영", "안유진"));
        // for 루프로 장원영을 삭제
        String deleteName = "장원영";
        for(int i=0; i < names.size(); i++){
            if(names.get(i).equals(deleteName)) names.remove(i);
        }
        System.out.println("====================");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("====================");
        // 이터레이터로 홍길동 삭제하기
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("홍길동")){
                iterator.remove();
            }
        }
        System.out.println("====================");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
package lambda;

public class LamdbaExpression {
    static void main(String[] args) {
        // 1. 전달하는 값이 두개 이상일 때는 항상 () 안에 넣어야 한다.
        // 2. 결과를 리턴할 때 처리 절차가 여러줄일 때는 항상 { } 에 넣어야 한다.
        // 그리고, return 구문도 반드시 필요하다.
        // 3. 리턴 할 문장이 단 한문장이이면 retrun을 생략할 수 있다.
        Calc add = (x, y) -> {return x + y;};
        Calc minus = (x, y) -> {
            x = x + 10;
            y = y + 5;
            return x - y;
        };
        System.out.println(add.calc(3, 2));
    }
}

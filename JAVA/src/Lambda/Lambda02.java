package Lambda.LambdaEx;

/**
 * 함수형 인터페이스 (Functional Interface)
 * 람다 표현식을 사용할 때는 람다 표현식을 저장하기 위한 참조 변수의 타입을 결정해야만 한다.
 *
 *  / 문법 /
 * (참조변수의타입) 참조변수의이름 = 람다표현식
 *
 * 위의 문법처럼 람다 표현식을 하나의 변수에 대입할 때 사용하는 참조 변수의 타입을 함수형 인터페이스라고 부른다.
 *
 * 함수형 인터페이스는 추상 클래스와는 달리 단 하나의 추상 메소드만을 가져야 한다.
 *
 * / 문법 /
 * @FunctionalInterface
 *
 * 위와 같은 어노테이션을 인터페이스의 선언 앞에 붙이면, 컴파일러는 해당 인터페이스를 함수형 인터페이스로 인식한다.
 * 자바 컴파일러는 이렇게 명시된 함수형 인터페이스에 두 개 이상의 메소드가 선언되면 오류를 발생시킨다.
 *
 * 출처 : TCP School
 *
 */

@FunctionalInterface
interface Calc { // 함수형 인터페이스의 선언
    public int min(int x, int y);
}

public class Lambda02 {
    public static void main(String[] args) {
        Calc minNum = (x, y) -> x < y ? x : y; //추상 메소드의 구현
        System.out.println(minNum.min(3,4)); // 함수형 인터페이스의 사용
    }
}

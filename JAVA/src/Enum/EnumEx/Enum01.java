package Enum.EnumEx;

/**
 * values() 메소드
 * values() 메소드는 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환한다.
 * 이 메소드는 자바의 모든 열거체에 컴파일러가 자동으로 추가해 주는 메소드이다.
 */

public class Enum01 {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
    }
}

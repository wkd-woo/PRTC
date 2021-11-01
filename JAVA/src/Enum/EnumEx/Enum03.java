package Enum.EnumEx;

/**
 * ordinal() 메소드
 * ordinal() 메소드는 해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반한다.
 * 이때 반환되는 값은 열거체 정의에서 해당 열거체 상수가 정의된 순서이며, 상숫값 자체가 아님을 명심해야 한다.
 */

public class Enum03 {
    public static void main(String[] args){
        int idx = Rainbow.YELLOW.ordinal();
        System.out.println(idx);
    }
}

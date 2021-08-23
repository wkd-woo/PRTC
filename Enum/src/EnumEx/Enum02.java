package EnumEx;

/**
 * valueOf() 메소드
 * valueOf() 메소드는 전달된 문자열과 일치하는 해당 열거체의 상수를 반환한다.
 */

public class Enum02 {
    public static void main(String[] args){
        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);
    }
}

package Enum.EnumEx;

/**
 * 불규칙한 상숫값을 가지는 열거체에서 ordinal() 메소드를 사용한 예제
 */

enum unRegullarRainbow {
    RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);

    private final int value;

    unRegullarRainbow(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


public class Enum04 {
    public static void main(String[] args) {
        System.out.println(unRegullarRainbow.YELLOW.ordinal());
    }
}

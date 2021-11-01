package Lambda.LambdaEx;

/**
 * 람다 표현식(lambda expression)
 * 람다 표현식(lambda expression)이란 간단히 말해 메소드를 하나의 식으로 표현한 것이다.
 * 메소드를 람다 표현식으로 표현하면, 클래스를 작성하고 객체를 생성하지 않아도 메소드를 사용할 수 있다.
 * <p>
 * 그런데 '자바' 에서는 클래스의 선언과 동시에 객체를 생성하므로, 단 하나의 객체만을 생성할 수 있는 클래스를 익명 클래스라고 한다.
 * 따라서 자바에서 람다 표현식은 익명 클래스와 같다고 할 수 있다.
 */


public class Lambda {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("전통적인 방식의 일회용 스레드 생성");
            }
        }).start();

        new Thread(() -> {
            System.out.println("람다 표현식을 사용한 일회용 스레드 생성");
        }).start();
    }

    /**
     * 위의 예제에서 볼 수 있듯이 람다 표현식을 사용하면 불필요한 코드를 줄일 수 있으며, 코드의 가독성이 훨씬 좋아진다.
     */
}

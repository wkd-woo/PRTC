import java.util.Objects;

public class ObjectEqaulTest {

    public static void main(String[] arg){
        Integer a = new Integer(10);
        Integer b = new Integer(11);

        System.out.println(Objects.equals(a, b));
    }

}

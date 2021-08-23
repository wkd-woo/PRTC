/**
 * CompareTo()는 객체가 같거나, 크거나, 작거나를 비교하여
 * 0, 음수, 양수를 리턴할 수 있다.
 *
 * 다음과 같이 String을 갖고 있는 Text라는 클래스를 정의한다.
 * Comparable를 implements하여 CompareTo라는 메소드를 오버라이딩 한다.
 */


public class ComparableTest {

    public static void main(String[] args){
        Text text1 = new Text("aaa");
        Text text2 = new Text("aaa");

        System.out.println(text1.compareTo(text2));
    }

    public interface Comparable<T>{
        public int compareTo(T o);
    }

    public static class Text implements Comparable<Text>{
        private String mText;

        public Text(String text){
            mText = text;
        }

        public String getText(){
            return mText;
        }

        @Override
        public int compareTo(Text right){
            return mText.compareTo(right.getText());
        }
    }
}

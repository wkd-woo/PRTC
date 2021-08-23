/**
 * Comparator
 * Comparator도 Comparable과 비슷하다.
 * 차이점은 Comparator는 인터페이스가 아니라 객체로 생성한다는 것이다.
 *
 * 다음과 같이 객체를 정렬할 때 Comparator를 사용할 수 있다.
 * sort()으로 인자로 전달되어 내부에서 객체가 같은지, 큰지, 작은지 비교하는데 사용한다.
 * 예제에서는 객체의 주소를 비교하는 것이 아닌, 문자열의 길이를 비교한다.
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("This code is free software");
        strings.add("you can redistribute it");
        strings.add("under the terms of the GNU General Public License version 2 only");

        // sorting
        Collections.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });

        System.out.println();
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

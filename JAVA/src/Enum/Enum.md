# Enum 클래스

---

### 열거체(enumeration type)

C언어와 C++에서는 열거체를 사용할 수 있지만, JDK 1.5 이전의 자바에서는 열거체를 사용할 수 없었다.

하지만 JDK 1.5 부터는 C 언어의 열거체보다 더욱 향상된 성능의 열거체를 정의한 Enum 클래스를 사용할 수 있다.

<br>
자바의 열거체는 다음과 같은 장점을 가진다.
<br>

> 1. 열거체를 비교할 때 실제 값뿐만 아니라 `타입까지`도 체크한다.
     <br>

> 2. 열거체의 상숫값이 재정의 되더라도 다시 컴파일 할 필요가 없다.

---

### 열거체의 정의 및 사용

자바에서는 `enum` 키워드를 사용하여 열거체를 정의할 수 있다.

> 문법 <br>
> ```java 열거체이름 {상수1이름, 상수2이름, ...}```

> 예제    <br>
> ```java
> enum Rainbow {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}
> ```

이렇게 정의된 열거체를 사용하는 방법은 다음과 같다.

> 문법 <br>
> ```열거체이름.상수이름```

> 예제 <br>
> ```
> Rainbow.RED
> ```
<br>

---

### 열거체의 상숫값 정의 및 추가

위와 같이 정의된 열거체의 첫 번째 상숫값은 0부터 설정되며, 그 다음은 바로 앞의 상숫값보다 1만큼 증가되며 설정.

<br>
또한, 불규칙한 값을 상숫값으로 설정하고 싶으면 상수의 이름 앞에 괄호 (()) 를 추가하고,<br>
그 안에 원하는 상숫값을 명시할 수 있다.

하지만 이 때에는 불규칙한 특정 값을 저장할 수 있는 인스턴스 변수와 생성자를 다음 예제와 같은별도로 추가해야만 한다.

> 문법 <br>
> ```java
> enum Rainbow {
>   RED(3), ORANGE(10), YELLOW(21), GREEN(5), BLUE(1), INDIGO(-1), VIOLET(-11);
>   
>   private final int value;
>   Rainbow(int value) { this.value = value; }
>   public int getValue() { return value; }
> }

---

### 대표적인 Enum 메소드

Enum 클래스의 메소드는 다음과 같다.

|  메소드 | 설명 |
|:---:|:---:|
| `static E values()` | 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환 |
| `static E valueOf(String name)`  | 전달된 문자열과 일치하는 해당 열거체의 상수를 반환함 | 
| `protected void finalize()` | 해당 Enum 클래스가 final 메소드를 가질 수 없게 됨 |
| `String name()` | 해당 열거체 상수의 이름을 반환함 |
| `int ordinal()` | 해당 열거체 상수가 열거체 정의에서 정의된 순서(0부터 시작)를 반환함 |

<br><br>

---
출처 : TCP School


package javabasic;

public class Example06 {
    public static void main(String[] args) {
//        1. **기본 문자열 처리 메서드 작성**
//        - **`StringUtil`** 클래스를 생성하세요. 이 클래스는 문자열 처리와 관련된 다양한 기능을 제공하는 유틸리티 메서드를 포함할 것입니다.
//        - 다음 기능을 수행하는 메서드를 **`StringUtil`** 클래스 내에 작성하세요:
//        - **`reverse`**: 하나의 **`String`**을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
//        - **`concat`**: 두 개의 **`String`**을 매개변수로 받아 이를 연결한 결과를 반환합니다.
//                - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
        StringUtil stringUtil = new StringUtil();

        System.out.println(stringUtil.reverse("abcdefg"));
        System.out.println(stringUtil.concat("abcd", "efgh"));
        stringUtil.contains("Hello world!", 'o');
//        2. **메서드 오버로딩 실습**
//    - **`concat`** 메서드를 오버로딩하여, 세 개의 **`String`**을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 버전을 추가하세요.
//    - **`contains`** 메서드를 오버로딩하여, 두 개의 **`String`**을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 버전을 추가하세요.
        System.out.println(stringUtil.concat("abcd", "efgh", "ijkl"));
        stringUtil.contains("Hello world!", "world");
    }
}

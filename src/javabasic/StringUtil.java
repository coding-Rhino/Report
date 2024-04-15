package javabasic;

public class StringUtil {
//  -필드
//      인스턴스 변수 선언
    public String str1;
    public String str2;
    public String str3;
    public char c;
//  기본 생성자 생성(없으면 자동완성)
    public StringUtil(){

    }
//  -메서드
//      인스턴스 메서드(concat, contains는 오버로딩)
    public String reverse(String str1){
        String reverseStr = "";
        for(int i = str1.length() - 1; i >= 0; i --){
            reverseStr += str1.charAt(i);
        }
        return reverseStr;
    }
    public String concat(String str1, String str2){
        return str1 + str2;
    }
    public String concat(String str1, String str2, String str3){
        return str1 + str2 + str3;
    }
    public void contains(String str1, char c){
            if(str1.indexOf(c) == -1){
                System.out.println("문자열이 문자를 포함하지 않습니다.");
            }
            else{
                System.out.println("문자열이 문자를 포함하고 있습니다.");

            }
    }
    public void contains(String str1, String str2){
            if(str1.indexOf(str2) == -1){
                System.out.println("문자열이 문자를 포함하지 않습니다.");
            }
            else{
                System.out.println("문자열이 문자를 포함하고 있습니다.");
            }
    }
}

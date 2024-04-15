package javabasic;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
//      1
//      다음 타입들을 가진 변수를 선언하고, 각각에 적절한 값을 할당하세요:
//      int, double, char, boolean, String.
        int a = 0;
        double b = 0;
        char c = ' ';
        boolean d = false;
        String e = "";
//      2
//      두 개의 int 변수를 선언하고,
//      이들의 합, 빼기, 곱, 나눗셈의 결과를 출력하는 프로그램을 작성하세요.
        int num1 = 2;
        int num2 = 1;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        Scanner scanner = new Scanner(System.in);
        boolean numSignal = false;
        String name;
//      3
//      사용자로부터 이름과 나이를 입력받아,
//      그 정보를 화면에 출력하는 간단한 프로그램을 작성하세요.
        do{
            numSignal = true;
            System.out.println("이름을 입력해주세요 : ");
            name = scanner.next();
            char[] nameArr = new char[name.length()];
            for(int i = 0; i < name.length(); i ++){
                nameArr[i] = name.charAt(i);
                if(nameArr[i] >= 48 && nameArr[i] <= 57){
                    numSignal = false;
                    System.out.println("잘못된 이름이 입력됐습니다.");
                    break;
                }
            }
        }while (!numSignal);

        boolean stringSignal = false;
        String age;
        do{
            stringSignal= true;
            System.out.println("나이를 입력해주세요 : ");
            age = scanner.next();
            char[] ageArr = new char[age.length()];
            for(int i = 0; i < age.length(); i ++){
                ageArr[i] = age.charAt(i);
                if(ageArr[i] < 48 || ageArr[i] > 57){
                    stringSignal = false;
                    System.out.println("잘못된 나이가 입력됐습니다.");
                    break;
                }
            }
        }while (!stringSignal);

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

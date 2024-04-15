package javabasic;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
//      1
//      사용자로부터 숫자를 하나 입력받아,
//      이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();

        if (num1 > 0) {
            System.out.println("입력받은 숫자는 양수입니다.");
        }
        else if(num1 < 0) {
            System.out.println("입력받은 숫자는 음수입니다.");
        }
        else {
            System.out.println("입력받은 숫자는 0입니다.");
        }
//      2
//      1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                if(i == 100){
                    System.out.print(i);
                }
                else {
                    System.out.print(i + ", ");
                }
            }
        }
//      3
//      사용자로부터 숫자 n을 입력받아,
//      1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
        System.out.println();
        System.out.println("1부터 입력한 숫자까지의 합을 구합니다.");
        System.out.println("숫자를 입력해주세요 : ");
        int num2 = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= num2; i++){
            sum += i;
        }
        System.out.println("1 부터 "+ num2 +"까지의 합은 " + sum
        + "입니다.");
    }
}

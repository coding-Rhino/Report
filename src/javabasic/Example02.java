package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
//      1
//      -사용자로부터 두 개의 숫자를 입력받아, 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//          - 두 개의 숫자는 모두 double타입의 값입니다. 결과값도 double타입을 반환해야 합니다.
//          - 나눗셈에서 0으로 나눌 경우 나눌 수 없는 수라는 예외 메시지를 출력해야 합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력해주세요 : ");
        double leftNum = scanner.nextDouble();
        System.out.println("두 번째 수를 입력해주세요 : ");
        double rightNum = scanner.nextDouble();

        System.out.println(leftNum + rightNum);
        System.out.println(leftNum - rightNum);
        System.out.println(leftNum * rightNum);
        if(rightNum != 0.0){
            System.out.println(leftNum / rightNum);
        }
        else {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
        System.out.println(leftNum % rightNum);

//      2
//      세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
//          -세 개의 다른 정수는 모두 콘솔 입력을 통해 할당합니다.
        int[] intNum = new int[3];
        for(int i = 0; i < intNum.length; i++){
            System.out.println("숫자를 입력해주세요 : ");
            intNum[i] = scanner.nextInt();
        }
        Arrays.sort(intNum);

        System.out.println("가장 작은 수는 " + intNum[0] + "입니다.");
        System.out.println("가장 큰 수는 " + intNum[2] + "입니다.");

        System.out.println("정수 3개가 서로 다르거나 " +
                "가장 큰 수와 작은 수의 차이가 9가 맞나?");
//      3
//      &&, ||, ! 연산자를 사용하여 논리 연산을 수행하는 예제를 작성하세요.
        if(!(intNum[0] == intNum[1] && intNum[1] ==intNum[2])
        || (intNum[2] - intNum[0]) == 8){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력 하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("두번째 정수를 입력 하세요 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("시작 정수가 종료 정수 보다 큽니다");
            return;
        }

        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        System.out.println("총 합은 : " + sum);
    }
}

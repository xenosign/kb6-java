package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rand1 = (int)(Math.random() * 100);
        Random random = new Random();
        int rand2 = random.nextInt(100);

        System.out.println(rand1);
        
        while (true) {
            System.out.print("숫자를 입력해 주세요 : ");
            int input = scanner.nextInt();

            if (input == rand1) {
                System.out.println("정답 입니다! 랜덤 숫자는 " + rand1);
                break;
            } else if (input > rand1) {
                System.out.println("DOWN");
            } else {
                System.out.println("UP");
            }
        }
    }
}

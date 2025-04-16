package z_test.type;

import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        int arrLen = 10;

        int[] nums = new int[arrLen];

        for (int i = 0; i < arrLen; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        int sum = 0;
        for (int i = 0; i < arrLen; i++) {
            sum += nums[i];
        }

        double avg = (double) sum / arrLen;

        System.out.println("랜덤 배열 : " + Arrays.toString(nums));
        System.out.println("랜덤 배열의 합산 : " + sum);
        System.out.println("랜덤 배열의 평균 : " + avg);
    }
}

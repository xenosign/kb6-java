package assignment.ch06.exam09;

public class Computer {
    int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

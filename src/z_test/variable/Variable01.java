package z_test.variable;

public class Variable01 {
    public static void main(String[] args) {
        int d = 10;
        char e = 'e';
        System.out.println(d + e);
        System.out.println("한글 테스트");

        int i = 1;
        byte b = 127;

        while (i < 1000) {
            System.out.println(b--);
            i++;
        }
    }
}

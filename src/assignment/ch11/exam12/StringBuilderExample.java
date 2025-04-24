package assignment.ch11.exam12;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();

        System.out.println(str);
    }
}

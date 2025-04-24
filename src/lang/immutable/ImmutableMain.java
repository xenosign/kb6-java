package lang.immutable;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableUser user1 = new ImmutableUser("효석");
        ImmutableUser user2 = user1;

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        user2 = new ImmutableUser("준범");
        System.out.println("user2 의 이름을 '준범'으로 변경");
        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}

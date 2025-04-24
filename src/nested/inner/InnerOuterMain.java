package nested.inner;

import nested.staticc.StaticOuter;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        InnerOuter.Inner inner = innerOuter.new Inner();

        inner.print();
    }
}

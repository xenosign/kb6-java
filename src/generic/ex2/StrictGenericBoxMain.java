package generic.ex2;

import generic.ex1.GenericBox;

public class StrictGenericBoxMain {
    public static void main(String[] args) {
        StrictGenericBox<String> stringBox = new StrictGenericBox<>();
        stringBox.setValue("문자열 들어가니?");

        StrictGenericBox<Short> shortBox = new StrictGenericBox<>();
        shortBox.setValue((short)1);
    }
}

package assignment.ch15.exam01;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //객체저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");
        //저장된객체수출력
        int size = set.size();
        System.out.println("총 객체 수: " + size); // 4
    }
}

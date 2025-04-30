package assignment.ch15.exam02;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set=new HashSet<Member>();

        //Member객체저장
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));

        //저장된객체수출력
        System.out.println("총객체수:"+set.size());
    }
}

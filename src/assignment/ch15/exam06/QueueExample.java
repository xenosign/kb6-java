package assignment.ch15.exam06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<Message>();
        
        msgQueue.offer(new Message("sendMail", "홍길동"));
        msgQueue.offer(new Message("sendSMS", "신용권"));
        msgQueue.offer(new Message("sendKakaotalk", "김자바"));

        while (!msgQueue.isEmpty()) {
            Message msg = msgQueue.poll();
            
            // 향상된 switch 문, 자바 12+
            switch (msg.command) {
                case "sendMail" -> System.out.println(msg.to + "님에게 메일 전송");
                case "sendSMS" -> System.out.println(msg.to + "님에게 문자 전송");
                case "sendKakaotalk" -> System.out.println(msg.to + "님에게 카카오톡 전송");
            }

            switch(msg.command){
                case "sendMail":
                    System.out.println(msg.to+"님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(msg.to+"님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(msg.to+"님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}

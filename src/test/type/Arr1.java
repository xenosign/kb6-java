package test.type;

public class Arr1 {
    public static void main(String[] args) {
        String[] students; // 배열이 시작되는 주소 값을 지정
        students = new String[6]; // 배열 생성 및 크기 설정
        
        students[0] = "안은현";
        students[1] = "강병현";
        students[2] = "염다빈";
        students[3] = "이혜원";
        students[4] = "김은지";
        students[5] = "이준범";

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}

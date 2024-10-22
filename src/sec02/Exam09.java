package sec02;

import java.util.Scanner;

// 9. 숫자만 추출
public class Exam09 {
    public static void main(String[] args) {
        Exam11 exam11 = new Exam11();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam11.solution(str);
    }

    public void solution(String str) {
        System.out.println(Integer.parseInt(str.replaceAll("[a-zA-Z]",""))); // 인트형으로 바꿔서 앞에 불필요하게 붙는 0들을 잘라줄수있다!
    }
}

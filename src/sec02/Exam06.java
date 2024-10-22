package sec02;

import java.util.Scanner;

// 6. 중복문자제거
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam06 = new Exam06();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam06.solution(str);
    }

    public void solution(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (sb.indexOf(String.valueOf(chars[i])) == -1) {
                sb.append(chars[i]);
            }
        }

        System.out.println(new String(sb));
    }
}

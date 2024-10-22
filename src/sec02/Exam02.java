package sec02;

import java.util.Scanner;

// 2. 대소문자 변환
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam02 = new Exam02();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(exam02.solution(str));
    }

        public String solution(String str) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }

            return new String(chars);
        }
}

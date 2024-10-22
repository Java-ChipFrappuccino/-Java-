package sec02;

import java.util.Scanner;

// 3. 문장 속 단어
public class Exam03 {
    public static void main(String[] args) {
        Exam03 exam03 = new Exam03();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(exam03.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        int longest = strArr[0].length();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > longest) {
                longest = strArr[i].length();
                answer = strArr[i];
            }
        }

        return answer;
    }
}

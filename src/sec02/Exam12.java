package sec02;

import java.util.Scanner;

// 12. 암호
public class Exam12 {
    public static void main(String[] args) {
        Exam12 exam12 = new Exam12();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        exam12.solution(s);
    }

    public void solution(String str) {
        char[] strs = new char [str.length() / 7];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = (char) Integer.parseInt(str.substring(i * 7, i * 7 + 7).replace("#","1").replace("*","0"),2);
        }
        System.out.println(new String(strs));
    }
}

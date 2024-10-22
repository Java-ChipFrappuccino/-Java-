package sec02;

import java.util.Scanner;

// 7. 회문문자열
public class Exam07 {
    public static void main(String[] args) {
        Exam07 exam07 = new Exam07();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam07.solution(str);
    }

    public void solution(String str) {
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

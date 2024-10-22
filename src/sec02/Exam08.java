package sec02;

import java.util.Scanner;

// 8. 유효한 팰린드롬
public class Exam08 {
    public static void main(String[] args) {
        Exam08 exam08 = new Exam08();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam08.solution(str);
    }

    public void solution(String str) {
        String reverseStr = new StringBuilder(str.replaceAll("[^a-zA-Z]","").toLowerCase()).reverse().toString();
        if (str.replaceAll("[^a-zA-Z]","").toLowerCase().equals(reverseStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

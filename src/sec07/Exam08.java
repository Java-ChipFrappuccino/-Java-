package sec07;

import java.util.Scanner;
import java.util.Stack;

// 8. 이분검색
public class Exam08 {
    public static void main(String[] args) {
        Exam08 exam = new Exam08();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam.solution(str);
    }

    public void solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    answer = "NO";
                    System.out.println(answer);
                    return;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            answer = "NO";
            System.out.println(answer);
            return;
        }
        System.out.println(answer);
    }
}

package sec07;

import java.util.Scanner;
import java.util.Stack;

// 6. 장난꾸러기
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam = new Exam06();

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

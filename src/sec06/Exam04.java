package sec06;

import java.util.Scanner;
import java.util.Stack;

// 4. 후위식 연산 (postfix)
public class Exam04 {
    public static void main(String[] args) {
        Exam04 exam = new Exam04();

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

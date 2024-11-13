package sec07;

import java.util.Scanner;
import java.util.Stack;

// 9. 뮤직비디오(결정알고리즘)
public class Exam09 {
    public static void main(String[] args) {
        Exam09 exam = new Exam09();

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

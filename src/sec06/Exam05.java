package sec06;

import java.util.Scanner;
import java.util.Stack;

// 5. 쇠막대기
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam = new Exam05();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam.solution(str);
    }

    public void solution(String str) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}

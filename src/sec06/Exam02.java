package sec06;

import java.util.Scanner;
import java.util.Stack;

// 2. 괄호문자제거
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam = new Exam02();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam.solution(str);
    }

    public void solution(String str) {
//        int count = 0;
//        Stack<Character> stack = new Stack<>();
//        for (Character c : str.toCharArray()) {
//            if (c == '(') {
//                count++;
//                continue;
//            } else if (c == ')') {
//                count--;
//                continue;
//            }
//            if (count == 0) {
//                stack.push(c);
//            }
//        }
//        for (Character c : stack) {
//            System.out.print(c);
//        }

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(c);
            }
        }
        for (Character c : stack) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}

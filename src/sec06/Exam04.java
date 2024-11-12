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
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else if (c == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if (c == '-') {
                int temp = stack.pop();
                stack.push(stack.pop() - temp);
            } else if (c == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if (c == '/') {
                int temp = stack.pop();
                stack.push(stack.pop() / temp);
            }
        }

//        for (char c : str.toCharArray()) {
//            if (Character.isDigit(c)) {
//                stack.push(Character.getNumericValue(c));
//            } else {
//                int rt = stack.pop();
//                int lt = stack.pop();
//                if (c == '+') {
//                    stack.push(lt + rt);
//                } else if (c == '-') {
//                    stack.push(lt - rt);
//                } else if (c == '*') {
//                    stack.push(lt * rt);
//                } else if (c == '/') {
//                    stack.push(lt / rt);
//                }
//            }
//        }

        System.out.println(stack.pop());
    }
}

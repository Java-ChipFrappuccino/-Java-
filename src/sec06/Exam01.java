package sec06;

import java.util.*;

// 1. 올바른 괄호
public class Exam01 {
    public static void main(String[] args) {
        Exam01 exam = new Exam01();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam.solution(str);
    }

    public void solution(String str) {
        String answer="YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }
        System.out.println(answer);
    }
}

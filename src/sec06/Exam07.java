package sec06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 7. 교육과정설계
public class Exam07 {
    public static void main(String[] args) {
        Exam07 exam = new Exam07();

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        exam.solution(a, b);
    }

    public void solution(String a, String b) {
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) q.offer(a.charAt(i));
        for (char c : b.toCharArray()) {
            if (q.peek() == c) {
                q.poll();
                if (q.isEmpty()) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}

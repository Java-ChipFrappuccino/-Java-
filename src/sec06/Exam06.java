package sec06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 6. 공주구하기
public class Exam06 {
    public static void main(String[] args) {
        Exam06 exam = new Exam06();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        exam.solution(n , k);
    }

    public void solution(int n , int k) {
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;
        for (int i = 1; i <= n; i++) q.offer(i);
        while (q.size() > 1) {
            for (int j = 1; j < k; j++) q.offer(q.poll());
            q.poll();
        }
        System.out.println(q.poll());
    }
}

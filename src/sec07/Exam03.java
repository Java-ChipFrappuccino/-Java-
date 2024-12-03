package sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 3. 삽입정렬
public class Exam03 {
    public static void main(String[] args) {
        Exam03 exam = new Exam03();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) arr.add(sc.nextInt());

        System.out.println(arr);
        exam.solution(arr);
    }

    public void solution(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {}
    }
}

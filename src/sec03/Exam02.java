package sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 2. 보이는 학생
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam02 = new Exam02();

        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            arr.add(Integer.parseInt(sc.nextLine()));
            System.out.print(" ");
        }
        exam02.solution(arr);
    }

    public void solution(List<Integer> arr) {
        int count = 1;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
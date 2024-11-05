package sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 학급 회장(해쉬)
public class Exam01 {
    public static void main(String[] args) {
        Exam01 exam = new Exam01();

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            arr1.add(sc.nextInt());
        }
        int num2 = sc.nextInt();
        for (int i = 0; i < num2; i++) {
            arr2.add(sc.nextInt());
        }
        exam.solution(arr1,arr2);
    }

    public void solution(List<Integer> arr1, List<Integer> arr2) {

    }
}

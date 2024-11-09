package sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 1. 두 배열 합치기 (two pointers algorithm)
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
        List<Integer> mix = new ArrayList<>();
        int p1 = 0 , p2 = 0;
        while (p1 < arr1.size() && p2 < arr1.size()) {
            if (arr1.get(p1) < arr2.get(p2)) {
                mix.add(arr1.get(p1++));
            } else {
                mix.add(arr2.get(p2++));
            }
        }
        while (p1 < arr1.size()) {
            mix.add(arr1.get(p1++));
        }
        while (p2 < arr2.size()) {
            mix.add(arr2.get(p2++));
        }
//        for (int i = 0; i < arr1.size(); i++) {
//            mix.add(arr1.get(i));
//        }
//
//        for (int i = 0; i < arr2.size(); i++) {
//            mix.add(arr2.get(i));
//        }
//
//        Collections.sort(mix);
        System.out.println(mix.toString());
    }
}

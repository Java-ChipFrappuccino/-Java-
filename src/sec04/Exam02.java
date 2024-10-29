package sec04;

import java.util.*;

// 2. 공통원소구하기
public class Exam02 {
    public static void main(String[] args) {
        Exam02 exam = new Exam02();

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
        Collections.sort(arr1);
        Collections.sort(arr2);
        int p1 = 0, p2 = 0;
        while (arr1.size() > p1 && arr2.size() > p2) {
            if (arr1.get(p1) == arr2.get(p2)) {
                System.out.printf("%d ",arr1.get(p1++));
                p2++;
            } else if (arr1.get(p1) < arr2.get(p2)) {
                p1++;
            } else {
                p2++;
            }
        }
//        for (int i = 0; i < arr1.size(); i++) {
//            for (int j = 0; j < arr2.size(); j++) {
//                if (arr1.get(i) == (arr2.get(j))) {
//                    System.out.printf("%d ",arr1.get(i));
//                }
//            }
//        }
    }
}

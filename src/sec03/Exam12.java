package sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 12. 멘토링
public class Exam12 {
    public static void main(String[] args) {
        Exam12 exam12 = new Exam12();

//        List<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine());
        int testCount = Integer.parseInt(sc.nextLine());
        int[][] testResult = new int[testCount][students];
        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < students; j++) {
                testResult[i][j] = Integer.parseInt(sc.nextLine());
//                System.out.printf("%d ", testResult[i][j]);
            }
//            System.out.println();
        }

        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < students; j++) {
                System.out.printf("%d ", testResult[i][j]);
            }
            System.out.println();
        }
        exam12.solution(testResult);
    }

    public void solution(int[][] testResult) {

    }
}

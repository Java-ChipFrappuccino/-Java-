package sec03;

import com.sun.tools.javac.Main;

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
        exam12.solution(students, testCount, testResult);
    }

    public void solution(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }
        System.out.println(answer);
    }
}

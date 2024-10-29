package sec03;

import java.util.Random;
import java.util.Scanner;

// 9. 격자판 최대합
public class Exam09 {
    public static void main(String[] args) {
        Exam09 exam09 = new Exam09();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());;
        int[][] arr = new int[num][num];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int randomNumber = random.nextInt(49) + 2;
                arr[i][j] = randomNumber;
//                arr[i][j] = Integer.parseInt(sc.nextLine());;
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
        exam09.solution(arr);
    }

    public void solution(int[][] arr) {
        int sum = 0;
        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (count == 0) { // 세로로 체크
                    sum += arr[j][i];
                }
                if (count == 1) { // 가로로 체크
                    sum += arr[i][j];
                }
                if (count == 2) { // 우하향 대각선 체크
                    sum += arr[j][j];
                }
                if (count == 3) { // 좌하향 대각선 체크
                    sum += arr[arr.length - 1 - j][j];
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (i == arr.length - 1) { // 한 싸이클 돌면 초기화
                i = -1;
                count++;
            }
            if (count == 4) {
                System.out.printf("\n가장 큰 합은 %d입니다!",maxSum);
                break;
            }
        }
    }
}

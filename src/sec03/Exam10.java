package sec03;

import java.util.Random;
import java.util.Scanner;

// 10. 봉우리
public class Exam10 {
    public static void main(String[] args) {
        Exam10 exam10 = new Exam10();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[num + 2][num + 2];
        Random random = new Random();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int randomNumber = random.nextInt(49) + 2;
                arr[i][j] = randomNumber;
//                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int height = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[height][i]);
            if (i == arr.length - 1) {
                height++;
                i = -1;
                if (height == arr.length) {
                    break;
                }
                System.out.println();
            }
        }
        exam10.solution(arr);
    }

    public void solution(int[][] arr) {
        int height = 1;
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[height][i] > arr[height - 1][i] && arr[height][i] > arr[height + 1][i] && arr[height][i] > arr[height][i - 1] && arr[height][i] > arr[height][i + 1]) {
                count++;
            }
            if (i == arr.length - 2) {
                height++;
                i = 0;
                if (height == arr.length - 1) {
                    break;
                }
            }
        }
        System.out.println();
        System.out.printf("봉우리의 개수는 %d개 입니다!", count);
    }
}

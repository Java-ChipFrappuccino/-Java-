package sec03;

import java.util.*;

// 11. 임시반장정하기
public class Exam11 {
    public static void main(String[] args) {
        Exam11 exam11 = new Exam11();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[num][5];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                int randomNumber = random.nextInt(9) + 1;
                arr[i][j] = randomNumber;
//                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int height = 0;
        for (int i = 0; i < arr[0].length; i++) {
            System.out.printf("%d ",arr[height][i]);
            if (i == arr[0].length - 1) {
                height++;
                i = -1;
                if (height == arr.length) {
                    break;
                }
                System.out.println();
            }
        }
        exam11.solution(arr);
    }

    public void solution(int[][] arr) {
        int[][] original = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            original[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][0] == original[i][j]) {

                }
            }
        }
    }
}

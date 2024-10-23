package sec03;

import java.util.Scanner;

// 3. 가위바위보
public class Exam03 {
    public static void main(String[] args) {
        Exam03 exam03 = new Exam03();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[3][num];

        for (int i = 0; i < num; i++) { // A의 순서
            arr[1][i] = sc.nextInt();
            System.out.print(" ");
        }

        for (int i = 0; i < num; i++) { // B의 순서
            arr[2][i] = sc.nextInt();
            System.out.print(" ");
        }
        exam03.solution(arr);
    }

    public void solution(int[][] arr) {
        for (int i = 0; i < arr[1].length; i++) {
            if (arr[1][i] == arr[2][i]) {
                System.out.println("D");
            } else if ((arr[1][i] == 1 && arr[2][i] == 2) || (arr[1][i] == 2 && arr[2][i] == 3) || ((arr[1][i] == 3 && arr[2][i] == 1))) {
                System.out.println("B");
            } else if ((arr[1][i] == 1 && arr[2][i] == 3) || (arr[1][i] == 2 && arr[2][i] == 1) || ((arr[1][i] == 3 && arr[2][i] == 2))) {
                System.out.println("A");
            }
        }
    }
}
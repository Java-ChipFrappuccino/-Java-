package sec06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 3. 크레인 인형뽑기(카카오)
public class Exam03 {
    public static void main(String[] args) {
        Exam03 exam = new Exam03();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) moves[i] = sc.nextInt();
        exam.solution(board, moves);
    }

    public void solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int PopCount = 0;
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    int temp = board[i][move - 1];
                    board[i][move - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        stack.pop();
                        PopCount += 2;
                    } else {
                        stack.push(temp);
                    }
                    break;
                }
            }
        }
        System.out.println(PopCount);
    }
}


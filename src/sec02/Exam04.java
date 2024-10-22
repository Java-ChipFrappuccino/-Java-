package sec02;

import java.util.Scanner;

// 4. 단어 뒤집기
public class Exam04 {
    public static void main(String[] args) {
        Exam04 exam04 = new Exam04();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] strArr = new String[num];

        for (int i = 0; i < num; i++) {
            strArr[i] = sc.nextLine();
        }

        exam04.solution(num, strArr);

    }

    public void solution(int num, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < num) {
            sb.append(new StringBuilder(strArr[count]).reverse())
                    .append("\n");
            count++;
        }

        System.out.println(num + "개의 단어");
        System.out.println(sb.toString());
    }
}

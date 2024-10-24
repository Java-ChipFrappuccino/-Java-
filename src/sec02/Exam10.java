package sec02;

import java.util.Arrays;
import java.util.Scanner;

// 10. 가장 짧은 문자거리
public class Exam10 {
    public static void main(String[] args) {
        Exam10 exam10 = new Exam10();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        exam10.solution(s , t);
    }

//    public void solution(String s, String t) {
//        StringBuilder sb = new StringBuilder();
//        char[] chars = s.toCharArray();
//        int count = s.length();
//        for (int i = 0; i < chars.length; i++) {
//            count = s.length();
//            for (int j = 0; j < chars.length; j++) {
//                if (chars[j] == t.charAt(0) && Math.abs(i - j) <= count) {
//                    count = Math.abs(i - j);
//                }
//                if (j == chars.length - 1) {
//                    sb.append(count)
//                            .append(" ");
//                }
//            }
//        }
//        System.out.println(sb.toString());
//    }

    public void solution(String s, String t) {
        char[] chars = s.toCharArray();
        int[] intArr = new int[chars.length];
        int count = 1000;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == t.charAt(0)) {
                count = 0;
                intArr[i] = count;
            } else {
                count++;
                intArr[i] = count;
            }
        }
        count = 1000;
        for (int j = chars.length - 1; j >= 0; j--) {
            if (chars[j] == t.charAt(0)) {
                count = 0;
                intArr[j] = Math.min(intArr[j] , count);
            } else {
                count++;
                intArr[j] = Math.min(intArr[j] , count);
            }
        }
        System.out.println(Arrays.toString(intArr));

    }
}

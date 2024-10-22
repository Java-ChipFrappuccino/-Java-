package sec02;

import java.util.Scanner;

// 인프런 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비
// https://www.inflearn.com/course/%EC%9E%90%EB%B0%94-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-%EC%BD%94%ED%85%8C%EB%8C%80%EB%B9%84#curriculum

// 1. 문자 찾기
public class Exam01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String string = sc.nextLine();
        String ch = sc.nextLine();
//        ch.toLowerCase();
        char[] chArr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (ch.toLowerCase().equals(String.valueOf(chArr[i]).toLowerCase())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
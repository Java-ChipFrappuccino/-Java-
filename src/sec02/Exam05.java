package sec02;

import java.util.Scanner;

// 5. 특정 문자 뒤집기
public class Exam05 {
    public static void main(String[] args) {
        Exam05 exam05 = new Exam05();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        exam05.solution(str);
    }

    public void solution(String str) {
        char[] strArr = str.toCharArray();
        String reverse = new StringBuilder(str.replaceAll("[^a-zA-Z]","")).reverse().toString();
        char[] reverseArr = reverse.toCharArray();
        int counter = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (Character.isLetter(strArr[i])) {
                strArr[i] = reverseArr[counter];
                counter++;
            }
        }
        System.out.println(new String(strArr));
    }
}

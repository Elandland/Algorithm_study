import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt =0;

        for(int i=0; i<str.length(); i++) {          // 뒤에가 =,-,j일때로 나눠서 할랬으나 인덱스 값이 -로 가버려서 오류 발생할 것같아 취소
            if (i + 1 < str.length()) {             //i가 마지막인데 i+1을 참조할 것을 방지
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == '-' || str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                    } else
                        cnt++;
                } else if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                    } else if (str.charAt(i + 1) == 'z'&&i+2<str.length()) {        //i+1이 마지막인데 i+2를 참조할 것을 방지
                        if (str.charAt(i + 2) == '=') {
                            cnt++;
                            i += 2;
                        } else
                            cnt++;
                    } else
                        cnt++;

                } else if (str.charAt(i) == 'l') {
                    if (str.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                    } else
                        cnt++;
                } else if (str.charAt(i) == 'n') {
                    if (str.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                    } else
                        cnt++;
                } else if (str.charAt(i) == 's') {
                    if (str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                    } else
                        cnt++;
                } else if (str.charAt(i) == 'z') {
                    if (str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                    } else
                        cnt++;
                } else
                    cnt++;
            }
            else
                cnt++;
        }
        System.out.printf("%d",cnt);
    }
}

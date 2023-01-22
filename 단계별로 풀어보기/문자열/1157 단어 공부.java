import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char ans='?';
        int arr[] = new int[26];        //빈도 저장
        String str = sc.next();     //next로 문자열 입력 받음

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){       //문자가 대문자 라는 뜻
                arr[str.charAt(i)-65]++;
            }
            else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){        //문자가 소문자라는 뜻
                arr[str.charAt(i)-97]++;
            }

        }
        int max = -1;       //0이면 처음부터 else if에 걸림. (이부분 처음에 0으로 했다가 오류)
        for(int i=0; i<26; i++){
            if(arr[i]>max){
                max = arr[i];
                ans = (char) (i+'A');
            }
            else if(arr[i]==max){
                ans = '?';
            }
        }

        System.out.printf("%c",ans);
    }
}

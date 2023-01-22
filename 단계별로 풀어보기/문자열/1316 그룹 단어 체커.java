import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt=0;        //그룹 단어 갯수 체크
        for(int i =0; i<N; i++){
            int arr[] = new int[26];
            String word = sc.next();

            for(int j=0; j<word.length(); j++)
            {
                if(j+1<word.length()) {             //문자열에서 문자가 바뀔때 마다 해당 알파벳 위치에 1씩 추가
                    if ((word.charAt(j) != word.charAt(j + 1))) {
                        arr[word.charAt(j) - 97]++;
                    }
                }
                else if (j==word.length()-1)    //index상 마지막 단어는 그냥 1추가(기존에 안나온거면 상관x)
                    arr[word.charAt(j)-97]++;
            }
            int cnt2=0;
            for(int k=0; k<26; k++){      //알파벳이 2번이상 나온 값이 있을 경우 cnt 올리지 않음
                if(arr[k]>1) {
                    cnt2++;
                }
            }
            if(cnt2==0){
                cnt++;
            }
        }
        System.out.printf("%d",cnt);
    }
}

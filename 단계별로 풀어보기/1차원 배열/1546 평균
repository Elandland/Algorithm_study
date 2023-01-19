import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float max,ans=0;
        float [] arr= new float[N];          //N개 길이의 배열 생성

        for(int i=0; i<N; i++)
            arr[i] = sc.nextFloat();      //N개의 과목 갯수 만큼 성적 입력

        Arrays.sort(arr);
        max = arr[arr.length-1];

        for(int k=0; k<N; k++) {
            ans += arr[k]/max*100;
        }

        ans /=N;

        System.out.println(ans);

    }


}

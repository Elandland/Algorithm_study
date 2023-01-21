import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int C = sc.nextInt();       //testcase 갯수

    for(int i=0; i<C; i++)
    {
        int N = sc.nextInt();       //학생 수
        double sum = 0;
        double cnt =0;
        int arr[] = new int[N];

        for(int j=0; j<N; j++){
            arr[j] = sc.nextInt();
            sum += arr[j];

        }
        sum /=N;            //평균

        for(int j=0; j<N; j++){
            if(sum<arr[j]){
                cnt++;
            }
        }
        cnt /=N;            //평균을 넘는 사람 수/전체 수
        cnt *=100;          // 확률로

        System.out.printf("%.3f%%\n",cnt);      //소수 셋째점 반올림, %%로 %기호 출력
        }
    sc.close();
    }

}

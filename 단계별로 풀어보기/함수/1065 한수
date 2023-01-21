import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt =0;
        for(int i=1; i<=N; i++){
            if(ans(i)==1){      //한수일때 cnt증가
               cnt++;
            }
        }
        if(N==1000)       //1000의 경우만 예외를 둔다. 이는 백,십,일의 자리가 000으로 등차이지만 천의 자리가 존재하기 때문. ( 이를 위해 코드를 추가적으로 짜기에는 불필요)
            cnt--;
        System.out.print(cnt);
    }
    public static int ans(int X){       //한수 이면 1을 반환 아니면 0을 반환

        int arr[] = new int[3];     //arr[0]는 일의 자리, arr[1]은 십의 자리, arr[2]는 백의 자리로 구성
        for(int i=0; i<3; i++)
        {
            arr[i] = X%10;
            X /= 10;
        }

        if(arr[0] - arr[1] == arr[1] - arr[2])    //세자리 수일 경우 등차인지 확인
        {
            return 1;
        }
        else if(arr[2]==0){       //두자리 수의 경우 모든 수가 등차
            return 1;
        }
        else if((arr[1]==0)&&(arr[2]==0)){      //한자리 수의 경우 모든 수가 등차
            return 1;
        }

        return 0;
    }
}

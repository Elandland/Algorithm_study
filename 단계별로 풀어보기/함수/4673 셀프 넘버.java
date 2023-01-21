public class Main{
    public static void main(String args[]){

        int arr[] = new int[10001];     //10000개짜리 배열 (index를 0부터 10000까지)
        int tmp;

        for(int i=1; i<10001; i++){         //1부터 10000까지 d(n),여기서는 self(n)을 돌려서 안나오는 수를 출력
            tmp = self(i);
            if(tmp<10001){
                arr[tmp] =1;                //d(n)이 나오면 1
            }
        }

        for(int i=1; i<10001; i++){
            if(arr[i]==0)
                System.out.println(i);
        }

    }

    public static int self(int n){          //제시문의 d(n)

        int sum=n;
        while(n!=0){
            sum += n%10;
            n /=10;
        }       //끝나면 sum 이 n+n의 자릿수

        return sum;
    }       //n을 넣으면 d(n)을 출력
}

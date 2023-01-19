import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();           //N은 0보다 크거나 같고 99보다 작은 정수

        int tmp=0, init_N, cnt = 0;

        if (N < 10)
            N = N * 10;

        init_N = N;

        do {
            tmp = N / 10 + N % 10;
            N = (N % 10) * 10 + (tmp%10);
            cnt++;

        } while (init_N != N);


        System.out.print(cnt);

    }

}

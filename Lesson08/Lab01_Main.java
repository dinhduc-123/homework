import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab01_Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("input.txt");
        Scanner sc = new Scanner(file);
        

        int T = sc.nextInt();
        HinhChuNhat a[] = new HinhChuNhat[100];
        HinhVuong b[] = new HinhVuong[100];
        int count = 1;
        while (T-- != 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();

            for (int i = 0; i < M; i++) {
                double dai = sc.nextDouble();
                double rong = sc.nextDouble();
                a[i] = new HinhChuNhat(dai, rong);
            }

            for (int i = 0; i < N; i++) {
                double canh = sc.nextDouble();
                b[i] = new HinhVuong(canh);
            }

            System.out.printf("CASE #%d\n", count++);
            for (int i = 0; i < P; i++) {
                int n = sc.nextInt();
                a[n].hienThiThongTin();

            }

            for (int i = 0; i < Q; i++) {
                int m = sc.nextInt();
                b[m].hienThiThongTin();
            }
        }

    }
}
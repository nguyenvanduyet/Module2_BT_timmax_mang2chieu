import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số hàng:");
        int x=sc.nextInt();
        System.out.println("nhập số cột:");
        int y=sc.nextInt();
        int[][]arr=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("nhập giá trị của mảng:");
                arr[i][j]=sc.nextInt();
            }

        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int max=arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }


        }
        System.out.println(max);
    }
}

import java.util.Scanner;
public class SS2_Tong_duong_cheo_chinh {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sr = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int hang = sr.nextInt();
        System.out.print("Nhâp số cột: ");
        int cot = sr.nextInt();
        int[][] arr = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tủ arr[" + i + "][" + j + "]= ");
                arr[i][j] = sr.nextInt();
            }
        }
        System.out.println("Ta có mảng hai chiều là:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        if (hang == cot) {
            for (int i = 0; i < hang; i++) {
                for (int j = 0; j < cot; j++) {
                    if (i == j) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("Tổng đường chéo chính = " + sum);
        }else {
            System.out.println("Ma trận không có đường chéo chính!");
    }
    }





}